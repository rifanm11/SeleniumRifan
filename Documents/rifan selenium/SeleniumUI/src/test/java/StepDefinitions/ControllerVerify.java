package StepDefinitions;


import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class ControllerVerify {
	
	WebDriver driver;
	public ControllerVerify (ShareClass shareClass){
		driver = shareClass.startBrowser();
	}

	@Then("Verify all element Investing menu is exist")
	public void verify_Investing_menu() throws InterruptedException {
		
//		System.out.println("Inside Investing Menu");
		
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Daftar 100% Online']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Tanpa Minimum Deposit']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = '3 Langkah Mudah Investasi Saham di Stockbit']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Biaya Komisi']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fee Beli']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fee Jual']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Grafik Perbandingan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Mudah Digunakan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Keamanan Generasi Terbaru']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Dana Anda Aman']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Personal Customer Support']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fitur Investasi Terlengkap']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Frequently Asked Questions']")).isDisplayed();
		
		// button validation
		driver.findElement(By.xpath("//*[contains(@href,'/register') and text() = 'Buka Rekening Anda']")).isDisplayed();

        // Scrolling down	
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
        Thread.sleep(5000);
		
        //verify Frequently Asked Questions
		driver.findElement(By.xpath("//*[contains(text(),'Apakah ada biaya bulanan?')]//parent::button")).click();
		driver.findElement(By.xpath("//*[text() = 'Tidak ada biaya bulanan yang dikenakan untuk bertransaksi melalui Stockbit.']")).isDisplayed();	
		driver.findElement(By.xpath("//*[contains(text(),'Berapa lama proses pembukaan rekening saham?')]//parent::button")).click();
		driver.findElement(By.xpath("//*[text() = 'Proses pembukaan rekening saham membutuhkan waktu kurang lebih 1 hari kerja.']")).isDisplayed();	

	}
	
	@Then("Verify title is \"(.*)\"$")
	public void validatio_title(String Title) {
				
		String Actual = driver.getTitle();
        String Expected = Title;
        
        Assert.assertEquals("Condition true", Actual, Expected);
		
	}
	
	@Then("Verify title in new tab is \"(.*)\"$")
	public void validatio_title_new_tabs(String Title) {
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
				
		String Actual = driver.getTitle();
        String Expected = Title;

        Assert.assertEquals("Condition true", Actual, Expected);
		
	}
	
	@Then("Verify all element Home menu is exist")
	public void validatio_home_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Investasi Saham Bersama']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Biaya Komisi ']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fee Beli']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fee Jual']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Daftar 100% Online ']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = ' Tanpa Minimum Deposit']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Keuntungan dari Kebersamaan')]")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Lebih Informatif']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Lebih Cepat']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Lebih Seru']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Mudahnya Bertransaksi']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = ' dalam 3 Langkah']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Professional Tools bahkan untuk Pemula']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Berita & Laporan dari Sumber Terpercaya')]")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Smart Notification')]")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Komunitas Saham Terbesar']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Aman & Terpercaya']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Belajar Dulu dengan Virtual Trading']")).isDisplayed();
		
		// button validation
		driver.findElement(By.xpath("//*[contains(@href,'https://stockbit.com/#/register') and text() = 'Mulai Berinvestasi']")).isDisplayed();
		
		
		// validation Key Features
		driver.findElement(By.xpath("//*[contains(@data-tool,'tool-financial') and (@class='fromRightP tools-par')]")).click();
		driver.findElement(By.xpath(".//tbody//tr[@class='fromRightP tools-par active']//td//span[contains(text(),'Data Finansial Yang Lengkap')]")).isDisplayed();
		
		driver.findElement(By.xpath("//*[contains(@data-tool,'tool-screener') and (@class='fromRightP tools-par')]")).click();
		driver.findElement(By.xpath(".//tbody//tr[@class='fromRightP tools-par active']//td//span[contains(text(),'Screener Terbaik')]")).isDisplayed();
		
		driver.findElement(By.xpath("//*[contains(@data-tool,'tool-deviation') and (@class='fromRightP tools-par')]")).click();
		driver.findElement(By.xpath(".//tbody//tr[@class='fromRightP tools-par active']//td//span[contains(text(),'PE Standard Deviation Band')]")).isDisplayed();
		
		driver.findElement(By.xpath("//*[contains(@data-tool,'tool-charting') and (@class='fromRightP tools-par')]")).click();
		driver.findElement(By.xpath(".//tbody//tr[@class='fromRightP tools-par active']//td//span[contains(text(),'Platform Charting Modern')]")).isDisplayed();	

	}
	
	@Then("Verify all element Academy menu is exist")
	public void Verify_academy_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Stockbit Academy']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Belajar investasi saham dari 0 dan GRATIS']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Explore']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Unboxing Saham']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Sektor Properti']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Sektor Kesehatan']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Menara Telekomunikasi')]")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Sektor Perbankan']")).isDisplayed();

	}
	
	@Then("Verify all element Pro Tools menu is exist")
	public void Verify_Pro_Tools_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Professional Tools']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'untuk Pemula']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Pelajari Data Laporan Keuangan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Berbagai Tampilan Periode']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Grafik Tren & Rasio Keuangan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Pertumbuhan Perusahaan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Drag n Drop']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Marjin Perusahaan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'IDR atau USD']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Rasio-rasio Fundamental yang Lengkap']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Bandingkan Data Emiten secara Visual']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Fitur Charting Professional']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Cari Saham sesuai Kriteria Kamu']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Notifikasi Real-Time Saat Harga Kamu Tercapai']")).isDisplayed();		
		driver.findElement(By.xpath("//*[text() = 'Lihat Pergerakan Saham Pada Bulan-bulan Tertentu']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Rangkuman Laba Bersih Perusahaan Setiap Periode']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Bandingkan Data Emiten Satu dengan Lainnya']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Pricing Plan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Berbagai pilihan berlangganan terbaik untuk mendukung kegiatan investasimu']")).isDisplayed();
		
		// button validation
		driver.findElement(By.xpath("//*[contains(@href,'/register') and text() = 'Buka Rekening Anda']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(@href,'/register') and text() = 'Subscribe']")).isDisplayed();
		
		// link validation
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/financials') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/fundachart') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/screener') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/price-alert') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/seasonality') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/earnings') and (@direction='row')]")).isDisplayed();
		driver.findElement(By.xpath("//*[(@href='/info/pro-tools/comparison') and (@direction='row')]")).isDisplayed();
		
	}
	
	@Then("Verify all element About Us menu is exist")
	public void Verify_About_Us_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Informasi Perusahaan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Visi Perusahaan']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Manajemen']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Susunan organisasi']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Hubungi Kami']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'PT Stockbit Sekuritas Digital']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Kontak Utama')]")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'support@stockbit.com']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Telepon']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = '+62 21 50959-330']")).isDisplayed();

	}
	
	@Then("Verify all element Blog menu is exist")
	public void Verify_Blog_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Snips Terbaru']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Investasi']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Unboxing ???? ???? ????']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = '??????? #MusimLaba']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Event']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = '???? Snips Explained ']")).isDisplayed();
		driver.findElement(By.xpath("//*[contains(text(),'Your Daily Snips of Market News')]")).isDisplayed();
		
		//validation button is display
		driver.findElement(By.xpath("//*[contains(@onclick,'submitSubcription()') and contains(text(),'Subscribe')]")).isDisplayed();
		
		//validation Inputt is display
		driver.findElement(By.xpath("//input[(@name='email') and (@placeholder='name@example.com')]")).isDisplayed();
		driver.findElement(By.xpath("//input[(@type='search') and (@placeholder='Search')]")).isDisplayed();

	}
	
	@Then("Verify all element Subscribe menu is exist")
	public void Verify_Subscribe_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[contains(text(),'Your Daily Snips of Market News')]")).isDisplayed();
		
		//validation button is display
		driver.findElement(By.xpath("//*[contains(@onclick,'submitSubcription()') and contains(text(),'Subscribe')]")).isDisplayed();
		
		//validation Inputt is display
		driver.findElement(By.xpath("//input[(@name='email') and (@placeholder='name@example.com')]') and contains(text(),'Subscribe')]")).isDisplayed();

	}
	
	@Then("Verify Success to Login")
	public void Verify_Login_menu() {
			
		//validation text is display
		driver.findElement(By.xpath("//*[text() = 'Berlangganan Pro']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Start Trading']")).isDisplayed();
		driver.findElement(By.xpath("//*[text() = 'Profile']")).isDisplayed();
		
	}
	
	@Then("Verify Show Text is \"(.*)\"$")
	public void Verify_Text_is(String Text) {
			
		//validation text is display
		driver.findElement(By.xpath("//*[contains(text(),'"+Text+"')]")).isDisplayed();
		
	}
	

}
