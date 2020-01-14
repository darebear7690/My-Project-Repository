
import java.util.Scanner;

public class registerUser {
	public static int login(String username, String password) {

		return -1;
	}

	public static void main(String[] args) {

		String userName, password;
		Scanner log = new Scanner(System.in);

		System.out.println("Enter username");
		userName = log.nextLine();
		System.out.println("Enter password");
		password = log.nextLine();

		if (userName.equals("user") && password.equals("user"))

		{
			System.out.println(" Congrats you're registered");
		}

		else {
			System.out.println("Registration failed");
		}
		}
}