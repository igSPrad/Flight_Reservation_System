import java.awt.dnd.DropTarget;
import java.util.Arrays;
import java.util.Date;

public class RegularTicket extends Ticket{

    private static int counter;
    private String[] services = new String[10];

    public void addService(String service){
        services[counter] = service;
        counter++;
    }

    public void remService(String service){
        String[] arr_new = new String[services.length-1];
        for(int i=0, k=0; i<services.length; i++){
            if(services[i]!=service) {
                arr_new[k] = services[i];
                k++;
            }
        }
        services = arr_new;
    }

    public String[] getServices(){
        return services;
    }

    public RegularTicket(String departure, String destination, Flight flight, String arrivalTime, String departureTime, Passenger passenger, double price, boolean status, String duration){
        super(departure, destination, flight, arrivalTime, departureTime, passenger, price, status, duration);
        this.counter = 0;
    }



}