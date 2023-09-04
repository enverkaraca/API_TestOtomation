package APITesting;

import org.json.JSONObject;
import org.junit.Test;

public class C12_JSONPathIleBodyTesti {
/*
C09_Post_JsonPathIleBodyTesti
https://restful-booker.herokuapp.com/booking url’ine asagidaki body'ye sahip bir POST
request gonderdigimizde
{
"firstname" : "Ahmet",
"lastname" : “Bulut",
"totalprice" : 500,
"depositpaid" : false,
"bookingdates" : {
"checkin" : "2021-06-01",
"checkout" : "2021-06-10"
},
"additionalneeds" : "wi-fi"
}
donen Response’un,
status code’unun 200,
ve content type’inin application-json,
ve response body’sindeki
"firstname“in,"Ahmet",
ve "lastname“in, "Bulut",
ve "totalprice“in,500,
ve "depositpaid“in,false,
ve "checkin" tarihinin 2021-06-01
ve "checkout" tarihinin 2021-06-10
ve "additionalneeds“in,"wi-fi"
oldugunu test edin
 */

    @Test
    public void JsonIleBodyTesti(){
        JSONObject innerData= new JSONObject();

        String url="https://restful-booker.herokuapp.com/booking";
        innerData.put("checkin" , "2021-06-01");
        innerData.put("checkout" , "2021-06-10");


        }

        }




