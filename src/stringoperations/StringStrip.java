package stringoperations;

public class StringStrip {

    public static void main(String[] args) {

        String s="  abc  def";
        System.out.println(s);
        /*
        This will remove all the leading whitespaces
         */
        s=s.strip();
        System.out.println(s.toString());

    }
}
