package APITesting;

import org.json.JSONObject;
import org.junit.Test;

public class C05_InnerJasonObject {
    /*Asagidaki JSON Objesini olusturup konsolda yazdirin.
    {
“firstname”:“Jim”, “additionalneeds”:“Breakfast”, “bookingdates”:{
“checkin”:“2018-01-01”,
“checkout”:“2019-01-01”
    },
“totalprice”:111, “depositpaid”:true, “lastname”:“Brown”
    }
    */

    @Test
    public void innerJason(){

        JSONObject innerObject= new JSONObject();

        innerObject.put("checkin","2018-01-01");
        innerObject.put("checkout","2019-01-01");

        JSONObject outObje= new JSONObject();
        outObje.put("firstname","Jim");
        outObje.put("additionalneeds","Breakfeast");
        outObje.put("bookingdates",innerObject);
        outObje.put("totalprice",111);
        outObje.put("depositpaid",true);
        outObje.put("lastname","Brown");

        System.out.println("Iciceobje= "+outObje);

        }



    }



