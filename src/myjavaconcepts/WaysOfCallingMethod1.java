package myjavaconcepts;

public class WaysOfCallingMethod1 {

    public void display(){
        System.out.println("Hello, I am learning java");
    }

    /*
    Here instead of creating a reference variable , we directly call with the help of
    'new' followed by className and methodName;
     */
    public static void main(String[] args) {
        new WaysOfCallingMethod1().display();
    }
}
