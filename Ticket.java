import java.util.*;

public abstract class Ticket {

    private String ticketType;

    Random rand = new Random();
    private int PNR;

    private String departure;

    private String destination;

    private Flight flight;  //object still not assigned

    private String arrivalTime;

    private String departureTime;

    private Passenger passenger;//passenger object

    private double price;

    private boolean status = false;

    private String duration;

    public Ticket(String departure, String destination, Flight flight, String arrivalTime, String departureTime, Passenger passenger, double price, boolean status, String duration){
        this.PNR = rand.nextInt(1000);
        this.departure = departure;
        this.destination = destination;
        this.flight = flight;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.passenger = passenger;
        this.price = price;
        this.status = status;
        this.duration = duration;
    }

    public String getTicketType(){
        return ticketType;
    }

    public void setTicketType(String ticketType){
        this.ticketType = ticketType;
    }

    public int getPNR(){
        return PNR;
    }

    /*public void setPNR(int PNR){
        this.PNR = PNR;
    }*/

    public String getDeparture(){
        return departure;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public String getArrivalTime(){
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    }

    public Passenger getPassenger(){
        return passenger;
    }

    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getDuration(){
        return duration;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }
}
