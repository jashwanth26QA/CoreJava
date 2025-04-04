package arrayprogramms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CompareTwoArrays {

    public static void main(String[] args) {

        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        Set<Object> l1=new HashSet<>(Arrays.asList(a1));
        Set<Object> l2=new HashSet<>(Arrays.asList(a2));
        if(l1.size()!=l2.size()){
            System.out.println("The two arrays don't match");
        }else{
            int count=0;
            for (Object obj : l1) {
                if(l2.contains(obj)){
                    count++;
                }
            }
            if(count==l1.size()){
                System.out.println("The two arrays are matching");
            }
        }
    }
}
