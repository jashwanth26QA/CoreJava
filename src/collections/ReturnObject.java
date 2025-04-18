package collections;

public class ReturnObject {

    private String message;

    ReturnObject(String msg){
        this.message=msg;
    }
    public ReturnObject myBall(){
        return new ReturnObject("Learn Java");
    }

    public static void main(String[] args) {
        ReturnObject rob= new ReturnObject("");
        rob= rob.myBall();
        System.out.println(rob);
    }
}
