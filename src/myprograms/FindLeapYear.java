package myprograms;

public class FindLeapYear {
/*
In this program, we try to extract last two digits of any number and we try to divide that
number by 4. If the number(last two digits) is divided by 4 then we can say that it is a leap year.
 */
    public static void main(String[] args) {
        int a=12364;
        String s=String.valueOf(a);
        String s1=s.substring(s.length()-2,s.length());
        int store=Integer.valueOf(s1);
        System.out.println(store);
        if(store%4==0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}
