package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Book{
    public int getId() {
        return id;
    }

    int id;
        private String firstName;
        private String lastName;
        private String cityName;
        private String state;
        int zip;
        String number;

    public Book(int id, String firstName, String lastName, String cityName, String state, int zip, String number) {
        this.id = id;
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
        return id+" "+firstName+" "+lastName+" "+cityName+" "+state+" "+zip+" "+number;
    }

}
class DeleteDetail{
    public void Method(){
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> c = new ArrayList<Book>();
        int ch;
        do{
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Delete");

            System.out.println("Enter Your Choice : ");
            ch = scan.nextInt();

            switch(ch){
                case 1:
                    System.out.println("----------------------------------");
                    System.out.print("Enter Person id : ");
                    int id = scan.nextInt();
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
                    c.add(new Book(id,firstName,lastName,cityName,state,zip,number));
                    System.out.println(c.toString());
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    Iterator<Book> i = c.iterator();
                    while(i.hasNext()){
                        Book a = i.next();
                        System.out.println(a);
                    }
                    System.out.println("---------------------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter Person Name To Delete : ");
                    String name = sc.nextLine();
                    System.out.println("-----------------------------");
                    i = c.iterator();
                    while(i.hasNext()){
                        Book b = i.next();
                        if (b.getFirstName().equals(name)){
                            c.remove(b);
                            found = true;
                        }
                    }
//                    for (Book b: c){
//                        if(b.getFirstName() == name){
//                           c.remove(b);
//                           found = true;
//                        }
//                    }
                    if (!found){
                        System.out.println("Record Not Found ");
                    }else {
                        System.out.println("Record Deleted Successfully .....");
                    }
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("Invalid Input ");
            }
        }while(ch!=0);
    }
}
public class UseCase4 {
    public static void main(String[] args) {
        DeleteDetail obj = new DeleteDetail();
        obj.Method();
    }
}
