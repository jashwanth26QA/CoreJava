package mutipleInheritance;

import hybridInhertiance.Second;

/*
Here, we implement Interfaces of First and Second in this class with the help of 'implements' keyword
 */
public class Actual implements First, Second {

    @Override
    public void display() {
        System.out.println("This has been overriden from First Interface");
    }

    @Override
    public void show() {
        System.out.println("This has been overriden from Second Interface");
    }

    public static void main(String[] args) {
        Actual act=new Actual();
        act.display();
        act.show();
    }
}
