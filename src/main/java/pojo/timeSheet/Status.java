package pojo.timeSheet;

public enum Status {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE ");

    private String status;
    Status(String status){
        this.status=status;
    }
    public String Status(){
        return status;
    }
}
