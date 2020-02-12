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
}
