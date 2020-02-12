import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom theMapleLounge;
    private Guest ryanReynolds;
    private Guest shaniaTwain;
    private Guest celineDion;

    @Before
    public void before(){
        theMapleLounge = new ConferenceRoom(2, "The Maple Lounge");
        ryanReynolds = new Guest("Ryan Reynolds");
        shaniaTwain = new Guest("Shania Twain");
        celineDion = new Guest("Celine Dion");
    }

    @Test
    public void can_get_capacity(){
        assertEquals(2, theMapleLounge.getCapacity());
    }

    @Test
    public void number_of_guests_starts_at_zero(){
        assertEquals(0, theMapleLounge.getNumberOfGuests());
    }

    @Test
    public void can_add_guest(){
        theMapleLounge.addGuest(shaniaTwain);
        theMapleLounge.addGuest(celineDion);
        assertEquals(2, theMapleLounge.getNumberOfGuests());
    }

    @Test
    public void empty_room_has_capacity(){
        assertEquals(true, theMapleLounge.hasCapacity());
    }

    @Test
    public void can_not_add_guest_if_room_over_capacity(){
        theMapleLounge.addGuest(celineDion);
        theMapleLounge.addGuest(shaniaTwain);
        theMapleLounge.addGuest(ryanReynolds);
        assertEquals(2, theMapleLounge.getNumberOfGuests());
    }
}
