Feature: feature to About Us functionality

  @Smoke
  Scenario: Open About Us Menu with name Pro Tools
    Given browser window is open
    And user navigate to url "https://stockbit.com/"
    And click menu with name "About Us"
    Then Verify title is "About Us | Stockbit - Komunitas Saham Indonesia"
    And Verify all element About Us menu is exist