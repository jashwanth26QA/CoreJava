package arrayprogramms;

import java.util.Arrays;

public class CopyOneArrayIntoAnotherInReverse {

    public static void main(String[] args) {

        int a[]={10,20,30,40};

        int b[]=new int[a.length];

        int high=a.length-1;
        int low=0;
        System.out.println("Before reverse: "+Arrays.toString(a));
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }
        for(int i=0,j=0;i<a.length;i++,j++){

            b[j]=a[i];
        }
        System.out.println("After reverse: "+Arrays.toString(b));
    }
}
