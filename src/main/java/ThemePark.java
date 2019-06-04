import org.w3c.dom.Attr;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<IReviewed> reviews;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    public ThemePark() {
        this.reviews = new ArrayList<IReviewed>();
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public void addReviewed(IReviewed reviewed){
        reviews.add(reviewed);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return reviews;
    }
    public void addAttraction(Attraction attraction){
        attractions.add(attraction);
    }

    public void addStall(Stall stall){
        stalls.add(stall);
    }

    public void visit(Visitor visitor, Attraction attraction){

    }

    public String displayEachRating(){
        ArrayList<String> array = new ArrayList<String>();
        for(IReviewed review: reviews){
            array.add(review.getName() +": "+review.getRating()+" ");
        }
        String string = "";
        for(String element: array){
            string += element;
        }
        return string;
    }
}
