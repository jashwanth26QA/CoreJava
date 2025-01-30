package arrayprogramms;

import java.util.Arrays;

public class DeletionOfAnElement {

    public static void main(String[] args) {

        int a[]={10,20,20,40,50};
        int count=0;
        int eleToDelete=20;
        for(int i=0;i<a.length;i++){

            if(a[i]==eleToDelete){
                count++;
            }
        }

        int[] nAr = new int[a.length-count];
        int in=0;
        for (int i = 0; i < a.length; i++) {
            if(eleToDelete!=a[i]){
                nAr[in]=a[i];
                in++;
            }
        }
        System.out.println(Arrays.toString(nAr));
    }
}
