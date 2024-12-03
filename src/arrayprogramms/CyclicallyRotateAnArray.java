package arrayprogramms;

import java.util.Arrays;

public class CyclicallyRotateAnArray {

    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int store=a[a.length-1];

        for(int i=0;i<=a.length-2;i++){

            a[i+1]=a[i];

        }
        System.out.println(Arrays.toString(a));
    }
}
