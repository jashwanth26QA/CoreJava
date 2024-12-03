package myprograms;

import java.util.*;

public class Anagaram  {

    public static void main(String[] args) {

        /*
        Anagram- Two Strings are to be taken ex: 'silent' with this word we can form another word
        like 'listen'. Both the lengths should be equal.It should not contain duplicate characters
         */
        String s="silent";
        String s2="listen";
        char ch[]=s.toCharArray();
        char ch1[]=s2.toCharArray();
        Set<Character>st=new HashSet<>();
        Set<Character>st1=new HashSet<>();

        for(int i=0;i<ch.length;i++){

                for(int j=i+1;j<ch.length;j++){

                    if(ch[i]>ch[j]){
                        char temp=ch[i];
                        ch[i]=ch[j];
                        ch[j]=temp;
                    }
                }
            }
                for(Character c:ch){
                    st.add(c);
                }


        System.out.println("**********************");
        for(int i=0;i<ch1.length;i++){

            for(int j=i+1;j<ch1.length;j++){

                if(ch1[i]>ch1[j]){
                    char temp=ch1[i];
                    ch1[i]=ch1[j];
                    ch1[j]=temp;
                }
            }
        }
        for(Character c2:ch1){
            st1.add(c2);
        }

        boolean result = st.equals(st1);

        if(result) {
            System.out.println("The String is an anagram");
        }else {
            System.out.println("String is not an anagram");
        }
    }
}
