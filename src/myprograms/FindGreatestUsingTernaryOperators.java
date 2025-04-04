package myprograms;

public class FindGreatestUsingTernaryOperators {

    public static void main(String[] args) {
        int a=100,b=30,c=250;
        int result =a>b && a>c ? a: b>a && b>c ? b:c;
        System.out.println(result);
    }
}
