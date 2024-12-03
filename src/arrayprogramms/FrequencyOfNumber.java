package arrayprogramms;
public class FrequencyOfNumber {
    public static void main(String[] args) {

        int a[]={10,10,20,30,30,30,30,40,90};
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=0;
                }
            }
            if(a[i]!=0 && count>=1){
                System.out.println(a[i] +" is repeated "+count+" times");
            }
        }
    }
}
