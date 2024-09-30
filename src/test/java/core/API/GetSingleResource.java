package core.API;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

/** Ваша задача - автоматизировать запрос эндпоинта
 GET /api/unknown

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Присутствует проверка что ответ совпадает с Json Schema
 **/
public class GetSingleResource {
    @Test
    public void testGetSingleResource() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemaGetSingleResource.json"));
    }
}
