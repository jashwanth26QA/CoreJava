package trialAnderror;
import java.text.ParseException;

public class MyTest {

        public void spliceArray(int array[],int startPosition,int endPosition){
                int splicedArray[]=new int[endPosition-startPosition];
                if(endPosition>array.length){
                    System.out.println("The array cannot be spliced , please pass the value less than the end position");
                   return;
                }
                for(int i=startPosition,j=0;i<endPosition;i++){
                    splicedArray[j]=array[i];
                    j++;
                }
            for(Integer k:splicedArray){
                System.out.println(k);
            }
        }
    public static void main(String[] args) throws ParseException {
        MyTest mt = new MyTest();
        int a[] = {8, 9, 4, 6, 0, 11, 45, 21};
        mt.spliceArray(a,7,8);
    }
}


