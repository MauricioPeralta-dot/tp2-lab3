//LAB NRO 3 DE: Wilder Mauricio Peralta Ckacka
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        AddressBook addressBook = new  AddressBook();
        addressBook.loadContacts();
        Scanner scanner = new Scanner(System.in);
        Integer option;

        do{
          System.out.println("\\n*** Contact Address Book ***");
          System.out.println("1.Add contact");
          System.out.println("2.View contacts");
          System.out.println("3.Search for contact");
          System.out.println("4.Delete contact");
          System.out.println("5.Exit");
          System.out.println("Selec an option: ");
          option = scanner.nextInt();
          scanner.nextLine();
          
          switch (option) {
            case 1:
                System.out.println("Enter a name: ");
                String name = scanner.nextLine();
                System.out.println("Enter a email: ");
                String email = scanner.nextLine();
                System.out.println("Enter a age: ");
                Integer age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter a phone number: ");
                String phone = scanner.nextLine();
                Contact contact = new Contact(name, email, age, phone);
                addressBook.addContact(contact);
                addressBook.storeContacts();

                break;
            case 2:
                addressBook.viewContacts();
                break;
            case 3:
                System.out.println("Enter the email of the contact to search: ");
                email = scanner.nextLine();
                addressBook.searchContact(email);
                break;
            case 4:
                System.out.println("Enter the email of the contact to delete: ");
                email = scanner.nextLine();
                addressBook.deleteContact(email);
                addressBook.storeContacts();
                break;
            case 5: 
                System.out.println("Exiting...");
                break;
          
            default:
                System.out.println("Invalid option.Please try again.");
                
          }
        }while (option != 5);
            
        }
    
    
}