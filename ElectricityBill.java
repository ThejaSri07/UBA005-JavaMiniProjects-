package placement;
import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Units: ");
		int unit=sc.nextInt();
		//int a;
		System.out.print("The bill is ");
		if(unit>=0 && unit<=100)
		{
			System.out.println(unit*2+" rupees.");
		}
		else if(unit>=101 && unit<=200)
		{
			System.out.println(unit*3+" rupees.");
		}
		else
		{
			System.out.println(unit*5+" rupees.");
		}
	}
}
