package myprograms;

public class Factorial {

    public void factorialNumber(int number){

        int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("The fatcorial of a number is "+fact);
    }

    public static void main(String[] args) {

        Factorial fc=new Factorial();
        fc.factorialNumber(5);

    }
}
