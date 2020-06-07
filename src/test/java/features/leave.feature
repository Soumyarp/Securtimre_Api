Feature: Validate Leave API's
  @GetLeaveBalance @Regression
  Scenario: Verify the Leave balance is retrived successfully
    Given Verify leave balance details
    When User calls "getleaveBalance" with "Get" http request
    Then the Api Call is Success with status code 200

  @GetLeaveTransaction @Regression
  Scenario: Verify the Leave transaction data is retrived successfully for every users
    Given Verify leave transaction details for individual users
    When User calls "getleaveTransactionsData" with "Get" http request
    Then the Api Call is Success with status code 200