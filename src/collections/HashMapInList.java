package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapInList {

    public static void main(String[] args) {
        /*
        Here, we try to insert HashMap in a list and then we try to loop
        them.
         */
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        HashMap<String,String>mp=new HashMap<>();
        mp.put("India","Delhi");
        mp.put("Nepal","Khatmandu");

        HashMap<String,String>mp1=new HashMap<>();
        mp1.put("Sweet","Jamun");
        mp1.put("Khara","Mixture");

        mapList.add(mp);
        mapList.add(mp1);

        for(int i=0;i<mapList.size();i++){
            for(String k:mapList.get(i).keySet()){
                System.out.println(k+" "+mapList.get(i).get(k));
            }
        }
    }
}
