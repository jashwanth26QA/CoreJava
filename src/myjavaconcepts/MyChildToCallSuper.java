package myjavaconcepts;

public class MyChildToCallSuper extends MyParentSuper {

    MyChildToCallSuper(){
        super();
        System.out.println("India is the greatest country in the world");
        System.out.println("New latest");
        int store=super.x;
    }

    public static void main(String[] args) {
        MyChildToCallSuper mcs=new MyChildToCallSuper();
    }
}
