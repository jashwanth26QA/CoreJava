package myjavaconcepts;

 class A{
  int a=30;
}

class B extends A{
     int a=50;

     public void show(){
         System.out.println("Hello");
     }
}

public class BehaviorOFInstanceVariable extends B {

     int store=super.a ;
     int y=((A)this).a;

    public static void main(String[] args) {

        BehaviorOFInstanceVariable boc=new BehaviorOFInstanceVariable();
            boc.show();
            int x=boc.store;
        System.out.println(x);
        B obj=new BehaviorOFInstanceVariable();
        A ob=new BehaviorOFInstanceVariable();
        int v=ob.a;
        System.out.println(v);
    }
}
