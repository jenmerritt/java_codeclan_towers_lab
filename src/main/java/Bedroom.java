import java.util.ArrayList;

public class Bedroom {

    private Integer capacity;
    private Integer roomNumber;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(Integer capacity, Integer roomNumber, String type){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.type = type;
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
