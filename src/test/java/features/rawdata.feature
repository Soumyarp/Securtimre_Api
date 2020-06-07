Feature: Validating RawData API's
  @GetRawPunches @Regression
  Scenario: Verify whether rawpunch data is retrived successfully with given date range
    Given Verify the rawpunch details within a given datarange
    When User calls "getrawPunches" with "Get" http request
    Then the Api Call is Success with status code 200

  @GetRawDataDeltaPunches @Regression
  Scenario: Verify incremental raw punch details is retrived successfully
    Given Verify incremental rawpunch  details
    When User calls "getRawDataDeltaPunches" with "Get" http request
    Then the Api Call is Success with status code 200

  @GetRawDataDeltaPunchesLimit @Regression
  Scenario: Verify incremental raw punch details is retrived successfully with given limit
    Given Verify incremental rawpunch  details with given limit
    When User calls "getRawDataDeltaPunchesWithLimit" with "Get" http request
    Then the Api Call is Success with status code 200
