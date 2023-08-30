package APITesting;

import org.json.JSONObject;
import org.junit.Test;

public class C04_JSONObjesiOlusturma {

    @Test
    public void JsonObjeOlusturma(){

        JSONObject ilkJsonObje= new JSONObject();

       ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("User","ID");
        System.out.println(ilkJsonObje);



    }

}
