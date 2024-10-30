package myjavaconcepts;

public class MethodHidingChild extends MethodHidingParent{

    public static void displayMessage(){
        System.out.println("This is to display Child Message using static keyword for method in child class");
    }
    public void myMethod(){
        System.out.println("This is to test non static keyword to a method in child class");
    }

    public static void main(String args[]){

        MethodHidingParent mhp=new MethodHidingChild();
        mhp.myMethod();
        mhp.displayMessage();

    }
}
