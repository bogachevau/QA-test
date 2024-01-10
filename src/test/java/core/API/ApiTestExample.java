package core.API;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ниже находится базовый пример теста на restAssured **/
public class ApiTestExample {

    @Test
    public void FirstApiTest() {
        given()
                .when()
                .get("https://google.com")
                .then()
                .assertThat().statusCode(200);
    }
}
