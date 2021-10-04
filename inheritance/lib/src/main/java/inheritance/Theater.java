package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    ///// fields for theater

    private String name;
    public int stars;
    private ArrayList<Review> reviews = new ArrayList<>();
    public List<String> movies= new ArrayList<>();

    ////// constructor
    public Theater(String name) {
        this.name = name;
//        this.reviews = reviews;
//        this.movies = movies;
    }

    ///// setter and getter
    public void setName(String name) {
        this.name = name;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public List<String> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "Theater{" + "name='" + name + '\'' + ", reviews=" + reviews + ", movies=" + movies + '}';
    }

    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName) {
        this.movies.remove(movieName);
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
}
