public class Source {
    public static void main(String[] args) {

        Contact ct=new Contact();
        RegularTicket rtc=new RegularTicket();
        rtc.setPnrNum("982135429009");
        rtc.setSeat_no("S2/186");
        rtc.setFlight_time("3.22pm");
        rtc.Ac_Details("not available");
        rtc.setTicketFare(5000);
        TouristTicket ttc=new TouristTicket();
        ttc.setPnrNum("7845896325687");
        ttc.setSeat_no("S3/185");
        ttc.setFlight_time("04:00pm");
        ttc.Ac_Details("It is Available");
        ttc.setTicketFare(5000);
        Passenger pass=new Passenger();
        pass.setFlight_name("IndiGo");
        pass.setFlight_Num("IDG,5555");
        ct.setArrival(ct.arrival);
        ct.setDeparture(ct.departure);
        ct.setFlightDate(ct.FlightDate);
        ct.show4();
        ct.show();
        pass.setName(ct.name);
        pass.show1();
        
        //All Details OUTPUT
        System.out.println("Date: "+ct.getFlightDate());
        System.out.println("Passenger Name: "+pass.getName());
        System.out.println();
        System.out.println("*****Flight Detail*****");
        System.out.print  ( "\t|\t" +" Flight_Name: "+ pass.getFlight_name());
        System.out.print  ( "\t|\t" +"Flight_Number: "+ pass.getFlight_Num());
        System.out.print  ( "\t|\t" +"Arrival: "+ ct.getArrival());
        System.out.println ("\t|\t" +"Departure: "+ ct.getDeparture());
        System.out.println("*****REGULAR TICKET*****");
        System.out.print  ( "\t|\t" +"PnrNum: "+ rtc.getPnrNum());
        System.out.print  ( "\t|\t" +"Seat_NO: "+ rtc.getSeat_no());
        System.out.print  ( "\t|\t" +"Time: "+ rtc.getFlight_time());
        System.out.print  ( "\t|\t" +"AC_Detail: "+ rtc.getAc_Details());
        System.out.println ("\t|\t" +"Fare: "+ rtc.getTicketFare());
        System.out.println();
        System.out.println("*****Tourist Ticket*****");
        System.out.print  ( "\t|\t" +"PnrNum: "+ ttc.getPnrNum());
        System.out.print  ( "\t|\t" +"Seat_NO: "+ ttc.getSeat_no());
        System.out.print  ( "\t|\t" +"Time: "+ ttc.getFlight_time());
        System.out.print  ( "\t|\t" +"AC_Detail: "+ ttc.getAc_Details());
        System.out.print  ( "\t|\t" +"Fare: "+ ttc.getTicketFare());


    }
}