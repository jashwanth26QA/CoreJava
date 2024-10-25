package myjavaconcepts;

public class ToKnowUseOfConstructor {

    String name;
    int number;

    ToKnowUseOfConstructor(String name,int number){
    this.name=name;
    this.number=number;
    }

    public void getName(){
        System.out.println("The name of the person is "+name);
    }

    public void getNumber(){
        System.out.println("The number of the person is "+number);
    }

    public static void main(String[] args) {

        ToKnowUseOfConstructor tkc=new ToKnowUseOfConstructor("Jashwanth",12);
        ToKnowUseOfConstructor tkc1=new ToKnowUseOfConstructor("Ram",34);
        tkc.getName();
        tkc.getNumber();
        System.out.println("*************************************");
        tkc1.getName();
        tkc1.getNumber();
}
}
