import java.util.Scanner;
public class SystemCalc {
	
	
	
	public static void main(String[] args) {
		
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
		
	}
}
