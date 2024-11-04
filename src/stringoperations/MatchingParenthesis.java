package stringoperations;

public class MatchingParenthesis {

    public static void main(String[] args) {

        String str="(ABC)GH";
        int count=0;
        for(int i=0;i<str.length();i++){


            if(!Character.isLetter(str.charAt(i))){
                 if(str.charAt(i)=='('){
                     count++;
                 }
                 else{
                     count--;
                 }
            }
        }
        if(count==0){
            System.out.println("They are matching");
        }

    }
}
