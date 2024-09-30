package core.API;

import core.API.pojo.SuccessfulRegister;
import core.API.pojo.UserLogin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 POST /api/register в случае с успешной регистрацией

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что в ответе пришел новый ID пользователя
 **/
public class PostRegisterSuccessful {
    @Test
    public void testPostRegisterSuccessful() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        UserLogin userLogin = new UserLogin("eve.holt@reqres.in", "pistol");
        Integer id = 4;
        SuccessfulRegister response = given()
                .body(userLogin)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(SuccessfulRegister.class);

        Assertions.assertEquals(id, response.getId());
    }
}
