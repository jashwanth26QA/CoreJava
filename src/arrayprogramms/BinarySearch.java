package arrayprogramms;

public class BinarySearch {

    public static void main(String[] args) {

        int a[]={10,20,30,40,50,55,60,70,90};
        int low=0;
        int high=a.length-1;
        int elemenToSearch=30;
        int mid=(low+high)/2;
        boolean flag=false;

        while(low<high){

            if(a[mid]==elemenToSearch){
                System.out.println("The element is found at "+(mid+1)+" position");
                flag=true;
                break;
            }
            else if(a[mid]>elemenToSearch){
                high=mid-1;
            }
            else if(a[mid]<elemenToSearch){
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        if (flag == false) {
            System.out.println("Element could not be found!!!");
        }
    }
}
