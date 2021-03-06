Feature: Register Form Validity format

  @Smoke
  Scenario: Validiy format in register form
    Given browser window is open
    And user navigate to url "https://stockbit.com/"
    And click menu with name "Sign Up"
    When click menu with name "Register with Email"
    And Input Text with label "Your Name" and fill "My Name"
    And Input Text with label "Your Email" and fill "My Email"
    And Input Text with label "Username" and fill "My Username"
    And Input Text with label "Password" and fill "My Password"
    And Input Text with label "Confirm Password" and fill "Confirm Password"
    And click button with value "Register"
    Then Verify Show Text is "Format email salah"
    And Verify Show Text is "value hanya dapat menggunakan huruf dan angka"
    And Verify Show Text is "Password does not match"
