package myjavaconcepts;

public class AccessSuperClassVaribalesInSubClass extends AccessSuperClassVariables {


    int x=50;

    public  void display(){
        System.out.println(super.x);
        System.out.println("This number is in "+x);
    }

    public static void main(String[] ags){
        AccessSuperClassVaribalesInSubClass asc=new AccessSuperClassVaribalesInSubClass();
        asc.display();
    }
}
