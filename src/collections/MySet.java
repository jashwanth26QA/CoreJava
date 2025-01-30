package collections;

//import java.util.ArrayList;
import java.util.*;

public class MySet {

    /*
    Here in Set - Insertion order is not preserved and it doesn't allow duplicates
     */
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        al.add("Orange");
        al.add("Banana");
        al.add("Mangoes");
        al.add("Kiwi");
        al.add("Orange");

        Set<String> st = new HashSet<String>(al);
        System.out.println(st);
        /*
        To find out whether the element exists in the Set
         */
        if(st.contains("Mangoes")){
            System.out.println(true);
        }
        System.out.println("***********");
        /*
        To iterate a Set
         */
        for(String  m:st){
            System.out.println(m);
        }
        System.out.println("***********");
        /*
        To remove an element from Set
         */
        if(st.contains("Kiwi")){
            st.remove("Kiwi");
            System.out.println(st);
        }
    }
}
