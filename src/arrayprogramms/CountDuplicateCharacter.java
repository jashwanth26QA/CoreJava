package arrayprogramms;

import java.util.Arrays;

public class CountDuplicateCharacter {

    public void countDuplicates(char[] ch){
        boolean visited[]=new boolean[ch.length];
        Arrays.fill(visited,false);
        for(int i=0;i<ch.length;i++){
            int count=0;
            if(visited[i]==true)
                continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count>=1 && ch[i]!=' '){
                System.out.println(ch[i]+" is repeated "+count+" time(s)");
            }
        }
    }

    public static void main(String[] args) {

        String s="i love learning java";
        char ch[]=s.toCharArray();
        CountDuplicateCharacter cdc=new CountDuplicateCharacter();
        cdc.countDuplicates(ch);
    }
}
