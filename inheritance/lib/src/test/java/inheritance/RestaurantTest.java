package inheritance;
//import org.testng.annotations.Test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;

public class RestaurantTest {
    double delta=0.000;
    @Test
    public void testReturnNumOfStars(){
        Restaurant testRestaurant = new Restaurant("pizza", 4);

        assertEquals("test returnName should return:" ,0 , testRestaurant.getNumOfStars(),delta);
    }

    @Test
    public void testReturnPriceCategory() {
        Restaurant testRestaurant = new Restaurant("pizza", 1);

        assertEquals("test returnPriceCategory should return:",1 , testRestaurant.getPriceCategory());
    }




}