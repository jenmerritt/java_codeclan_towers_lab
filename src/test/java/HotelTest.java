import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        bedroom1 = new Bedroom(1, 1, "single", 20);
        theSuite = new Bedroom(3, 99, "suite", 100);
        theMapleLounge = new ConferenceRoom(2, "The Maple Lounge");
        ryanReynolds = new Guest("Ryan Reynolds");
        shaniaTwain = new Guest("Shania Twain");
        celineDion = new Guest("Celine Dion");
    }

    @Test
    public void can_check_guest_into_bedroom_has_capacity(){
        theNorth.checkGuestIntoBedroom(theSuite, shaniaTwain);
        assertEquals(1, theSuite.getNumberOfGuests());
    }

    @Test
    public void can_not_add_guest_if_bedroom_over_capacity(){
        theNorth.checkGuestIntoBedroom(bedroom1, ryanReynolds);
        theNorth.checkGuestIntoBedroom(bedroom1, celineDion);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void can_check_guest_into_conference_room_has_capacity(){
        theNorth.checkGuestIntoConferenceRoom(theMapleLounge, shaniaTwain);
        assertEquals(1, theMapleLounge.getNumberOfGuests());
    }

    @Test
    public void can_not_add_guest_if_conference_room_over_capacity(){
        theNorth.checkGuestIntoConferenceRoom(theMapleLounge, shaniaTwain);
        theNorth.checkGuestIntoConferenceRoom(theMapleLounge, celineDion);
        theNorth.checkGuestIntoConferenceRoom(theMapleLounge, ryanReynolds);
        assertEquals(2, theMapleLounge.getNumberOfGuests());
    }

    @Test
    public void check_out_clears_bedroom_guest_list(){
        theNorth.checkGuestIntoBedroom(bedroom1, ryanReynolds);
        theNorth.checkOutAllGuests(bedroom1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void check_out_removes_guest_from_conference_room__guest_exists(){
        theNorth.checkGuestIntoConferenceRoom(theMapleLounge, shaniaTwain);
        theNorth.checkGuestOutOfConference(theMapleLounge, shaniaTwain);
        assertEquals(0, theMapleLounge.getNumberOfGuests());
    }

    @Test
    public void can_add_booking_to_list_of_booking(){
        theNorth.createBooking(theSuite, 3, ryanReynolds);
        assertEquals(1, theNorth.getNumberOfBookings());
    }

}
