package resources;

import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Utils {
 public static RequestSpecification requestSpecification;

    public RequestSpecification requestSpecification() throws IOException {
        if(requestSpecification==null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
            requestSpecification = new RequestSpecBuilder().setBaseUri(getEnvironmentValue("baseUri")).setRelaxedHTTPSValidation().
                    addFilter(RequestLoggingFilter.logRequestTo(log)).
                    addFilter(ResponseLoggingFilter.logResponseTo(log)).
                    addHeader("Content-Type", getEnvironmentValue("content-type")).
                    addHeader("x-apiKey", getEnvironmentValue("apikey")).
                    addHeader("x-secret", getEnvironmentValue("apivalue")).build();
            return requestSpecification;
        }
        return requestSpecification;
    }

    public static String getEnvironmentValue(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\environment.properties");
        properties.load(fileInputStream);
        return properties.getProperty(key);

    }

    public static List<Map<String, String>> datatable(DataTable table){
        return table.asMaps(String.class, String.class);
    }

    public String getJsonValue(Response response, String key){
        String res=response.asString();
        JsonPath jsonPath= new JsonPath(res);
        return jsonPath.get(key);

    }
}
