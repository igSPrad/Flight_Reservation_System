public class RegularTicket extends Ticket {

    private String PnrNum;
    private String Seat_no;
    private String Ac_Details;
    private String Flight_time;
    private int TicketFare;
    String getPnrNum(){
        return PnrNum;
    }
    public void setPnrNum(String PnrNum){
        this.PnrNum=PnrNum;
    }

    String getSeat_no(){
        return Seat_no;
    }
    public void setSeat_no(String Seat_no){
        this.Seat_no=Seat_no;
    }

    String getAc_Details(){
        return Ac_Details;
    }
    public void Ac_Details(String Ac_Details){
        this.Ac_Details=Ac_Details;
    }

    String getFlight_time(){
        return Flight_time;
    }
    public void setFlight_time(String Flight_time){
        this.Flight_time=Flight_time;
    }
    int getTicketFare(){
        return TicketFare;
    }
    public void setTicketFare(int TicketFare){
        this.TicketFare=TicketFare;
    }

}