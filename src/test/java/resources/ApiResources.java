package resources;

public enum  ApiResources {
    createEmployeeApi("/api/employee"),
    updateEmployeeApi("/api/employee/update"),
    getBiometricEmployeeDetails("/api/getBiometricEmployeeDetails"),
    getEmployeeDetailsByLastUpdated("/api/getEmployeeDetailsByLastUpdatedDateTime"),
    createleaveAssignForEmployees("/api/leave-assign"),
    getleaveBalance("/api/leave-balance"),
    getleaveTransactionsData("/api/leave-transactions"),
    createLeaveApplication("/api/leave-transactions"),
    getdailyPerformanceDeltaData("/api/processed-data/daily-delta-performance"),
    getdailyPerformanceData("/api/processed-data/daily-performance"),
    createShiftRosterData("/api/processed-data/save-shift-roster-data"),
    getshiftRosterData("/api/processed-data/shift-roster-data"),
    getRawDataDeltaPunches("/api/raw-data/delta-punches"),
    getRawDataDeltaPunchesWithLimit("/api/raw-data/delta-punches-with-limit"),
    getrawPunches("/api/raw-data/punches"),
    gettimesheetData("/api/timesheet-data"),
    createTimesheet("/api/timesheet/create"),
    updatetimesheet("/api/timesheet/update");

    private String resource;

    ApiResources(String resource){
        this.resource=resource;
    }
    public String getResource(){
        return resource;
    }

}
