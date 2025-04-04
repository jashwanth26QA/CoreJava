package myjavaconcepts;

public class Test1 {
    
    public boolean display(String msg){
        String m=" Java";
        m=m.replaceAll(" ", "");
        if(msg.equals(m)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String m="Java";
        Test1 t=new Test1();
        System.out.println(t.display(m));
    }
}
