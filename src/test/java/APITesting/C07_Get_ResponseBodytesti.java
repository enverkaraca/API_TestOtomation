package APITesting;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C07_Get_ResponseBodytesti {

    /*https://jsonplaceholder.typicode.com/posts/44 url’ine
    bir GET request yolladigimizda
donen Response’in
status code’unun 200,
ve content type’inin Aplication.JSON,
ve response body’sinde bulunan userId’nin 5,
	ve response body’sinde bulunan title’in
	“optio dolor molestias sit” oldugunu test edin.*/

    @Test
    public void getIleBodyTesti(){
        //1-Endpoint hazirlama

        String url="https://jsonplaceholder.typicode.com/posts/44";

        //2-Expected Data

        //3-Response kaydetme
        Response response= given().when().get(url);

        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType("Aplication.JSON; charset=utf-8")
                .body("useId", Matchers.equalTo(5))
                .body("title", Matchers.equalTo("optio dolor molestias sit"));




    }


}
