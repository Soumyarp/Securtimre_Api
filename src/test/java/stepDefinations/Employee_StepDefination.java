package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.employeePojo.EmployeePojo;
import pojo.employeePojo.EmployeeStatus;
import resources.ApiResources;
import resources.TestData;
import resources.Utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import static io.restassured.RestAssured.given;

public class Employee_StepDefination extends Utils {
    RequestSpecification request;
    ResponseSpecification responseSpecification;
    Response response;
    TestData testdata= new TestData();

    @Given("Create Employee Payload with given data")
    public void create_Employee_Payload_with_given_data(DataTable createEmpData) throws IOException {
        List<Map<String,String>> list=Utils.datatable(createEmpData);
        for(Map<String,String> data:list) {
            request = given().spec(requestSpecification()).body(testdata.createEmployeePayload(data.get("affiliateName"),data.get("branchName"),data.get("dateOfJoining"),data.get("dateOfBirth"),data.get("departmentName"),data.get("employeeId"),data.get("employeeName"),data.get("enrollmentId"),data.get("gender"),data.get("roleName")));
        }
    }

    @Given("Update Employee Payload with given data")
    public void update_Employee_Payload_with_given_data(DataTable updateEmpdata) throws IOException {
        List<Map<String, String>> list =Utils.datatable(updateEmpdata);
       for(Map<String,String> data:list){
           request=given().spec(requestSpecification()).body(testdata.updateEmployeePayload(data.get("affiliateName"),data.get("branchName"),data.get("dateOfJoining"),data.get("dateOfBirth"),data.get("departmentName"),data.get("employeeId"),data.get("employeeName"),data.get("employmentStatus"),data.get("enrollmentId"),data.get("gender"),data.get("roleName")));
        }
    }

    @Given("To verify employee details")
    public void to_verify_employee_details() throws IOException {
        request=given().spec(requestSpecification()).queryParam("AffiliateName",getEnvironmentValue("affiliateName")).
                queryParam("BranchName",getEnvironmentValue("branchName")).
                queryParam("EmpLastUpdated",getEnvironmentValue("lastUpdatedTime"));
    }

    @Given("Create TimeSheet with given parameters")
    public void create_TimeSheet_with_given_parameters(DataTable createTimeSheetData) throws IOException {
       List<Map<String,String>> list=Utils.datatable(createTimeSheetData);
       for(Map<String,String> data:list){
          request= given().spec(requestSpecification()).body(testdata.createTimeSheet(data.get("affiliateName"),data.get("master"),data.get("name")));
       }
    }

    @Given("Update TimeSheet payload with data")
    public void update_TimeSheet_payload_with_data(DataTable updateTimeSheetData) throws IOException {
        List<Map<String,String>> list=Utils.datatable(updateTimeSheetData);
        for(Map<String,String> data:list){
            request=given().spec(requestSpecification()).body(testdata.updateTimeSheet(data.get("affiliateName"),data.get("master"),data.get("name"),data.get("status")));
        }
    }

    @When("User calls {string} with {string} http request")
    public void user_calls_with_http_request(String resource, String httpMethod) {
        ApiResources resources=ApiResources.valueOf(resource);
        System.out.println(resources.getResource());
        responseSpecification=new ResponseSpecBuilder().expectStatusCode(200).build();
        if(httpMethod.equalsIgnoreCase("Post")) {
            response = request.when().post(resources.getResource());
        }
        else if(httpMethod.equalsIgnoreCase("Put")){
            response = request.when().put(resources.getResource());
        }
        else if(httpMethod.equalsIgnoreCase("Get")){
            response=request.when().get(resources.getResource());
        }
    }

    @Then("the Api Call is Success with status code {int}")
    public void the_Api_Call_is_Success_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);
    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String keyValue, String expectedValue) {
        assertEquals(getJsonValue(response,keyValue),expectedValue);
    }

    @Given("Verify the timesheet details")
    public void verify_the_timesheet_details() throws IOException {
       request=given().spec(requestSpecification()).queryParam("activity",getEnvironmentValue("activity")).
               queryParam("client",getEnvironmentValue("client")).
               queryParam("dataFrom",getEnvironmentValue("dataFrom")).
               queryParam("empId",getEnvironmentValue("empId")).
               queryParam("project",getEnvironmentValue("project"));
    }

    @Given("Verify the rawpunch details within a given datarange")
    public void verify_the_rawpunch_details_within_a_given_datarange() throws IOException {
        request=given().spec(requestSpecification()).queryParam("empid",getEnvironmentValue("empid1"))
                .queryParam("startDate",getEnvironmentValue("startDate"))
                .queryParam("endDate",getEnvironmentValue("endDate"));
    }

    @Given("Verify incremental rawpunch  details")
    public void verify_incremental_rawpunch_details() throws IOException {
        request=given().spec(requestSpecification()).queryParam("empid",getEnvironmentValue("empid1"))
                .queryParam("punchesFrom",getEnvironmentValue("punchesFrom"));

    }

    @Given("Verify incremental rawpunch  details with given limit")
    public void verify_incremental_rawpunch_details_with_given_limit() throws IOException {
        request=given().spec(requestSpecification()).queryParam("empid",getEnvironmentValue("empid1"))
                .queryParam("punchesFrom",getEnvironmentValue("punchesFrom"));
    }

    @Given("Verify the processeddata details within a given datarange")
    public void verify_the_processeddata_details_within_a_given_datarange() throws IOException {
        request=given().spec(requestSpecification()).queryParam("empid",getEnvironmentValue("empId"))
                .queryParam("startDate",getEnvironmentValue("startDate"))
                .queryParam("endDate",getEnvironmentValue("endDate"));
    }

    @Given("Verify incremental processed data details")
    public void verify_incremental_processed_data_details() throws IOException {
        request=given().spec(requestSpecification()).queryParam("empid",getEnvironmentValue("empId"))
                .queryParam("dataFrom",getEnvironmentValue("dataFrom"));
    }

    @Given("Verify leave balance details")
    public void verify_leave_balance_details() throws IOException {
        request=given().spec(requestSpecification());
    }

    @Given("Verify leave transaction details for individual users")
    public void verify_leave_transaction_details_for_individual_users() throws IOException {
       request=given().spec(requestSpecification()).queryParam("empID",getEnvironmentValue("empID"))
               .queryParam("leaveFrom",getEnvironmentValue("leaveFrom"));
    }


}
