package pojo.timeSheet;

public enum Master {
    PROJECT("PROJECT"),
    ACTIVITY("ACTIVITY"),
    CLIENT("CLIENT ");

    private String master;

    Master(String master){
        this.master=master;
    }
    public String getMasterValue(){
        return master;
    }

}
