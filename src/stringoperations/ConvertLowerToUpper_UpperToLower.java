package stringoperations;

public class ConvertLowerToUpper_UpperToLower {


    public static void main(String[] args) {
        String s="Great Power";
        String stored="";
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            int store=s.charAt(i);
            if(store>=65 && store<=90){
                s=s.replaceFirst(Character.toString(s.charAt(i)),Character.toString(s.charAt(i)+32));
            }else if(store>=97 && store<=122){
                s=s.replaceFirst(Character.toString(s.charAt(i)),Character.toString((s.charAt(i)-32)));
            }
        }
        System.out.println("All the lower case letters are now upper case, Upper case letters are now lower case");
        System.out.println(s);
    }
}
