package core.API;

import dev.failsafe.internal.util.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.greaterThan;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
