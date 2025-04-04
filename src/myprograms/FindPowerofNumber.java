package myprograms;

public class FindPowerofNumber {

    public int calculcatePower(int base, int power){
        int store=1;
        while(power>=1){
            store=base*store;
            power--;
        }
        return store;
    }
        public static void main(String[] args) {
            FindPowerofNumber mt=new FindPowerofNumber();
            int baseNumber=2;
            int power=5;
            int powerOfNumber=mt.calculcatePower(baseNumber,power);
            System.out.println(baseNumber+" to the power "+power+" is: "+powerOfNumber);
        }
}
