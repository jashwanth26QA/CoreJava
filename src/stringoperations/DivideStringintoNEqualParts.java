package stringoperations;

import java.util.HashSet;
import java.util.Set;

public class DivideStringintoNEqualParts {

    public static void main(String[] args) {
        String str = "abcdefghi";
        int len=str.length();
        int n = 3;
        int sets =len/3;
        Set<String> st=new HashSet<>();
        for(int i = 0; i< sets; i++){
            st.add(str.substring(n*i,n*(i+1)));
        }
        System.out.println(st);
    }
}
