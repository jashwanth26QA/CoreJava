package arrayprogramms;

public class LargestNumberInArray {

    public static void main(String args[]){

        int a[]={10,2,30,40,110,8};
        int max=a[0];

        for(int i=1;i<a.length;i++){

            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);

    }
}
