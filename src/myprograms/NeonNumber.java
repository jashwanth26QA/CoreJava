package myprograms;

public class NeonNumber {

    public int calculatePower_of_Number(int baseNumber,int powerNumber ){
        int store=1;
        while(powerNumber>=1){
            store=baseNumber*store;
            powerNumber--;
        }
        return store;
    }

    public static void main(String[] args) {
        NeonNumber nn=new NeonNumber();
        int baseNum=9;
        int answer=nn.calculatePower_of_Number(baseNum,2);
        System.out.println("The power of the number is "+answer);
        int store=0;
        while(answer>0){
            int temp=answer%10;
            store+=temp;
            answer=answer/10;
        }
        System.out.println("When the power of the number's total is added then " +store);
        if(baseNum==store){
            System.out.println("The number is Neon as "+baseNum+" and power of the total number when added are equal "+store);
        }
        else{
            System.out.println("They are not a Neon number");
        }
    }
}
