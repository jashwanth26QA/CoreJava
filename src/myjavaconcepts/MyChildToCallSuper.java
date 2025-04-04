package myjavaconcepts;

public class MyChildToCallSuper extends MyParentSuper {

    /*
    Here , we call the Parent class constrcutor in the child class constructor by 2 ways
    1. We use 'super' explicitly to call the Parent class constrcutor
    2. Without the use of 'super' also can be done by not mentioning in the Child class
    but this can be called during the Child Class object creation.
     */
    MyChildToCallSuper(){
        super();
        System.out.println("India is the greatest country in the world");
        System.out.println("New latest");
        int store=super.x;
        System.out.println(store);
    }

    public static void main(String[] args) {
        MyChildToCallSuper mcs=new MyChildToCallSuper();
    }
}
