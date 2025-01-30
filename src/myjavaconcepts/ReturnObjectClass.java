package myjavaconcepts;

import java.util.ArrayList;

public class ReturnObjectClass {

    public ArrayList<ReturnObject1> myMethod(){
        ReturnObject1 robj1=new ReturnObject1(123,"Ram");
        ReturnObject1 robj2=new ReturnObject1(345,"sam");

        ArrayList<ReturnObject1> al=new ArrayList<>();
        al.add(robj1);
        al.add(robj2);
        return  al;
    }

    public static void main(String[] args) {
        ReturnObjectClass rob=new ReturnObjectClass();
        ArrayList<ReturnObject1> rb1= rob.myMethod();
        for(ReturnObject1 m:rb1){
            //System.out.println(m.number);
            System.out.println(m.MyName);
        }
    }
}
