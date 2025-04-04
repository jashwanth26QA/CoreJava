package myprograms;

public class FindFirst_LastDigit {

    public int getFirstDigit(int number){
        while(number>=10){
            number=number/10;
        }
        return number;
    }

    public int getLastDigit(int number){
        int m=number%10;
        return m;
    }

    public static void main(String[] args) {
        FindFirst_LastDigit fd=new FindFirst_LastDigit();
        int a=56789;
        String numToString=String.valueOf(a);
        Integer j=new Integer(String.valueOf(numToString.charAt(0)));
        int firstDigit=j;
        System.out.println("The first digit of a number is "+firstDigit);
        Integer i= new Integer(String.valueOf(numToString.charAt(numToString.length()-1)));
        int lastDigit=i;
        System.out.println("The last digit of a number is "+lastDigit);

        /*
        Method 2:
         */
        int x=1234;
        int fdigit=fd.getFirstDigit(1234);
        int lDigit=fd.getLastDigit(1234);
        System.out.println(fdigit);
        System.out.println(lDigit);
    }
}
