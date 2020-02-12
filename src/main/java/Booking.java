public class Booking {

    private Bedroom bedroom;
    private Integer nights;
    private Guest guest;

    public Booking(Bedroom bedroom, Integer nights, Guest guest){
        this.bedroom = bedroom;
        this.nights = nights;
        this.guest = guest;
    }
}
