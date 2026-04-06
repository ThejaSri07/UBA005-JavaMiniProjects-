package placement;
import java.util.Scanner;

public class registrationForm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter valid Email: ");
		String email=sc.nextLine();
		
		System.out.print("Please enter Password: ");
		String pass=sc.nextLine();
		
		/*System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println(email);
		System.out.println(pass);
		System.out.println("Registration Successful!");*/
		if(name.isEmpty()) {
			System.out.println("Name cannot be empty");
		}
		else if(age<18) {
			System.out.println("Age must be 18 or above");
		}
		else if(String.valueOf(id).length()<9) {
			System.out.println("Please enter valid ID");
		}
		else if(!email.contains("@")) {
			System.out.println("Enter valid email");
		}
		else if(pass.length()<6) {
			System.out.println("Password must be atleast 6 characters");
		}
		else {
			System.out.println("Registartion Successful!");
		}
	}
}
