package myprograms;

public class CheckEvenOddNumber {

    public void isEven_or_Odd(int number){

        if(number%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {

        CheckEvenOddNumber obj=new CheckEvenOddNumber();
        obj.isEven_or_Odd(16);
    }
}
