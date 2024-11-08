package arrayprogramms;

import java.util.Arrays;

public class PrintSubArray {

    public void displaySubArray(int a[], int startIndex, int endIndex){

        if(endIndex>a.length){
            return;
        }else{
                int storeSubArray[]=new int[endIndex-startIndex];
                for(int i=0;i<storeSubArray.length;i++){
                    storeSubArray[i]=a[startIndex];
                    startIndex++;
                    if(startIndex==endIndex){
                        break;
                    }
                }
            System.out.println("The spliced array is ");
            System.out.println(Arrays.toString(storeSubArray));
        }

    }
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50,60,70};
        PrintSubArray ps=new PrintSubArray();
        System.out.println("The original array is ");
        System.out.println(Arrays.toString(ar));
        ps.displaySubArray(ar,3,7);
    }
}
