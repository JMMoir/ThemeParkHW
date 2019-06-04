import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.reviews = new ArrayList<IReviewed>();
    }

    public void addReviewed(IReviewed reviewed){
        reviews.add(reviewed);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return reviews;
    }
}
