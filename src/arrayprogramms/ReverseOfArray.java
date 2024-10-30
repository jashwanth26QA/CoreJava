package arrayprogramms;

import java.util.Arrays;

public class ReverseOfArray {

    public static void main(String args[]) {

        int a[]={10,20,30,40,50};
        System.out.println("The array before reverse is "+Arrays.toString(a));
        int low =0;
        int high=a.length-1;

        while(low<high){

            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }

        System.out.println("The array after reversing is "+Arrays.toString(a));
    }
}