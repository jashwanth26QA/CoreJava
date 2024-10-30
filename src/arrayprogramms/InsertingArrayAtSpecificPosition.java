package arrayprogramms;

public class InsertingArrayAtSpecificPosition {


    public int[] insertionOfElement(int ar[],int position){
    int a[]=ar;
    int storeArray[]=new int[a.length+1];
    for(int i=0,j=0;i<a.length;i++){

        if(i<position){
            storeArray[j]=a[i];
            j++;
        }else if(i==position){
            storeArray[j]=a[i];
            j++;
        }
    }
return null;
    }


}
