public class Flight {

    private int flightNo;

    private String airline;

    private int capacity;

    private int noOfSeatBooked;

    private int availableSeats;

    public Flight(int flightNo, String airline, int capacity, int noOfSeatBooked){

        this.flightNo = flightNo;
        this.airline = airline;
        this.capacity = capacity;
        this.noOfSeatBooked = noOfSeatBooked;
        //this.availableSeats = availableSeats;
    }

    public Flight(){

    }

    public int getFlightNo(){
        return flightNo;
    }

    public String getAirline(){
        return airline;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getNoOfSeatBooked(){
        return noOfSeatBooked;
    }

    public int getAvailableSeats(){
        return capacity-noOfSeatBooked;
    }

    public void setFlightNo(int flightNo){
        this.flightNo = flightNo;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setNoOfSeatBooked(int noOfSeatBooked){
        this.noOfSeatBooked = noOfSeatBooked;
    }

    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
}
