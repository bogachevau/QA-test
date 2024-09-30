package core.API;

import core.API.pojo.LoginResponse;
import core.API.pojo.UserLogin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 POST /api/login

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что в ответе пришел токен
 **/
public class PostLoginSuccessful {
    @Test
    public void testPostLoginSuccessful() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk200());
        UserLogin userLogin = new UserLogin("eve.holt@reqres.in", "cityslicka");
        String token = "QpwL5tke4Pnpja7X4";
        LoginResponse loginResponse = given()
                .body(userLogin)
                .when()
                .post("api/login")
                .then().log().all()
                .extract().body().as(LoginResponse.class);
        int i = 0;
        Assertions.assertEquals(token, loginResponse.getToken());
    }
}
