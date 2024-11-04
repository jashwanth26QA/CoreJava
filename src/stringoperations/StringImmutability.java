package stringoperations;

public class StringImmutability {

    public static void main(String[] args) {

        String s="hello";
        String s1="hello";
        String s2="hello";
        String s3="hello";
        /*
        Here in heap area-> String constant pool will be holding all the values
        such as s,s1,s2,s3 -> point to one object because no need to create a new object.
        If s3 value is changed that is s3=java then s,s1,s2 will still hold 'hello' and new s3 will be 'java'
        thus -> s,s1,s2 will always point to 'hello'. Therefore changing one object(s3) will not change other object(s,s1,s2)
         */
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        s3="java";
        System.out.println(s3);

        /*
        Another example
         */
        String str=new String("Selenium");
        str.concat("Automation");
        /*
        If we try to print the above we could see str object still holding 'Selenium'
        for 'Selenium' to become 'Selenium Automation' we should do str=str.concat();
        Thus, the existing object will now point to 'Selenium Automation' because we have changed
        reference.
         */
        System.out.println(str);
        str=str.concat("Automation");
        System.out.println("After changing the reference we get -> "+str);


    }
}
