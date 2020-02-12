import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
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

    public void checkGuestOutOfConference(ConferenceRoom conferenceRoom, Guest guest) {
        if(conferenceRoom.isGuestInRoom(guest)){
            conferenceRoom.removeGuest(guest);
        }
    }

    public int getNumberOfBookings() {
        return this.bookings.size();
    }

    public void createBooking(Bedroom bedroom, int nights, Guest guest) {
        Booking newBooking = new Booking(bedroom, nights, guest);
        this.bookings.add(newBooking);
    }
}
