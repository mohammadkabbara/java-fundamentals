package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {

    double delta=0.000;

    @Test
    public void testReturnBody() {
        Review review = new Review("This restaurant good", "ahmad", 4);
        assertEquals("testGetBody should return: ", "This restaurant good", review.getBody());
    }

    @Test
    public void testReturnAuthor(){
        Review review = new Review("This restaurant  good", "mohammad", 4);
        assertEquals("testGetAuthor should return: ", "mohammad", review.getAuthor());
    }


}