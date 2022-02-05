public class Contact{

    private String name;

    private String emailId;

    private String phoneNo;

    public Contact(String pName, String emailId, String phoneNo){
        this.name = pName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    public String getName(){
        return name;
    }

    public String getEmailId(){
        return emailId;
    }

    public String getPhoneNo(){
        return phoneNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
}
