package stringoperations;

public class ReverseOfString {

    public static void main(String[] args){

        String s="welcome";
        String store="";

        for(int i=s.length()-1;i>=0;i--){
            store+=s.charAt(i);
        }
        System.out.println("The actual string before reverse is ->"+s);
        System.out.println("The string after reverse is -> "+store);
    }
}
