package collections;

import java.util.ArrayList;

public class CallStoreObjects {
    /*
    Here StoreObjectsInArrayList is the className which stores only of type class Objects
     */
    public ArrayList<StoreObjectsInArrayList> insertMyPersonlaInfo(){

        StoreObjectsInArrayList sb1=new StoreObjectsInArrayList("Jashwanth","HITAM",45689);
        StoreObjectsInArrayList sb2=new StoreObjectsInArrayList("Narsing","IARE",23490);
        StoreObjectsInArrayList sb3=new StoreObjectsInArrayList("Harshni","JNTU",12390);

        ArrayList<StoreObjectsInArrayList> alObjects=new ArrayList<>();
        alObjects.add(sb1);
        alObjects.add(sb2);
        alObjects.add(sb3);
        return alObjects;
    }

    public static void main(String[] args) {

        CallStoreObjects cob=new CallStoreObjects();
        ArrayList<StoreObjectsInArrayList> callList=cob.insertMyPersonlaInfo();

        for(StoreObjectsInArrayList sob:callList){

                System.out.println(sob.name);
                System.out.println(sob.collegeName);
                System.out.println(sob.hallticketNumber);
                System.out.println("**************");

        }
    }
}
