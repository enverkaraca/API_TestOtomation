package APITesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C10_Post_JsonPath {

    /*https://restful-booker.herokuapp.com/booking url’ine asagidaki body’ye sahip bir POST
request gonderdigimizde
{
“firstname” : “Ahmet”, “lastname” : “Bulut”, “totalprice” : 500, “depositpaid” : false, “bookingdates” : {
“checkin” : “2021-06-01”,
“checkout” : “2021-06-10”
},
“additionalneeds” : “wi-fi”
}
donen Response’un,
status code’unun 200,
ve content type’inin application-json, ve response body’sindeki
“firstname”in,“Ahmet”, ve “lastname”in, “Bulut”,
ve “totalprice”in,500,
ve “depositpaid”in,false,
ve “checkin” tarihinin 2021-06-01 ve “checkout” tarihinin 2021-06-10 ve “additionalneeds”in,“wi-fi” olduğunu test edin (edited) */

    @Test
    public void jsonPath(){

        String url="https://restful-booker.herokuapp.com/booking";

        JSONObject reqBody=new JSONObject();
        reqBody.put("checkin", "2021-06-01");
        reqBody.put("checkout","2021-06-10");
        JSONObject reqBody2=new JSONObject();

        reqBody2.put("firstname","Ahmet");
        reqBody2.put("lastname","bulut");
        reqBody2.put("totalPrice",500);
        reqBody2.put("depositPaid",false);
        reqBody2.put("bookingdates",reqBody);
        reqBody2.put("additionalneeds","wi-fi");

        Response response=given()
                .contentType(ContentType.JSON)
                .when()
                .body(reqBody2.toString()).post(url);

//4-


    }

}
