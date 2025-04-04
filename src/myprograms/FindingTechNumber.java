package myprograms;

public class FindingTechNumber {

    public int checkEvenDigits(int number){
        int count=0;
        while(number>0){
            int temp=number/10;
            number=temp;
            count++;
        }
        return count;
    }

    public int findPower(int baseNumber,int power){
        int store=1;
        while(power>=1){
            store=baseNumber*store;
            power--;
        }
        return store;
    }

    public static void main(String[] args) {
        FindingTechNumber ft=new FindingTechNumber();
        int number=3025;
        int firstHalf=0,secondHalf=0;
        int result=ft.checkEvenDigits(number);
        if(result==4){
            firstHalf = number % (int) Math.pow(10, result / 2);
            secondHalf= number / (int) Math.pow(10, result / 2);
            int sum=firstHalf+secondHalf;
            int findingPowerNumber=ft.findPower(sum,2);
            if(findingPowerNumber==number){
                System.out.println("The number is Tech Number");
            }
            else{
                System.out.println("The number is not a Tech Number");
            }
        }else{
            System.out.println("The number cannot be computed for Tech number");
        }
    }
}
