public class TobaccoStall extends Stall implements ISecurity, ITicketed {

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

    public double defaultPrice(){
        return 6.60;
    }
    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
