package resources;

import pojo.employeePojo.EmployeePojo;
import pojo.employeePojo.UpdateEmployeePojo;
import pojo.timeSheet.CreateTimeSheet;
import pojo.timeSheet.UpdateTimeSheet;

public class TestData {

    public EmployeePojo createEmployeePayload(String affName, String branchName, String doj, String dob, String deptName,String empId, String empName,String enrollId, String gender,String role){
       EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setAccountType("");
        employeePojo.setAffiliateName(affName);
        employeePojo.setAutoShiftEligibility(false);
        employeePojo.setBank("");
        employeePojo.setBankBranchName("");
        employeePojo.setBank_ac_No("");
        employeePojo.setBranchName(branchName);
        employeePojo.setCategoryName("Contract");
        employeePojo.setCity("");
        employeePojo.setCustomMasterName("");
        employeePojo.setDateOfBirth(dob);
        employeePojo.setDateOfJoining(doj);
        employeePojo.setDepartmentName(deptName);
        employeePojo.setDesignationName("QA");
        employeePojo.setEmail("");
        employeePojo.setEmergencyContactNumber("");
        employeePojo.setEmployeeId(empId);
        employeePojo.setEmployeeName(empName);
        employeePojo.setEnrollmentId(enrollId);
        employeePojo.setGender(gender);
        employeePojo.setiFSCCode("");
        employeePojo.setManagerEmployeeId("");
        employeePojo.setMaritalStatus("SINGLE");
        employeePojo.setMobile("");
        employeePojo.setMobileUser(false);
        employeePojo.setNationalId("");
        employeePojo.setOtEligibility(false);
        employeePojo.setPanNumber("");
        employeePojo.setPassportExpiryDate("");
        employeePojo.setPassportNumber("");
        employeePojo.setPersonalAddress("");
        employeePojo.setPersonalEmailId("");
        employeePojo.setPfNumber(0);
        employeePojo.setPinCode("");
        employeePojo.setRoleName(role);
        employeePojo.setSendWelcomeEmail(false);
        employeePojo.setUserName("");
        employeePojo.setVisaExpiryDate("");
        employeePojo.setVisaNumber("");

        return employeePojo;
    }

    public UpdateEmployeePojo updateEmployeePayload(String affName, String branchName, String doj, String dob, String deptName,String empId, String empName,String status,String enrollId, String gender,String role){
      UpdateEmployeePojo updateEmployeePojo = new UpdateEmployeePojo();
        updateEmployeePojo.setAccountType("");
        updateEmployeePojo.setAffiliateName(affName);
        updateEmployeePojo.setAutoShiftEligibility(false);
        updateEmployeePojo.setBank("");
        updateEmployeePojo.setBankBranchName("");
        updateEmployeePojo.setBank_ac_No("");
        updateEmployeePojo.setBranchName(branchName);
        updateEmployeePojo.setCategoryName("");
        updateEmployeePojo.setCity("");
        updateEmployeePojo.setCustomMasterName("");
        updateEmployeePojo.setDateOfBirth(dob);
        updateEmployeePojo.setDateOfJoining(doj);
        updateEmployeePojo.setDepartmentName(deptName);
        updateEmployeePojo.setDesignationName("");
        updateEmployeePojo.setEmail("");
        updateEmployeePojo.setEmergencyContactNumber("");
        updateEmployeePojo.setEmployeeId(empId);
        updateEmployeePojo.setEmployeeName(empName);
        updateEmployeePojo.setEmploymentStatus(status);
        updateEmployeePojo.setEnrollmentId(enrollId);
        updateEmployeePojo.setGender(gender);
        updateEmployeePojo.setiFSCCode("");
        updateEmployeePojo.setLastDateOfEmployment("");
        updateEmployeePojo.setManagerEmployeeId("");
        updateEmployeePojo.setMaritalStatus("SINGLE");
        updateEmployeePojo.setMobile("");
        updateEmployeePojo.setMobileUser(false);
        updateEmployeePojo.setNationalId("");
        updateEmployeePojo.setOtEligibility(false);
        updateEmployeePojo.setPanNumber("");
        updateEmployeePojo.setPassportExpiryDate("");
        updateEmployeePojo.setPassportNumber("");
        updateEmployeePojo.setPersonalAddress("");
        updateEmployeePojo.setPersonalEmailId("");
        updateEmployeePojo.setPfNumber(0);
        updateEmployeePojo.setPinCode("");
        updateEmployeePojo.setReasonForLeaving("");
        updateEmployeePojo.setRoleName(role);
        updateEmployeePojo.setUserName("");
        updateEmployeePojo.setVisaExpiryDate("");
        updateEmployeePojo.setVisaNumber("");

        return updateEmployeePojo;

    }

    public CreateTimeSheet createTimeSheet(String affiliateName, String masterName, String name){
        CreateTimeSheet createTimeSheet= new CreateTimeSheet();
        createTimeSheet.setAffiliateName(affiliateName);
        createTimeSheet.setMaster(masterName);
        createTimeSheet.setName(name);

        return createTimeSheet;
    }

    public UpdateTimeSheet updateTimeSheet(String affiliateName, String masterName, String name, String status){
        UpdateTimeSheet updateTimeSheet= new UpdateTimeSheet();
        updateTimeSheet.setAffiliateName(affiliateName);
        updateTimeSheet.setMaster(masterName);
        updateTimeSheet.setName(name);
        updateTimeSheet.setStatus(status);

        return updateTimeSheet;
    }

}
