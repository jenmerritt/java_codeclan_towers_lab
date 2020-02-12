import java.util.ArrayList;

public class ConferenceRoom {

    private Integer capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(Integer capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
