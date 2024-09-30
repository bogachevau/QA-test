package core.API;

import core.API.pojo.UnsuccessfulLoginRegisterResponse;
import core.API.pojo.UserLogin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 POST /api/login в случае с неуспешной авторизацией

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что в ответе пришла ошибка
 **/
public class PostLoginUnsucessful {
    @Test
    public void testPostLoginUnsuccessful() {
        Specifications.installSpecification(Specifications.requestSpec(),Specifications.responseSpecError400());
        UserLogin userLogin = new UserLogin("sydney@fife");
        String error = "Missing password";
        UnsuccessfulLoginRegisterResponse response = given()
                .body(userLogin)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().body().as(UnsuccessfulLoginRegisterResponse.class);

        Assertions.assertEquals(error, response.getError());
    }
}
