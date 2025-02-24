package collections;

import java.util.*;

public class AddArrayToArrayList {

    public static void main(String[] args) {

        String []strArray={"India","is","the","greatest","Country"};
        List<String> sList=new ArrayList<>();
        /*
        Here with the help of Collections.addAll(Destination,Source);
        All items from source(strArray) will be moved to destination(sList)
         */
        Collections.addAll(sList,strArray);
    }
}
