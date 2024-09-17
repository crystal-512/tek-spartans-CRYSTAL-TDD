package tek.tdd.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerClassAdapter.class})
public class ApiTestBase {
    private static final Logger LOGGER = LogManager.getLogger(ApiTestsBase.class);

    public RequestSpecification getDefaultRequest() {
        LOGGER.info("Sending API call to {}" , RestAssured.baseURI);
        return RestAssured.given().contentType(ContentType.JSON);
    }
}

