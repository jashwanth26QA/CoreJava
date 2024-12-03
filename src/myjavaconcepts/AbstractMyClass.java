package myjavaconcepts;

public abstract class AbstractMyClass {

    AbstractMyClass(){
        System.out.println("This statement is in abstract class");
    }

    public abstract void display();

    public void show(){
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }

}
