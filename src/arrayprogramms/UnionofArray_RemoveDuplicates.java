package arrayprogramms;

import java.util.Arrays;

public class UnionofArray_RemoveDuplicates {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6};
        int b[]={1,2,4,7,8};
        int c[]=new int[a.length+b.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            j++;
        }
        for(int k=0;k<b.length;k++){
            c[j]=b[k];
            j++;
        }

        int d[]=new int[c.length];
        boolean flag[]=new boolean[c.length];
        Arrays.fill(flag,false);

        for(int m=0;m<c.length;m++){
            int count=0;
            if(flag[m]==true){
                continue;
            }
            for(int n=m+1;n<c.length;n++){

                if(c[m]==c[n]){
                    flag[n]=true;
                    count++;
                }
            }
            if(flag[m]==false){
                System.out.println(c[m]+" is repeated "+count+" time(s)");
            }
        }
    }
}
