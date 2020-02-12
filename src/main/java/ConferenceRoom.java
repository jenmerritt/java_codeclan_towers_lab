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
}
