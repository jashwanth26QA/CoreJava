package myprograms;

import trialAnderror.MyTest;

public class ArmstrongNumber {

    public int powerOfNumber(int base,int power){
        int store=1;
        while(power>=1){
            store=store*base;
            power--;
        }
        return store;
    }
    public int countDigitsInANumber(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public boolean isArmstrongNumber(int number){
        boolean flag=false;
        int actualNumber=number;
        int store=0;
        while(number>0){
            int temp=number%10;
            store=store+powerOfNumber(temp,countDigitsInANumber(actualNumber));
            number=number/10;
        }
        if(store==actualNumber){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber mt = new ArmstrongNumber();
        int number = 153;
        int count = mt.countDigitsInANumber(number);
        boolean isArmStrong = mt.isArmstrongNumber(number);
        if (isArmStrong) {
            System.out.println("The number is Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
