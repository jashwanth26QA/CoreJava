package collections;

import java.util.*;

public class MyIterator {

    public static void main(String[] args) {

        ArrayList<String> li=new ArrayList<>();
        li.add("India");
        li.add("Newyork");
        li.add("Australia");

        Iterator i=li.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("***************");
    }
}
