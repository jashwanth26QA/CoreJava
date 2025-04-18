package hybridInhertiance;

import org.checkerframework.checker.units.qual.A;

public class Actual extends Test implements First,Second {

/*
Here, we try to override those methods which are present in First and Second Interfaces
 */
    @Override
    public void show() {
        System.out.println("This has been overriden from First Interface");
    }

    @Override
    public void display() {
        System.out.println("This has been overriden from Second Interface");
    }

    public void myMethod(){
        System.out.println("this methods belongs to Actual class");
    }

    public static void main(String[] args) {
        Actual ac=new Actual();
        int result=ac.addNumber(5,10);
        System.out.println(result);
        ac.display();
        ac.show();
        ac.myMethod();
    }
}
