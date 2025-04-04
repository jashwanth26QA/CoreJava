package stringoperations;

public class Starts_EndsWith {

    public static void main(String args[]){

        String s="PostOffice";
        boolean isPassed=false;
        isPassed=s.endsWith("ce");
        if(isPassed){
            System.out.println("It ends with the given text");
        }else{
            System.out.println("It doesn't end with the given text");
        }
    }
}
