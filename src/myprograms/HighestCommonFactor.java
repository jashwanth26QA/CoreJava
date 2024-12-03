package myprograms;

public class HighestCommonFactor {

    public int findHighestCommonFactor(int i,int j) {
        int store = 0;
        int result = 0;
        if (i < j) {
            return 0;
        } else {
            while (i % j != 0) {
                int temp = i % j;
                store = j % temp;
                j = store;
                i = temp;
            }
        }
        return store;
    }
    public static void main(String[] args) {
        HighestCommonFactor hcf=new HighestCommonFactor();
        int x=hcf.findHighestCommonFactor(130,900);
        if(x==0){
            System.out.println("Please provide divisor value greater than dividend");
        }
        else{
            System.out.println(x);
        }
    }
}
