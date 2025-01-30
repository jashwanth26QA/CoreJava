package stringoperations;

public class RemoveDuplicate2 {

    public static void removeDuplicates(String str)
    {

        String newstr = new String();
        int length = str.length();

        for (int i = 0; i < length; i++)
        {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt(i);

            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }

        System.out.println(newstr);
    }

    public static void main(String[] args)
    {
        String str = "JavaTpoint is the best learning website";
        removeDuplicates(str);
    }
}
