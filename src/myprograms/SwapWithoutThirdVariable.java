package myprograms;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        int a=500,b=200;
        a=a+b;
        b=a-b;
        System.out.println("The valud of B is "+b);
        a=a-b;
        System.out.println("the value of A is  "+a);
    }
}
