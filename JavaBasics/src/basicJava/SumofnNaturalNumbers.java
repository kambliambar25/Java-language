package basicJava;
import java.util.*;

public class SumofnNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Enter a positive number only! ");
			return;
		}
		else {
		
		int sum = n*(n+1)/2;
		
		System.out.println(sum);
		}

	}

}
