package arrayprogramms;

import java.util.Arrays;

public class CopyAnArrayIntoAnother {

    public static void main(String args[]){

        int a[]={10,20,30,40,50};
        int b[]=new int[a.length];

        for(int i=0,j=0;i<a.length;i++,j++){

            b[j]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
