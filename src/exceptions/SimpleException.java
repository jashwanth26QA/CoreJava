package exceptions;

public class SimpleException {

    public static void main(String[] args) {

        try{
            int a=30;
            int b=0;
            int c=a/b;
        }catch(Exception ae){
           ae.printStackTrace();
        }
        finally{
            System.out.println("We have come out of the try catch block");
        }
        System.out.println("This is the new block after risky code");
    }
}
