package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class AddressBook2{
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

    public AddressBook2(int id, String firstName, String lastName, String cityName, String state, int zip, String number) {
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
class EditPerson{
    public void Method(){
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<AddressBook2> c = new ArrayList<AddressBook2>();
        int ch;

        do {
            System.out.println("1.Insert");
            System.out.println("2.Display");
            System.out.println("3.Edit");

            System.out.println("Enter Your Choice : ");
            ch = scan.nextInt();

            switch (ch) {
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
                    c.add(new AddressBook2(id, firstName, lastName, cityName, state, zip, number));
                    System.out.println(c.toString());
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    Iterator<AddressBook2> i = c.iterator();
                    while (i.hasNext()) {
                        AddressBook2 a = i.next();
                        System.out.println(a);
                    }
                    System.out.println("---------------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter Person name To Edit Details : ");

                    String name1 = sc.nextLine();
                    System.out.println("----------------------------------");
                    ListIterator<AddressBook2> li = c.listIterator();
                    while (li.hasNext()) {
                        AddressBook2 b = li.next();
                        if (b.getFirstName().equals(name1)) {
                            System.out.print("Enter New ID : ");
                            id = scan.nextInt();

                            System.out.print("Enter New First Name : ");
                            firstName = sc.nextLine();

                            System.out.print("Enter New Last Name : ");
                            lastName = sc.nextLine();

                            System.out.print("Enter New City Name : ");
                            cityName = sc.nextLine();

                            System.out.print("Enter State Name : ");
                            state = sc.nextLine();

                            System.out.print("Enter zip Code : ");
                            zip = scan.nextInt();

                            System.out.print("Enter PhoneNumber : ");
                            number = sc.nextLine();

                            li.set(new AddressBook2(id, firstName, lastName, cityName, state, zip, number));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found ");
                    } else {
                        System.out.println("Record Added Successfully .....");
                    }
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("Invalid");
            }
        }while (ch!=0);
        }
    }
public class UseCase3 {
    public static void main(String[] args) {
        EditPerson obj = new EditPerson();
        obj.Method();
    }
}
