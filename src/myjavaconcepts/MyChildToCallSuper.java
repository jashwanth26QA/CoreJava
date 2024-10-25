package myjavaconcepts;

public class MyChildToCallSuper extends MyParentSuper {

    MyChildToCallSuper(){
        super();
        System.out.println("India is the greatest country in the world");
    }

    public static void main(String[] args) {
        MyChildToCallSuper mcs=new MyChildToCallSuper();
    }
}
