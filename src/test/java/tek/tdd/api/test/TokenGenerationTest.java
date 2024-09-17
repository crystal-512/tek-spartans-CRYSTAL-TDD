package tek.tdd.api.test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import tek.tdd.base.ApiTestBase;

import java.util.HashMap;
import java.util.Map;

public class TokenGenerationTest extends ApiTestBase {
    private static final Logger LOGGER = LogManager.getLogger(TokenGenerationTest.class);

    //Create a test validate token generated with supervisor User
    @Test
    public void generateValidToken() {
        RequestSpecification requestSpecification = getDefaultRequest();
        Map<String, String> body = new HashMap<>();
        body.put("username", "supervisor");
        body.put("password", "tek_supervisor");

        requestSpecification.body(body);

        //Send request to /api/token
        Response response = requestSpecification.when().post("/api/token");
        response.then().statusCode(200);

        LOGGER.info("Response is {}", response.asPrettyString());
    }

    //Activity generate token with operator user
}

