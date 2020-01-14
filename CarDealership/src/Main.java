import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dealership Menu");
		
		//create new objects of the class to assign to methods
		Main m = new Main();
		Main s = new Main();
		Main c = new Main();
		Main a = new Main();
		Main b = new Main();

		// assign variables to the different methods to call them
		//int authorize = s.userMenu();
		int choice = m.mainMenu();
		//int select = c.customerMenu();
		
		//create a selection process when logging in based on selecting user, customer, employee,
		if (choice == 4) {
			choice = m.mainMenu();
		} 
			else if(choice == 1 ){
			{choice = s.userMenu();}
		}
		
			else if(choice == 2){
				choice = c.customerMenu();
			}
				else if(choice == 3) {
					choice = a.employeeMenu();
				}
		
				else if(choice == 5) {
					choice = b.systemMenu();
				}
			}
	

	public int mainMenu() {
		System.out.println("Please enter a number\n1. Employee\n2. Customer\n3. User\n4. Exit\n5. System");
		Scanner scan = new Scanner(System.in);
		int choice1 = scan.nextInt();
		return choice1;
	}

	public int userMenu() {

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

		return 0;
	}

	public int systemMenu() {
		int Firstpayment;
		int Secondpayment;
		int Thirdpayment;
		int totalCalc;

		Scanner calculation = new Scanner(System.in);

		System.out.println("Enter monthly payment");
		Firstpayment = calculation.nextInt();

		System.out.println("Enter monthly payment");
		Secondpayment = calculation.nextInt();

		System.out.println("Enter monthly payment");
		Thirdpayment = calculation.nextInt();

		totalCalc = Firstpayment + Secondpayment + Thirdpayment;

		System.out.println("The monthly payment is: " + totalCalc);

		return 0;
	}

	public int login() {
		// public static int login(String username, String password)

		return -1;

		// CarOffer offer = new CarOffer();
		// offer.Result = this.Result;

		String userName;
		String password;
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
		return 0;
	}

	public int employeeMenu() {
			// + 1 will be adding to the car if selected
			String addCar;
				int carTotal = 0;
				Scanner carAmount = new Scanner(System.in);
				System.out.println("Do you want to add a car");
				addCar = carAmount.nextLine();
				
				// As a employee i can add a car to the lot
				for (int i = 0; addCar.equals("yes"); i++)
				{ {
						carTotal += i;
						System.out.println(carTotal);
					}
				}
			
		

		return 0;
	}

	public int customerMenu() {

		ArrayList<String> carLot = new ArrayList<String>();

		carLot.add("Audi");
		carLot.add("Chrysler");
		carLot.add("Toyota");

		// StringBuilder carView = new StringBuilder();

		System.out.println(carLot);

		return 0;
	}
}
