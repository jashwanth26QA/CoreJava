package arrayprogramms;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        int a[]={3,1,34,5,6};
        System.out.println("The array before sorting is "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("The arrays after sorting is");
        System.out.println(Arrays.toString(a));
    }
}
