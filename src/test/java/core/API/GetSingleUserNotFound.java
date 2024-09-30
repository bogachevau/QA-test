package core.API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


/** Ваша задача - автоматизировать запрос эндпоинта
 GET /api/users/23

 Requirements:
 1. ID пользователя - задается параметром
 2. Запрос использует функционал Specification
 3. Присутствует проверка на код ответа
 4. Присутствует проверка что ответ - пустой
 **/
public class GetSingleUserNotFound {
    private final static String ID_USER = "23";

    @Test
    public void testGetSingleUserNotFound() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecError404());
        Response response = given()
                .when()
                .get("/api/users/" + ID_USER)
                .then().log().all()
                .extract().response();
        Assertions.assertEquals("{}", response.getBody().asString());
    }
}
