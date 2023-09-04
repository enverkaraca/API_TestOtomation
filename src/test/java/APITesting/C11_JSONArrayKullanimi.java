package APITesting;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

public class C11_JSONArrayKullanimi {

    /*
    {
    "firstName": "John",
    "lastName": "doe",
    "age": 26,
    "address": {
        "streetAddress": "naist street",
        "city": "Nara",
        "postalCode": "630-0192"
                },
    "phoneNumbers": [
                    {
                        "type": "iPhone",
                        "number": "0123-4567-8888"
                    },
                    {
                        "type": "home",
                        "number": "0123-4567-8910"
                    }
                    ]
    }
     */

@Test
    public void JsonArray(){

    JSONObject ceptel= new JSONObject();
    ceptel.put("tiype","ipone");
    ceptel.put("number","0123-4567-8888");
    System.out.println(ceptel);

    JSONObject evtel= new JSONObject();
    evtel.put("tiype","home");
    evtel.put("number","0123-4567-8910");
    System.out.println(evtel);

    JSONArray phonenumber= new JSONArray();
    phonenumber.put(0,ceptel);
    phonenumber.put(1,evtel);
    System.out.println(phonenumber);

    JSONObject adres= new JSONObject();
    adres.put("streetAddress","naist street");
    adres.put("city", "Nara");
    adres.put("postalCode", "630-0192");
    System.out.println(adres);

    JSONObject kisiBilgisi= new JSONObject();
    kisiBilgisi.put("firstName", "John");
    kisiBilgisi.put("lastName", "doe");
    kisiBilgisi.put("age", 26);
    kisiBilgisi.put("adres",adres);
    kisiBilgisi.put("phonenumber",phonenumber);
    System.out.println(kisiBilgisi);










}
}
