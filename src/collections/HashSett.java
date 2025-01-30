package collections;

public class HashSett {

public StoreHashSetObjects myHashObjects(){
    StoreHashSetObjects sb=new StoreHashSetObjects("HITAM",234);
    return sb;
}

    public static void main(String[] args) {

        HashSett ht=new HashSett();
        StoreHashSetObjects sob=ht.myHashObjects();
        System.out.println(sob.colgName+" "+sob.rollNumber);
    }
}
