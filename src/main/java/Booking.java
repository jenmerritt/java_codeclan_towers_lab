public class Booking {

    private Bedroom bedroom;
    private Integer nights;
    private Guest guest;

    public Booking(Bedroom bedroom, Integer nights, Guest guest){
        this.bedroom = bedroom;
        this.nights = nights;
        this.guest = guest;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public Integer getNights(){
        return this.nights;
    }
}
