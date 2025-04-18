package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithInHashMap {

    public static void main(String[] args) {
        Map<String, Map<String,String>>mp=new HashMap<>();
        HashMap<String,String> m1=new HashMap<>();
        m1.put("Telangana","Hyderabad");
        m1.put("TamilNadu","Chennai");
        m1.put("Karnataka","Bangalore");
        mp.put("India",m1);

        for(String s:mp.keySet()){
            for(String k:mp.get(s).keySet()){
                System.out.println(mp.get(s).get(k));
            }
        }
    }
}
