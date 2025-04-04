package stringoperations;

import java.util.Arrays;

public class StringCompareTo {

    public static void main(String[] args) {

        String s[]={"north","south","east","west"};
        /*
         a b c d e f g h i j k l m
         n o p q r s t u v w x y z
         */
        for(int i=0;i<s.length;i++){

            for(int j=i+1;j<s.length;j++){

                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));

    }
}
