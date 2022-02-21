@Portal @NotImplemented
Feature: User Registers through the portal

  Scenario Outline : User validates the password in thr portal
    Given User fills the registerion forvm
    When  User enters the "<password>"
    And  User Re enters the "<retypePassword>" and submit registration
    Then  I validate for "<Error Message>"

    Examples:
      | password | retypePassword | Error Message                                           |
      | sdf      | sdf            | The minimum length is 6 characters                      |
      | 123      | 123            | The minimum length is 6 characters                      |
      | s123_    | s123_          | The minimum length is 6 characters                      |
      | sdfwer   | sdfwer         | Should have at least one number and a special character |
      | 123456   | 123456         | Should have at least one letter and a special character |
      | 123456   | 123476         | Both fields must match                                  |


