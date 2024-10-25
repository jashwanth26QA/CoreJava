package myprograms;

public class CountNumberOfDigits {

    public int countDigits(int number){
        int count=0;
        while(number>0){
            int temp=number%10;
            count++;
            number=number/10;
        }
        return count;
    }
    public static void main(String[] args) {

        CountNumberOfDigits cod=new CountNumberOfDigits();
        int finalCount=cod.countDigits(1234);
        System.out.println("The number of digits present in the number are "+finalCount);
    }
}
