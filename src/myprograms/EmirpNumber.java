package myprograms;

public class EmirpNumber {

    /*AIM of the Programme:
    Suppose, we want to check the number 79 is emirp or not.
We know that 79 is a prime number means that divisible by 1 and self only.
On reversing the number, we get 97 which is another prime number.
Therefore, 79 and 97 both are prime numbers. Hence, 79 is a prime number.
Similarly, we can check other numbers also.
     */
    public int checkPrimenumber(int number) {
        int count = 0;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        EmirpNumber mt = new EmirpNumber();
        int number = 24;
        int storeNum = mt.checkPrimenumber(number);
        String store = "";
        if (storeNum == 0) {
            while (number > 0) {
                int temp = number % 10;
                store += String.valueOf(temp);
                number = number / 10;
            }
            int number1 = (Integer.valueOf(store));
            int finalCheck = mt.checkPrimenumber(number1);
            if (finalCheck == 0) {
                System.out.println("The number is Emirp number");
            }
        } else {
            System.out.println("The number is not Emirp Number");
        }
    }
}
