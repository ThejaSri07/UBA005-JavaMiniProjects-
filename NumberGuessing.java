package placement;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Min: ");
		int min=sc.nextInt();
		System.out.print("Max: ");
		int max=sc.nextInt();
		Random random=new Random();
		int randomNum=random.nextInt((max-min)+1)+min;
		//System.out.println(randomNum);
		
		int guess=-1;
		System.out.println("Guess the number between "+min+" and "+max);
		while(guess!=randomNum)
		{
			System.out.print("Enter your guess: ");
			guess=sc.nextInt();
			
			int diff=Math.abs(randomNum-guess);
			if(guess==randomNum)
			{
				System.out.println("Yayyyyy.Bluetooth connected succesfully.");
			}
			else if(diff<=2)
			{
				System.out.println("Almost got connected.");
			}
			else if(diff<=5)
			{
				System.out.println("Far,But close to heart.Try again.");
			}
			else if(diff<=10)
			{
				System.out.println("Looks like we are not in the same frequency.");
			}
			else
			{
				System.out.println("Miles apart:)");
			}
		}
		
	}
	
}
