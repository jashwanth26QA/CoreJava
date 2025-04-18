package enumpack;

public class SecondEn {

    public static void main(String[] args) {
        int priceRange;
        SECONDENUM sm=SECONDENUM.ORANGE;
        switch(sm){
            case APPLE:
                priceRange =SECONDENUM.APPLE.getPrice();
                System.out.println("The Price range of Apple is "+ priceRange);
                break;
            case ORANGE:
                priceRange=SECONDENUM.ORANGE.getPrice();
                System.out.println("The Price range of Orange is "+ priceRange);
                break;
            case LEMONS:
                priceRange=SECONDENUM.LEMONS.getPrice();
                System.out.println("The Price range of Lemon is "+ priceRange);
                break;
        }
    }
}
