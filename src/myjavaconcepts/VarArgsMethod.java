package myjavaconcepts;

public class VarArgsMethod {

    public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {

        VarArgsMethod vgs=new VarArgsMethod();
        int y=vgs.sumNumber(2,3,5);
        System.out.println(y);
    }
}
