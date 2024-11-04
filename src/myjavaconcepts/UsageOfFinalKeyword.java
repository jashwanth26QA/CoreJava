package myjavaconcepts;

public final class UsageOfFinalKeyword {

    /*
    If class has been declared with final keyword then we cannot extend it another class
    that is inheritance is not possible
    If a variable is declared as final then we cannot use that in other classes.
    If a method is declared as final then we cannot override it in other classes.
    However, we can overload the method although final keyword is declared.
     */
    final int a=25;

    public final void display(){
        System.out.println(a);
    }

    public void display(int c){
        System.out.println("The number is "+c);
    }

    public static void main(String[] args) {
        UsageOfFinalKeyword ukf=new UsageOfFinalKeyword();
        ukf.display();
        ukf.display(15);
    }
}
