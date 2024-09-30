package core.API;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/** Ваша задача - автоматизировать запрос эндпоинта
 GET /api/users?page=2

 Requirements:
 1. Номер страницы - задается параметром
 2. Запрос использует функционал Specification
 3. Присутствует проверка на код ответа
 4. Присутствует проверка на совпадение с Json schema ответа
 **/
public class GetListUsers {
    private final static String PAGE_NUMBER = "2";
    @Test
    public void testApiGetListUser() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        given()
                .when()
                .get("api/users?page=" + PAGE_NUMBER)
                .then()
                .log().all()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemaGetListUsers.json"));


    }
}
