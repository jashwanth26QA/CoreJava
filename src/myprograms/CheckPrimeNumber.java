package myprograms;

public class CheckPrimeNumber {

    public void isPrimeNumber(int number){
        boolean flag=false;
        int count=0;

        for(int i=1;i<=(number/2);i++){

            if(number%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("The number is not a prime number");
        } else if (count==1) {
            System.out.println("The number is a prime number");
        }
    }

    public static void main(String[] args) {
        CheckPrimeNumber cpn=new CheckPrimeNumber();
        cpn.isPrimeNumber(7);
    }
}
