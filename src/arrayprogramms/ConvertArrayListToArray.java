package arrayprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayListToArray {

    public static void main(String[] args) {

        List<String> li= Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
        String []p= li.toArray(new String[li.size()]);

        for(String l:p){
            System.out.println(l);
        }

        List<Integer> l=Arrays.asList(1,2,3,4,5);
        Object []m=l.toArray(new Integer[l.size()]);

        for(Object o:m){
            System.out.println(o);
        }

    }
}
