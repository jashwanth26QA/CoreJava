package myjavaconcepts;

public class SetterAndGettersMethod {

    String name;
    int rollId;

    public void setName(String name) {
        this.name = name;

    }

    public void setRollCall(int rollNum) {
        this.rollId = rollNum;
    }


    public String getName() {
        return name;
    }

    public int getRoll() {
        return rollId;
    }

    public static void main(String[] args) {

        SetterAndGettersMethod sg = new SetterAndGettersMethod();
        SetterAndGettersMethod sg1 = new SetterAndGettersMethod();
        System.out.println("This is to implement Setter and Getter methods");
        sg.setName("Jashwanth");
        sg.setRollCall(123);
        sg1.setName("Sireesha");
        sg1.setRollCall(199);
        System.out.println(sg.getName());
        System.out.println(sg.getRoll());
        System.out.println(sg1.getName());
        System.out.println(sg1.getRoll());
    }
}
