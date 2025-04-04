package arrayprogramms;

import java.util.HashSet;
import java.util.Set;

public class FindingUnionOfElements {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={3,4,5,6,7};
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<a.length;i++){

            if(!st.contains(a[i])){
                st.add(a[i]);
            }
        }
        for(int j=0;j<b.length;j++){

            if(!st.contains(b[j])){
                st.add(b[j]);
            }
        }
        System.out.println("The union of elements from Set A & B is: "+st);
    }
}
