package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterName() {
        Theater theater1 = new Theater("rainbow theater");
        assertEquals("this testShop should return:" ,"rainbow theater" , theater1.getName());
    }

    @Test
    public void testTheaterToString() {
        Theater theater1 = new Theater("rainbow theater");
        String output="shop{name='best movie', stars=5, dollarSigns=$$, reviews=[Review{author='mohammad', body='good shop', stars=5}]}";

        assertEquals(output,theater1.toString() ,"Theater{name='rainbow theater', reviews=[], movies=[]}");
    }




    @Test
    public void testTheaterRemoveMovie() {
        Theater theater1 = new Theater("rainbow theater");
        theater1.addMovie("The Shawshank Redemption");
        theater1.addMovie("Interstellar");
        theater1.addMovie("Joker");
        theater1.removeMovie("Joker");
        String output="Theater{name='rainbow theater', reviews=[], movies=[The Shawshank Redemption, Interstellar]}";

        assertEquals("test add movie should return: ",output,theater1.toString());
    }








}