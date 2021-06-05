package email;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("Hi "+ this.firstName+ " your email has created ");
		
		this.department = setDepartment();
		System.out.print("Department: "+ this.department);
		
		
	}
	
	private String setDepartment() {
		String choices = "Choice a department \n " +
				         "1. for sales \n"+
				         "2. for development \n"+
				         "3. for Accounting \n"+
				         "4. nothing from above \n";
		
		System.out.print(choices);
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
		if(userChoice == 1) {
			return "sales";
		}
		else if(userChoice == 2) {
			return "dev";	
		}
		else if(userChoice == 3) {
			return "acct";	
		}
		else {
			return "";
		}
		
		
	}
	
	
	


	

}
