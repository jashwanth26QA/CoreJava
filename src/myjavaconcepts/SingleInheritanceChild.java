package myjavaconcepts;

public class SingleInheritanceChild extends SingleInheritance{


    public void show(){
        System.out.println("Hello, This is child method");
    }
    public static void main(String[] args) {

        SingleInheritanceChild sc=new SingleInheritanceChild();
        sc.display();
    }
}
