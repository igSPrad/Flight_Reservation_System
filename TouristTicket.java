import java.util.Date;

public class TouristTicket extends Ticket{
    
    public static int counter;
    private String[] locations = new String[5];
    private Address hotelAddress;

    public void addLocation(String location){
        if(locations.length>5){
            System.out.println("Only Five Locations are allowed!!!");
        }
        else {
            locations[counter] = location;
            counter++;
        }
    }

    public void remLocation(String location){
        String[] arr_new = new String[locations.length-1];
        for(int i=0, k=0; i<locations.length; i++){
            if(locations[i]!=location) {
                arr_new[k] = locations[i];
                k++;
            }
        }
        locations = arr_new;
    }
    
    public TouristTicket(String departure, String destination, Flight flight, String arrivalTime, String departureTime, Passenger passenger, double price, boolean status, String duration){
       super(departure, destination, flight, arrivalTime, departureTime, passenger, price, status, duration);
       this.counter = 0;
    }

    public String[] getLocations(){
        return locations;
    }

    public Address getHotelAddress(){
        return hotelAddress;
    }

    /*public void setLocations(String[] locations){
        this.locations = locations;
    }*/

    public void setHotelAddress(Address hotelAddress){
        this.hotelAddress = hotelAddress;
    }

}