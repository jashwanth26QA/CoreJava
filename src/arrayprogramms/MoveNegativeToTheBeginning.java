package arrayprogramms;

import java.util.Arrays;

public class MoveNegativeToTheBeginning {

    public static void main(String[] args) {

        int a[]={1,-2,3,-4,-5,7,-8};
        for(int i=0,j=0;i<a.length;i++){
            if(a[i]>0){
                continue;
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
