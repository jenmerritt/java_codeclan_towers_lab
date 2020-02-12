import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkGuestIntoBedroom(Bedroom bedroom, Guest guest) {
        if(bedroom.hasCapacity()){
            bedroom.addGuest(guest);
        }
    }

    public void checkGuestIntoConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        if(conferenceRoom.hasCapacity()) {
            conferenceRoom.addGuest(guest);
        }
    }

    public void checkOutAllGuests(Bedroom bedroom) {
        bedroom.clearRoom();
    }
}
