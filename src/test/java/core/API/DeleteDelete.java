package core.API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

/** Ваша задача - автоматизировать запрос эндпоинта
 DELETE /api/users/2

 Requirements:
 1. Запрос использует функционал Specification
 2. Присутствует проверка на код ответа
 3. Тело запроса создается на уровне POJO-класса
 4. Присутствует проверка, что ответ пустой
 **/
public class DeleteDelete {
    @Test
    public void testApiDelete() {
        Specifications.installSpecification(Specifications.requestSpec(), Specifications.responseSpecOk204());
        Response response = given()
                .when()
                .delete("api/users/2")
                .then().log().all()
                .extract().response();
        Assertions.assertEquals("", response.getBody().asString());

    }
}
