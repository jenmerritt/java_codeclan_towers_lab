import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest ryanReynolds;
    private Guest shaniaTwain;
    private Guest celineDion;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 1, "Single");
        ryanReynolds = new Guest("Ryan Reynolds");
        shaniaTwain = new Guest("Shania Twain");
        celineDion = new Guest("Celine Dion");
    }

    @Test
    public void can_get_capacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void number_of_guests_starts_at_zero(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void can_add_guest(){
        bedroom.addGuest(ryanReynolds);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void empty_room_has_capacity(){
        assertEquals(true, bedroom.hasCapacity());
    }

    @Test
    public void can_clear_room(){
        bedroom.addGuest(ryanReynolds);
        bedroom.clearRoom();
        assertEquals(0, bedroom.getNumberOfGuests());
    }
}
