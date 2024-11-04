package stringoperations;

public class RemoveNumbersFromString {

    public static void main(String[] args) {

        String s="jas12want6!h";
        char ch[]=s.toCharArray();
        String store="";
        System.out.println("The actual word is "+s);
        for(int i=0;i< ch.length;i++){

            if(Character.isLetter(ch[i])){
                store+=ch[i];
            }
        }
        System.out.println("The new word after removing excess special characters ->"+store);
    }
}
