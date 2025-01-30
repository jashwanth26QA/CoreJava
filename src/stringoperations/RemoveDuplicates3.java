package stringoperations;

public class RemoveDuplicates3 {

    public static void main(String[] args) {

        String s="programming";
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            int index=s.indexOf(ch,i+1);

            if(index==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
