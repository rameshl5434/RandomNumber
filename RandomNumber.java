import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random rn = new Random();
		int rand = rn.nextInt(100);
		boolean cond = true;
				Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		while(cond)
		{
			int n = sc.nextInt();
			if(n==rand)
			{
				System.out.println("This is the number"+n);
				cond = false;
			}
			else if(n>rand)
			{
				System.out.println("Entered numberd is grater than guess number \n  please re-enter the number");
				
				
			}
			else
			{
				System.out.println("Entered numberd is lesser than guess number \n  please re-enter the number");

			}

		}


			}

		

	}


