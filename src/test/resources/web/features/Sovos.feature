Feature: As a user i need to add,delete, update and search books in Bookshelf app.

  @Smoke
  Scenario: The user add a book
    Given The user is in Bookshelf page
    When The user click the Add book button
    And The user fill the Title
    And The user fill the Author
    And The user select the Format option
    And The user select the Languages option
    And The user fill the Publication Year option
    And The user fill the Description
    And The  user select the Rating
    And The user clicks the ADD button
    Then The user verify that the data is correctly saved

  @Smoke
  Scenario: The user search a book
    Given The user is in Bookshelf page
    When The user click the Search books button
    And The user fill in the input a Title or Author and press Enter
    Then The user verify that the data is correctly shown


  @Smoke
  Scenario: The user update a book
    Given The user is in Bookshelf page
    When The user click the Search books button
    And The user fill in the input a title or Author and press Enter button.
    And The user click in the result row
    And The user modify the rating
    And The user click SAVE button
    Then The user verify the data is updated


  @Smoke
  Scenario: The user delete a book
    Given The user is in Bookshelf page
    When The user click the Search books button
    And The user fill in the input a title or Author and press Enter button.
    And The user click in the result row
    And The user click DELETE button
    And The user click the confirmation button
    Then The user verify the data is deleted



