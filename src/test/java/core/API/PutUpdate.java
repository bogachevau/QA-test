package core.API;

import core.API.pojo.ResponsePut;
import core.API.pojo.UserNameJob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 PUT /api/users/2

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что ответ не пустой
 **/
public class PutUpdate {
    @Test
    public void testPutUpdate() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        UserNameJob user = new UserNameJob("morpheus", "zion resident");
        ResponsePut response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(ResponsePut.class);

        Assertions.assertNotNull(response);
    }
}
