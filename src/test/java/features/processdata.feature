Feature: Validating ProcessedData API's
  @GetdailyPerformanceData @Regression
  Scenario: Verify whether processed data is retrived successfully with given date range
    Given Verify the processeddata details within a given datarange
    When User calls "getdailyPerformanceData" with "Get" http request
    Then the Api Call is Success with status code 200

  @GetdailyPerformanceDeltaData @Regression
  Scenario: Verify incremental processed data details is retrived successfully
    Given Verify incremental processed data details
    When User calls "getdailyPerformanceDeltaData" with "Get" http request
    Then the Api Call is Success with status code 200
