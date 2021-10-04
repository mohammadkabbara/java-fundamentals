package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Shop extends Points {

    ///// fields for shop
//    private String name;
//    private double numOfStars = 0.0;
//    private int priceCategory;
//    public int stars;
//    public LinkedList<Review> reviews = new LinkedList<Review>();

    private String name;
    public int stars;
    private String description;
    private int dollarSigns;

    private ArrayList<Review> reviews;


    ////// constructor
    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;

        this.reviews = new ArrayList<Review>();

    }

    ///// setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDollarSigns(int dollarSigns) {
        this.dollarSigns = dollarSigns;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }

    /////// toString
    @Override
    public String toString() {
        String dollar = "";
        for (int i = 0; i < dollarSigns; i++) {
            dollar += "$";
        }

        return "shop{" + "name='" + name + '\'' + ", stars=" + stars + ", dollarSigns=" + dollar + ", " +
                "reviews=" + reviews + '}';
    }


    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
        }
        int sum = 0;
        for (Review reviewNum : reviews) {
            sum += reviewNum.stars;
        }
        stars = sum / reviews.size();
    }

}