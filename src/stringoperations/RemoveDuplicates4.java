package stringoperations;

public class RemoveDuplicates4 {

    public static void main(String[] args) {

        String s="programming";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){

            boolean flag=false;

            for(int j=i+1;j<ch.length;j++){

                if(ch[i]==ch[j]){
                    flag=true;
                }
            }
            if(!flag){
                System.out.println(ch[i]);
            }
        }
    }
}
