package myjavaconcepts;

public class AccessSuperClassVaribalesInSubClass extends AccessSuperClassVariables {


    int x=50;

    public  void display(){
        System.out.println("The number from parent class using super is "+super.x);
        System.out.println("This number in child class "+x);
    }

    public static void main(String[] ags){
        AccessSuperClassVaribalesInSubClass asc=new AccessSuperClassVaribalesInSubClass();
        asc.display();
    }
}
