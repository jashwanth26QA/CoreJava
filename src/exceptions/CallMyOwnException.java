package exceptions;

public class CallMyOwnException {


    public static void checkMyVotingAge(int age) throws MyOwnException {

            if (age > 18) {
                System.out.println("Yes, Your eligible to vote!!!");
            }
        else{
                throw new MyOwnException("Your are not eligible to vote");
            }
        System.out.println("This is the next step after voting the right candidate");
    }
    public static void main(String[] args) throws MyOwnException {
        CallMyOwnException coe=new CallMyOwnException();
        checkMyVotingAge(15);

    }
}
