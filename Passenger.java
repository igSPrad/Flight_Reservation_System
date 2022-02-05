public class Passenger {

    private static int idCounter = 100;

    private int id;

    private Contact contact;

    private Address address;

    public Passenger(Contact contact, Address address){
        this.contact = contact;
        this.address = address;
        id = idCounter;
        idCounter += 1;
    }

    public int getPassengerCount(){
        return idCounter - 100;
    }

    public int getId(){
        return id;
    }

    public Contact getContact(){
        return contact;
    }

    public Address getAddress(){
        return address;
    }

    public void setContact(Contact contact){
        this.contact = contact;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}
