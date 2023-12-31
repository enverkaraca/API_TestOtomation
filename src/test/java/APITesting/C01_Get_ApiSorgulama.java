package APITesting;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {
    /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/10 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.
 */
    //1.url belirlenip gidilecek
    //2. expected data belirlenecek
    //3. actual data alinacak
    //4. Assertion islemi yapilacak

    @Test
    public void  get01(){
        //1.url belirlenip gidilecek
        String url="https://restful-booker.herokuapp.com/booking/83";

        //2. expected data belirlenecek
        //3. actual data alinacak
        Response response=given().when().get(url);

        //4. Assertion islemi yapilacak
        response.prettyPrint();

        System.out.println("Status cod  "+response.getStatusCode());
        System.out.println("Content Typ  "+response.getContentType());
        System.out.println("Header: "+ response.getHeader("Server"));
        System.out.println("Status Line: "+response.getStatusLine());
        System.out.println(" Response Time: "+ response.getTime());

    }
}
