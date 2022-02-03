public class Flight extends Address{
    private String Flight_name;
    private String Flight_Num;
    public String arrival;
    public String Departure;

    String getFlight_name(){
        return Flight_name;
    }
    public void setFlight_name(String Flight_name){
        this.Flight_name=Flight_name;
    }

    String getFlight_Num(){
        return Flight_Num;
    }
    public void setFlight_Num(String Flight_Num){
        this.Flight_Num=Flight_Num;
    }
    public String getArrival(){
        return arrival;
    }
    public void setArrival(String arrival){
        this.arrival=arrival;
    }

    public String getDeparture(){
        return Departure;
    }
    public void setDeparture(String Departure){
        this. Departure= Departure;
    }
}