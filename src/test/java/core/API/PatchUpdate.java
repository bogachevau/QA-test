package core.API;

import core.API.pojo.UserNameJob;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 PATCH /api/users/2

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что ответ не пустой
 **/
public class PatchUpdate {
    @Test
    public void testPatchUpdate() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        UserNameJob user = new UserNameJob("morpheus", "leader");

        Response response = given()
                .body(user)
                .when()
                .patch("api/users/2")
                .then().log().all()
                .extract().response();
        Assertions.assertNotEquals("", response.getBody().asString());
    }
}
