package stringoperations;

public class CountNumberOfVowels {

    public static void main(String[] args) {

        String s="godisgreat";
        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    countVowels++;
            }
            else{
                countConsonants++;
            }
        }
        System.out.println("The number of vowels present in word are "+countVowels);
        System.out.println("The number of Consonants present in word are "+countConsonants);
    }
}
