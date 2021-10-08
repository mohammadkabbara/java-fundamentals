package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {

    @Test
    public void testReturnName() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnName should return:" ,"pizza" , testRestaurant.getName());
    }
    @Test
    public void testReturnNumOfStars(){
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnStars should return:", 0.0 , testRestaurant.getNumOfStars());
    }

    @Test
    public void testReturnPriceCategory() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnPriceCategory should return:",1 , testRestaurant.getPriceCategory());
    }



}
