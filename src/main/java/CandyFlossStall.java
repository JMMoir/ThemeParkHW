public class CandyFlossStall extends Stall implements ITicketed{

    public CandyFlossStall(String name, String ownerName, String parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice(){
        return 4.20;
    }
    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
