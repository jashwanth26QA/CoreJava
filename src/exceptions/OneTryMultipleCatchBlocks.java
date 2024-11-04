package exceptions;

public class OneTryMultipleCatchBlocks {

    public static void main(String[] args) {

        String str=null;
        int a=80;
        int b=0;

        try{
            int c=a/b;
            System.out.println(c);
            System.out.println(str.length());
        }catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(IndexOutOfBoundsException aee){
            aee.printStackTrace();
        }
        catch(NullPointerException ne){
            ne.printStackTrace();
        }
        finally{
            System.out.println("It has come out of the risky code");
        }
    }
}
