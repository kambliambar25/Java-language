package basicJava;

import java.util.Scanner;

public class SumOfNnaturalNo {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("The sum of n Natural numbe33rs is: " +sum);

	}

}
