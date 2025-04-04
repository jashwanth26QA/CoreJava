package arrayprogramms;

public class MirrorImageOfMatrix {

    public static void main(String[] args) {

        int a[][]={{5,3,2},{10,1,5},{9,7,8}};
        System.out.println("The actual image of the Matrix is :");
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("************************");
        System.out.println("The mirror image of the matrix is :");
        for(int i=0;i<a.length;i++){

            for(int j=a[i].length-1;j>=0;j--){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
