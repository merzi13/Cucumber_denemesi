Feature: ContactUs test

  Scenario: Go to Website and test Contact Us Page

    Given navigate to Website
    And click on contact us button
    And type name
    And type Email
    And type subject
    And type a message
    When click on send button
    Then verify success message