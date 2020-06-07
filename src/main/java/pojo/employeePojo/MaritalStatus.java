package pojo.employeePojo;

public enum MaritalStatus {
    SINGLE("SINGLE"),
    MARRIED("MARRIED"),
    DIVORCED("DIVORCED ");

    private String maritalStatus;

    MaritalStatus(String maritalStatus){
        this.maritalStatus=maritalStatus;
    }

    public String getMaritalStatus(){
        return maritalStatus;
    }



}
