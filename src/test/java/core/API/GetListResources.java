package core.API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 GET /api/unknown

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Присутствует проверка что ответ - НЕ пустой
 **/
public class GetListResources {
    @Test
    public void testApiGetListResource() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        Response response = given()
                .when()
                .get("api/unknown")
                .then()
                .log().all()
                .extract().response();

        Assertions.assertNotEquals("", response.getBody().asString());
    }
}


