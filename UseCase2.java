package AddressBook;
import java.util.*;

class AddressBook{
    private String firstName;
    private String lastName;
    private String cityName;
    private String state;
    int zip;
    String number;

    public AddressBook(String firstName, String lastName, String cityName, String state, int zip, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityName = cityName;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getCityName() {
        return cityName;
    }
    public String getState() {
        return state;
    }
    public int getZip() {
        return zip;
    }
    public String getNumber() {
        return number;
    }
    public String toString(){
        return firstName+" "+lastName+" "+cityName+" "+state+" "+zip+" "+number;
    }
}
class AddDetails1{
    public void Method1(){
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<AddressBook> c = new ArrayList<AddressBook>();
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("Enter Your Choice : ");
            ch = scan.nextInt();

            switch(ch){
                case 1:
                    System.out.println("=====");
                    System.out.print("Enter First Name : ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name : ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter City Name : ");
                    String cityName = sc.nextLine();
                    System.out.print("Enter State Name : ");
                    String state = sc.nextLine();
                    System.out.print("Enter zip Code : ");
                    int zip = scan.nextInt();
                    System.out.print("Enter PhoneNumber : ");
                    String number = sc.nextLine();
                    c.add(new AddressBook(firstName,lastName,cityName,state,zip,number));
//                    System.out.println(c.toString());
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    Iterator<AddressBook> i = c.iterator();
                    while(i.hasNext()){
                        AddressBook a = i.next();
                    System.out.println(a);
                    }
                    break;
            }
        }while(ch!=0);
    }
}
public class UseCase2{
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book System");
        AddDetails1 obj = new AddDetails1();
        obj.Method1();
    }
}
