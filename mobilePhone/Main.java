package mobilePhone;
import java.util.*;
public class Main {
	public static void main(String[] args){
		MobilePhone m = new MobilePhone();
		Scanner in = new Scanner(System.in);
		boolean end = false;
		while(!end){
			displayoptions();
			System.out.println("Please enter an option from the ones prescribed above");
			int choice = in.nextInt();
			switch(choice){
				case 0:
					System.out.println("Goodbye");
					end = true;
					break;
				case 1:
					m.printContacts();
					break;
				case 2:
					System.out.println("Please enter a name");
					String name = in.nextLine();
					System.out.println("Please enter a number");
					String number = in.nextLine();
					Contacts c = new Contacts(name, number);
					if(m.find(c))
						System.out.println("Duplicate Contact");
					else{
						m.addContact(c);
					}
					break;
				case 3:
					System.out.println("Please enter a name");
					String newname = in.nextLine();
					System.out.println("Please enter a number");
					String newnumber = in.nextLine();
					Contacts cnew = new Contacts(newname, newnumber);
					//check for existence already
					if(!m.findName(newname))
						System.out.println("Contact is not present");
					else{
						m.updateContact(cnew);
					}
					break;
				case 4:
					System.out.println("Please enter a name");
					String name1 = in.nextLine();
					System.out.println("Please enter a number");
					String number1 = in.nextLine();
					Contacts c1 = new Contacts(name1, number1);
					//check for existence already
					if(!m.find(c1))
						System.out.println("Contact is not present");
					else{
						m.deleteContact(c1);
					}
					break;
				case 5:
					break;
				default:
					System.out.println("You haven't chosen a valid option, please choose again");
					break;
			}
		}
		in.close();
	}
	public static void displayoptions(){
		System.out.println("0: Quit");
		System.out.println("1: Print list of contacts that are available");
		System.out.println("2: Add new contact");
		System.out.println("3: Update existing contact");
		System.out.println("4: Remove a contact");
		System.out.println("5: Search/Find a contact");
	}
}
