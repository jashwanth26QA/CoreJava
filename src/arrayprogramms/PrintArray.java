package arrayprogramms;

public class PrintArray {

    public static void main(String args[]) {

        int a[]={10,20,30,40,50};
    System.out.println("The array can be printed using traditonal for loop");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("The array can below is using for each loop");

        for(Integer ar:a){
            System.out.println(ar);
        }
    }
}
