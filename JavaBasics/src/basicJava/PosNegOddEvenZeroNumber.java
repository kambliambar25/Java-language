package basicJava;
import java.util.*;

public class PosNegOddEvenZeroNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.print("Positive Number\n");
			if(n%2==0) {
				System.out.println("Positive Even Number");
			}
			else
				System.out.println("Positive Odd Number");
		}
		
		else if(n<0) {
			System.out.print("Negative Number\n");
			if(n%2==0) {
				System.out.println("Negative Even Number");
			}
			else
				System.out.println("Negative Odd Number");
		}
		
		else {
			System.out.println("Zero");
		}

	}

}
