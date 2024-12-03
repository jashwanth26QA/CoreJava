package myjavaconcepts;

public class ConstructorChainingPart2 {

ConstructorChainingPart2()
{
    System.out.println("Hello");
}

ConstructorChainingPart2(int x){
    this();
    System.out.println(x);
}

ConstructorChainingPart2(String k, int number, int v){
    this(v);
    System.out.println(k+" "+number);
}
    public static void main(String[] args) {

    ConstructorChainingPart2 t=new ConstructorChainingPart2("Ram",905904994,60);
    }
}
