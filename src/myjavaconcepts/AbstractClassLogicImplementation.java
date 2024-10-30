package myjavaconcepts;

public class AbstractClassLogicImplementation extends AbstractMyClass {

    /*
    Abstract class cannot be instantiated i.e object creation is not possible
    For object to create we have created Child class to create it
    Abstract class can have a constructor but cannot be called as object creation is not possible
    For that contructor to be called we need extend in child class
    In child class constructor we can call using super keyword and it should only in child class constructor
    All the unimplemented methods must and should be overidden in child class
     */
    AbstractClassLogicImplementation(){
        super();
        System.out.println("This statement is printed after abstract class constructor being called");
    }

    public void display(){
        System.out.println("This has been overriden in this class");
    }
    public static void main(String args[]){
        AbstractClassLogicImplementation abc=new AbstractClassLogicImplementation();
        abc.display();
    }
}
