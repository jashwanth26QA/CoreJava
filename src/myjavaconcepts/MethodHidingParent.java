package myjavaconcepts;

public class MethodHidingParent {

    public static void displayMessage(){
        System.out.println("This is to display Parent Message using static keyword for method");
    }

    public void myMethod(){
        System.out.println("This is to test non static keyword to a method");
    }
}
