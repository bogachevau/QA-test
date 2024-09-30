package core.API;

import core.API.pojo.CreateResponse;
import core.API.pojo.UserNameJob;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 POST /api/users

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что в ответе пришел новый ID пользователя
 **/
public class PostCreate {
    @Test
    public void testPostCreate() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecCreated201());
        UserNameJob user = new UserNameJob("morpheus", "leader");
        String id = "769";
        CreateResponse postResponse = given()
                .body(user)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().body().as(CreateResponse.class);

        Assertions.assertNotEquals(id, postResponse.getId());


    }
}
