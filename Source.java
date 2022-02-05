import java.util.Scanner;

public class Source {
    static int Counter = 0;
    public static void BookTicket(Flight[] flights, Ticket[] tickets){
        Scanner st = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = st.nextLine();
        System.out.print("Enter Email ID: ");
        String emailId = st.nextLine();
        System.out.print("Enter Phone No.: ");
        String phoneNo = st.nextLine();
        System.out.println("Enter Your Street: ");
        String street = st.nextLine();
        System.out.println("Enter Your City: ");
        String city = st.nextLine();
        System.out.println("Enter Your State: ");
        String state = st.nextLine();

        Contact contact = new Contact(name, emailId, phoneNo);
        Address address = new Address(street, city, state);
        Passenger passenger = new Passenger(contact, address);

        System.out.println("1. AirIndia\n2. SpiceJet\n3. IndiGo\n 4.Exit");
        System.out.println("Choose Your Flight: ");
        int choice = st.nextInt();
        Flight flight = new Flight();
        switch (choice){
            case 1: flight = flights[choice-1];
            break;
            case 2: flight = flights[choice-1];
            break;
            case 3: flight = flights[choice-1];
            break;
            case 4:
                break;
            default:
                System.out.println("Invalid Choice.");
        }

        System.out.println("1. Regular Ticket\n2. Tourist Ticket");
        System.out.println("Choose your Ticket Type: ");
        choice = st.nextInt();

        switch(choice){
            case 1: RegularTicket ticket = new RegularTicket("Mumbai","Delhi",flight,"06:30AM","07:00AM",passenger,4000,true,"03hrs");
                ticket.setTicketType("Regular Ticket");
                System.out.println("Add Service which you needed!!");
                String service;
                service = st.nextLine();
                ticket.addService(service);
                System.out.println("Add Service which you needed!!");
                service = st.nextLine();
                ticket.addService(service);
                System.out.println("Add Service which you needed!!");
                service = st.nextLine();
                ticket.addService(service);
                tickets[Counter] = ticket;
                System.out.println("PNR number is: "+tickets[Counter].getPNR());
                Counter++;
                int x = flight.getNoOfSeatBooked();
                flight.setNoOfSeatBooked(x+1);
                break;

            case 2: TouristTicket ticket1 = new TouristTicket("Mumbai","Delhi",flight,"06:30AM","07:00AM",passenger,4000,true,"03hrs");
                ticket1.setTicketType("Tourist Ticket");
                System.out.println("Enter Your Hotel Street: ");
                street = st.nextLine();
                System.out.println("Enter Your Hotel City: ");
                city = st.nextLine();
                System.out.println("Enter Your Hotel State: ");
                state = st.nextLine();

                String location;
                for (int i=0; i<5; i++){
                    System.out.println("Enter Location: ");
                    location = st.nextLine();
                    ticket1.addLocation(location);
                }

                tickets[Counter] = ticket1;
                Counter++;
                x = flight.getNoOfSeatBooked();
                flight.setNoOfSeatBooked(x+1);

            default:
                System.out.println("Invalid Choice");
        }

    }

    public static void CheckSeatAvailability(Flight[] flights){
        for(Flight f:flights){
            System.out.println(f.getAirline()+" available seats: "+f.getAvailableSeats());

        }
    }

    public static void CheckPNRstatus(Ticket[] tickets){

        System.out.println("Enter Your PNR Number: ");
        Scanner sc = new Scanner(System.in);
        int pnrNum = sc.nextInt();
        int count = 0;
        for(int i=0; i<tickets.length; i++){
           if(tickets[i] != null){
               if (tickets[i].getPNR() == pnrNum) {
                   System.out.println("ticket status: "+(tickets[i].getStatus() ? "Booked" : "Cancelled"));
                   count = 1;
               }
           }
        }
        if (count == 0){
            System.out.println("PNR not found");
        }
    }

    public static void PrintTicket(Ticket[] tickets){

        System.out.println("Enter PNR Number: ");
        Scanner sc = new Scanner(System.in);
        int pnrNum = sc.nextInt();
        int count = 0;
        for (Ticket t:tickets){
            if(t != null) {
                if (t.getPNR() == pnrNum) {
                    System.out.println("Ticket Type: " + t.getTicketType() + "\n PNR Number: " + t.getPNR() + "\n Passenger Name: " + t.getPassenger().getContact().getName() + "\n Ticket status: " + t.getStatus() + "\n Price: " + t.getPrice() + "\n Flight Name: " + t.getFlight().getAirline() + "\n Departure: " + t.getDeparture() + "\n Destination: " + t.getDestination() + "\n Duration: " + t.getDuration());
                    count = 1;
                }
            }
        }
        if (count == 0){
            System.out.println("PNR not found");
        }
    }

    public static void CancelTicket(Ticket[] tickets){
        System.out.println("Enter PNR Number: ");
        Scanner sc = new Scanner(System.in);
        int pnrNum = sc.nextInt();
        int count = 0;
        for (Ticket t:tickets){
            if(t != null) {
                if (t.getPNR() == pnrNum) {
                    t.setStatus(false);
                    t.getFlight().setNoOfSeatBooked(t.getFlight().getNoOfSeatBooked()-1);
                    count = 1;
                }
            }
        }
        if(count == 0){
            System.out.println("PNR not found");
        }
    }

    /*public static void EXIT(){
        System.exit
    }*/

    public static void main(String[] args){

        Ticket[] tickets = new Ticket[100];
        Flight[] flights = new Flight[3];
        /*Passenger passenger = new Passenger(new Contact("Sagar","xyz@gmail.com","9324253163"),
                new Address("Lamington","Mumbai","Maharashtra"));
        Flight flight = new Flight(1234,"AirIndia",200,99);
        Ticket ticket1 = new RegularTicket(246810,"Mumbai","Delhi",flight,"02:30pm","02:45 pm",passenger,1500,true,"02:45");*/

         flights[0] = new Flight(1234,"Air India",200,99);
         flights[1] = new Flight(5678,"Spice Jet",200,78);
         flights[2] = new Flight(9101,"IndiGo",200,50);

        Scanner sc = new Scanner(System.in);
        int choice=0;
        while(choice != 6) {
            System.out.println("1. Book Your Ticket\n2. Check Seat Availability\n3. Check PNR Status\n4. Print Your Ticket\n5. Cancel your Ticket\n6. EXIT");

            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BookTicket(flights, tickets);
                    break;
                case 2:
                    CheckSeatAvailability(flights);
                    break;
                case 3:
                    CheckPNRstatus(tickets);
                    break;
                case 4:
                    PrintTicket(tickets);
                    break;
                case 5:
                    CancelTicket(tickets);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }
        }

    }
}
