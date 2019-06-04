public class PlayGround extends Attraction implements ISecurity {

    public PlayGround(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        int age = visitor.getAge();
        return visitor.getAge() >= 15;
    }

}
