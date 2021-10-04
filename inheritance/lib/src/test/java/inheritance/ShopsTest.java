package inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShopsTest {


    @Test
    public void testShopName() {
        Shop testShop = new Shop("best movie", "this shop for the best movie",2);
        assertEquals("this testShop should return:" ,"best movie" , testShop.getName());
    }



    @Test
    public void testShopDollarSigns() {
        Shop testShop = new Shop("best movie", "this shop for the best movie",2);
        assertEquals("this testShop should return:" ,2 , testShop.getDollarSigns());
    }

    @Test
    public void testShopToString() {
        Shop testShop = new Shop("best movie", "this shop for the best movie",2);
        String output="shop{name='best movie', stars=5, dollarSigns=$$, reviews=[Review{author='mohammad', body='good shop', stars=5}]}";

        assertEquals(output,testShop.toString() ,"shop{name='best movie', stars=0, dollarSigns=$$, reviews=[]}");
    }

}