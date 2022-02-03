import java.util.Scanner;

public class Passenger extends Flight{
    public static String Name;
    public static String Aadharcard;
    String getName(){
        return name;
    }
    public void setName(String Name){
        this.name=Name;
    }
    void show1() {
        Scanner avi=new Scanner(System.in);
        System.out.println("Enter Your Aadharcard_No");
        Aadharcard=avi.nextLine();
        System.out.println("\n"+"Passenger Id_NO: "+Aadharcard);
    }

}