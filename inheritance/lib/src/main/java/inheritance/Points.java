//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Points {
//    public String name;
    public double stars;
    private ArrayList<Review> reviews = new ArrayList();

    public Points() {
    }

    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
        }

        int sum = 0;

        Review reviewNum;
        for(Iterator iterator = this.reviews.iterator();
            iterator.hasNext();
            sum = (int)((double)sum + reviewNum.stars)) {

            reviewNum = (Review)iterator.next();
        }

        this.stars = (double)(sum / this.reviews.size());
    }
}