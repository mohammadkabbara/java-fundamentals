package inheritance;

public class Review {

    private String body;
    private String author;
    public double stars;


    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public String getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Review{" + "author='" + author + '\'' + ", body='" + body + '\'' + ", stars=" + stars + '}';

    }
}
