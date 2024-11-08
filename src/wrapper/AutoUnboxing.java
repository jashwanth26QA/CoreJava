package wrapper;

public class AutoUnboxing {

    public static void main(String[] args) {
        /*
        Converting Object to primitive data type is called unboxing
        Here, the JVM will implicitly take care of the conversion
         */
        Integer i=50;
        int x=i;
        /*
        x=i -> where the jvm implicitly write x=i.intValue();
         */
        System.out.println(x);

        /*
        Converting Object to primitive data type is called unboxing
        here, we will try to convert explicitly
         */

        Integer p=new Integer(40);
        int k=p.intValue();
        System.out.println(k);

        /*
        Converting boolean explicitly
         */
        Boolean b=new Boolean(true);
        boolean m=b.booleanValue();
        if(b==m){
            System.out.println("They are identical");
        }

    }
}
