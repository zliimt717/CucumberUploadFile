Feature:
  Scenario: File Upload
    Given User launchs the browser
    When  User opens URL "https://the-internet.herokuapp.com/upload"
    Then  Click on choose file
    Then  Click on submit file
    Then   Check the sent file,Close the browser