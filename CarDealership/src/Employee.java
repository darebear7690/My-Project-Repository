import java.util.Scanner;

public class Employee {
	// + 1 will be adding to the car if selected
	static String addCar;
	public static void main(String[] args) {
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
	}
}
// int i;
// System.out.println(i);}
// }
// return i;
//}
