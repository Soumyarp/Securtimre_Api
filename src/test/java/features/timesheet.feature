Feature: Validating Timesheet API's

  @CreateTimeSheet @Regression
  Scenario:Verify whether TimeSheet is created successfully
    Given Create TimeSheet with given parameters
      |affiliateName|master|name|
      |AAAOH1| PROJECT |Testapiproject2|
    When User calls "createTimesheet" with "Post" http request
    Then the Api Call is Success with status code 200

    @UpdateTimeSheet @Regression
      Scenario: Verify whether TimeSheet is updated Successfully
      Given Update TimeSheet payload with data
        |affiliateName|master|name|status|
        |AAAOH1| PROJECT |Testapiproject2|INACTIVE|
      When User calls "updatetimesheet" with "Put" http request
      Then the Api Call is Success with status code 200

      @GetTimeSheetDetails @Regression
        Scenario: Verify whether timesheet details is retrived successfully
        Given Verify the timesheet details
        When User calls "gettimesheetData" with "Get" http request
        Then the Api Call is Success with status code 200



