Feature: Validating Employee API's
  @AddEmployee @Regression @Smoke
  Scenario: Verify if employee is being successfully added
    Given Create Employee Payload with given data
      |affiliateName|branchName| dateOfJoining | dateOfBirth| departmentName |employeeId|employeeName|enrollmentId|gender|roleName|
    #  |Lnt Infotech|Dubai|2019-06-01|2012-01-01|IT|400620|testname006|en400620|MALE|Employee|
      |Securax test|bangalore|2019-06-01|2012-01-01|DEL - Software Product|400620|testname006|en400620|MALE|Employee|


    When User calls "createEmployeeApi" with "Post" http request
    Then the Api Call is Success with status code 200
    And "employeeId" in response body is "400620"
  #  And "name" in response body is "testname003"
    #And "employeeName" in responseBody is same as the given name


  @UpdateEmployee @Regression  @Smoke
  Scenario: Verify if employee is being successfully updated
    Given Update Employee Payload with given data
      |affiliateName|branchName| dateOfJoining | dateOfBirth| departmentName |employeeId|employeeName|employmentStatus|enrollmentId|gender|roleName|
     # |Lnt Infotech|Dubai|2019-06-01|2012-01-01|IT|400620|testname006|ACTIVE|en400620|FEMALE|Employee |
      |Securax test|bangalore|2019-06-01|2012-01-01|DEL - Software Product|400620|testname006|ACTIVE|en400620|FEMALE|Employee |
    When User calls "updateEmployeeApi" with "Put" http request
    Then the Api Call is Success with status code 200

  @GetEmployeeDetails @Regression @Smoke
  Scenario: Verify if Employee is being successfully retrived
    Given To verify employee details
    When User calls "getEmployeeDetailsByLastUpdated" with "Get" http request
    Then the Api Call is Success with status code 200


