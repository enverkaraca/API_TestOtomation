package APITesting;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C13_ResponseBodyListKullanimi {
    //http://dummy.restapiexample.com/api/v1/employees url’ine bir GET request yolladigimizda
    //donen Response’in
    //status code’unun 200,
    //ve content type’inin Aplication.JSON, ve response body’sindeki
    //employees sayisinin 24
    //ve employee’lerden birinin “Ashton Cox”
    //	ve girilen yaslar icinde 61,21 ve 35 degerinin oldugunu test edin test edin.

    @Test
    public void listKullanimi(){
        String url="http://dummy.restapiexample.com/api/v1/employees";
        Response response= given().when().get(url);


        System.out.println(url+ response);





    }
}
