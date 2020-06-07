package pojo.employeePojo;

public enum EmployeeStatus {
    ACTIVE("ACTIVE"),
    TERMINATED("TERMINATED"),
    ABSCONDING("ABSCONDING"),
    RESIGNED("RESIGNED"),
    SEPARATED("SEPARATED");

    private String status;

    EmployeeStatus(String status){
        this.status=status;
    }

    public String getEmploymentStatus(){
        return status ;
    }
}
