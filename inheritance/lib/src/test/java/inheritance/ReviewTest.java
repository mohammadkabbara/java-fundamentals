package inheritance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    @Test
    public void testReturnBody() {
        Review review = new Review("good restaurant", "mohammad", 4);

        assertEquals("testGetBody should return: ", "good restaurant", review.getBody());
    }


    @Test
    public void testReturnAuthor(){
        Review review = new Review("good restaurant", "mohammad", 4);

        assertEquals("testGetAuthor should return: ", "mohammad", review.getAuthor());
    }



    @Test
    public void testReturnStars() {
        Review review = new Review(" good restaurant", "mohammad", 4);

        assertEquals("test returnPriceCategory should return:",4.0 , review.getStars());
    }

    @Test
    public void testToString(){
        Review review = new Review("good restaurant", "mohammad", 5);

        String outPut ="Review{author='mohammad', body='good restaurant', stars=5.0}";
        assertEquals(outPut,review.toString(),"Review{author='mohammad', body='good restaurant', stars=5.0}");
    }
}
