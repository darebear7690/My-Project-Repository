
import java.util.Scanner;

public class Login {
	public static int login(String username, String password) {

		return -1;
	}

	public static void main(String[] args) {
		
		//CarOffer offer = new CarOffer();
		//offer.Result = this.Result;
		
		
		String userName, password;
		Scanner log = new Scanner(System.in);

		System.out.println("Enter username");
		userName = log.nextLine();
		System.out.println("Enter password");
		password = log.nextLine();
		

		if (userName.equals("user") && password.equals("user"))

		{
			System.out.println(" Authentication Successful");
		}

		else {
			System.out.println("Authentication Failed");

		}

		// System.out.println("username is" + userName);
		// System.out.println(" password is" + password);
		log.close();
	}
}
