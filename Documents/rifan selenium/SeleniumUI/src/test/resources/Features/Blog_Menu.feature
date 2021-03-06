Feature: feature to test Blog Menu

  @Smoke
  Scenario: Open Main Menu with name Stockbit Snip
    Given browser window is open
    And user navigate to url "https://stockbit.com/"
    And click menu with name "Blog"
    Then Verify title in new tab is "Stockbit Snips"
    And Verify all element Blog menu is exist

  @Smoke
  Scenario: Open Main Menu with name Open Stockbit
    Given browser window is open
    And user navigate to url "https://stockbit.com/"
    And click menu with name "Blog"
    And click menu with href "https://stockbit.com/"
    Then Verify all element Home menu is exist
