Feature: feature to test Pro tools Menu

  @Smoke
  Scenario: Open Main Menu with name Pro Tools
    Given browser window is open
    And user navigate to url "https://stockbit.com/"
    And click menu with name "Pro Tools"
    Then Verify title is "Stockbit - Professional Tools Saham Bahkan Untuk Pemula"
    And Verify all element Pro Tools menu is exist