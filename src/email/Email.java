package email;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String email;
	private String companySuffix = "company.com";
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		this.email = firstName.toLowerCase()+ "."+ lastName.toLowerCase() + "@"+department+companySuffix;
	}
	
	private String setDepartment() {
		String choices = "\n New Worker: "+ firstName+
						 "\n Choose your department number \n"+
				         "1. for sales \n"+
				         "2. for development \n"+
				         "3. for Accounting \n"+
				         "4. nothing from above \n";
		
		System.out.print(choices);
		Scanner scanner = new Scanner(System.in);
		int userChoice = scanner.nextInt();
	
		switch(userChoice) {
			case 1: return("sales"); 
			case 2: return("development"); 
			case 3: return("Accounting"); 
			case 4: return(" "); 
			default: return""; 
			

		}
		
		
	}
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLUMNOPQRSTUVEXYZ1234567890";
		char [] password = new char[length];
		for(int i=0; i< length; i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
				
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "\n ***************************"+
				"\n NAME: "+ firstName +
				" " + lastName + 
				"\n COMPANY EMAIL: "+ email+
				"\n MAILBOX CAPACITY: " + mailboxCapacity  + " mb";
		
		
		
	}


	

}
