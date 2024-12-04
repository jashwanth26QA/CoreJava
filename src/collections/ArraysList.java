package collections;

import java.util.*;

public class ArraysList {
/*
In this class we perform various kind of operations get,idexOf,contains,add,etc.
 */
    public static void main(String[] args) {

        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(40);
        /*
        The below statement will return '-1' unlike ArrayIndexOutOfBoundsException.If
        it does not have the value then it returns a numeric i.e '-1';
         */
        System.out.println(li.indexOf(3));
        System.out.println("***************");
        for(Integer k:li){
            System.out.println(k);
        }
        System.out.println("***************");

        /*
        If we want initialise an ArrayList directly
         */
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A", "B", "C"));
        System.out.println(ar);
        System.out.println("***************");
        /*
        Here with addAll() we directly add one list to another without using any loop;
         */
        ArrayList<String> al=new ArrayList<>();
        al.addAll(ar);
        System.out.println(al);
        System.out.println("***************");
        /*
        here we will use remove() to take out an element from the list;
         */
        ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Carrot","Orange"));
        ar1.remove(2);
        System.out.println(ar1);
        System.out.println("***************");
        /*
        Here we will use lastIndexOf() to indentify last element in the list;
         */
        ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("Australia","Bengal","California","Sweden"));
        System.out.println(ar2.lastIndexOf("Bengal"));

    }
}
