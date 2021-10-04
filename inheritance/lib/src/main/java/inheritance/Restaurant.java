package inheritance;


import java.util.LinkedList;

public class Restaurant extends Points{

    //fields for restaurant
    private String name;
    private double numOfStars = 0.0;
    private int priceCategory;
    public int stars;
    public LinkedList<Review> reviews = new LinkedList<Review>();

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }




    public void addReview(Review review) {
        if(!reviews.contains(review)) {
            reviews.add(review);
        }
        int sum =0;
        for (Review reviewNum : reviews) {
            sum += reviewNum.stars;
        }
        stars = sum / reviews.size();
    }
//    public void addReview(Review review) {
//        if (!reviews.contains(review)) {
//            reviews.add(review);
//        }
//        int sum = 0;
//        for (Review reviewNum : reviews) {
//            sum += reviewNum.stars;
//        }
//        stars = sum / reviews.size();
//    }


    @Override
    public String toString() {
        String dollar = "";
        for (int i = 0; i < priceCategory; i++) {
            dollar += "$";
        }

        return "Restaurant{" + "name='" + name + '\'' + ", stars=" + stars + ", priceCategory=" + dollar + ", " +
                "reviews=" + reviews + '}';
    }

}