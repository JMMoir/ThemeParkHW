public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;

    }
}
