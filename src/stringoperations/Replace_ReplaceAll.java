package stringoperations;

public class Replace_ReplaceAll {

    public static void main(String[] args) {

        String s="The world is going to fall in the next coming decade";

        String newString=s.replaceAll("he","om");
        System.out.println(newString);

        String k="The world is going to fall in the next coming decade";
        String newKString=k.replace("e","m");
        System.out.println(newKString);
    }
}
