package myjavaconcepts;

public class AbstractClassPart2 {

    public static void main(String[] args) {

        AbstractClassPart1 abc1=new AbstractClassPart1() {
            @Override
            public void show() {
                System.out.println("This is implemented in Abstract class part2 because Abstract class part1 object creation is not possible");
            }
        };

    }
}
