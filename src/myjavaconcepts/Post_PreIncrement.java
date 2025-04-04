package myjavaconcepts;

public class Post_PreIncrement {

    public static void main(String[] args) {

        /*
        case: 1
         */
        int x=10;
        x=x++;
        /*
        Still this will print only '10'
         */
        System.out.println(x);

        /*
        case :2
         */
        int y=10;
        int i=y++;
        System.out.println(y);
        System.out.println(i);

        /*
        case:3
         */
         int z=10;
        z++;
        ++z;
        System.out.println(z);
    }
}
