package core.API;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/** Ваша задача - автоматизировать запрос эндпоинта
 GET /api/users/2

 Requirements:
 1. ID пользователя - задается параметром
 2. Запрос использует функционал Specification
 3. Присутствует проверка на код ответа
 4. Присутствует проверка на совпадение с Json schema ответа
 5. Email из ответа должен совпадать с ожидаемым
 **/
public class GetSingleUser {
    private final static String ID_USER = "2";

    @Test
    public void testGetSingleUser() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        String emailUser = "janet.weaver@reqres.in";
        given()
                .when()
                .get("api/users/" + ID_USER)
                .then().log().all()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemaGetSingleUser.json"));
    }
}
