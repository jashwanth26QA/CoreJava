package myjavaconcepts;

public class ConstructorChaining {

    String name;
    long phoneNumber;
    String location;

    /*
    The main idea of constructor chaining is to call constructors within one another
    1.By calling 3rd Constructor we invoke 2 and 1st constructors
    this is possible only by implicitly giving "this" keyword.Unlike super, we have to
    give "this" so that the constructors are called.
     */
    ConstructorChaining()
    {
        System.out.println("Java was developed by James Gosling");
    }

    ConstructorChaining(String name, long phoneNumber){
        this();
        this.name=name;
        this.phoneNumber=phoneNumber;
        System.out.println(name+" "+phoneNumber);
    }
    ConstructorChaining(String location){
        this("Ram",905904994);
        this.location=location;
        System.out.println(location);
    }

    public static void main(String[] args) {
        ConstructorChaining cc=new ConstructorChaining("India");
    }
}
