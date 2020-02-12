import org.junit.Before;

public class HotelTest {

    private Hotel theNorth;
    private Bedroom bedroom1;
    private Bedroom theSuite;
    private ConferenceRoom theMapleLounge;
    private Guest ryanReynolds;
    private Guest shaniaTwain;
    private Guest celineDion;

    @Before
    public void before(){
        theNorth = new Hotel();
        bedroom1 = new Bedroom(1, 1, "single");
        theSuite = new Bedroom(3, 99, "suite");
        theMapleLounge = new ConferenceRoom(2, "The Maple Lounge");
        ryanReynolds = new Guest("Ryan Reynolds");
        shaniaTwain = new Guest("Shania Twain");
        celineDion = new Guest("Celine Dion");
    }

}
