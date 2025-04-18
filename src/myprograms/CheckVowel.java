package myprograms;

import java.util.HashSet;
import java.util.Set;

public class CheckVowel {

    public static void main(String[] args) {
        String a="javaisfun";
        Set<Character> appendVowel=new HashSet<>();
        for(int i=0;i<a.length();i++){

            if(a.charAt(i)>=97 && a.charAt(i)<=122){

                if(a.charAt(i)=='a' ||a.charAt(i)=='e'|| a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
                    appendVowel.add(a.charAt(i));
                }
            }
        }
        System.out.println(appendVowel);
    }
}
