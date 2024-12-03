package arrayprogramms;

import java.util.Arrays;

public class SumOfLeftSideIsEqualToRight {

    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int low=0;
        int high=a.length-1;

        int mid=low+high/2;
       int startIndex=0;
       int endIndex=mid;
        int size=endIndex-startIndex;
       int b[]=new int[size+1];
        /*
        Copying the first set of elements into an array
         */
        for(int i=startIndex;i<=size;i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }
        int startLowerIndex=mid+1;
        int startHigherIndex=a.length-1;
        int Csize=startHigherIndex-startLowerIndex;
        int c[]=new int[Csize+3];
        System.out.println(c.length);
        for(int j=startLowerIndex;j<=Csize;j++){
            c[j]=a[startLowerIndex];
            System.out.println(c[j]);
        }

    }
}
