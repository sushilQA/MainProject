package automationProject;

import java.util.Scanner;

public class NumbersMethods {

	int n;
	int temp = 0;
	int r;
	int sum = 0;

	public void checkPalindrome() {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		if (n <= 0) {
			System.out.println("Please enter a +ve Number or enter a number which is greater then 0 ");
		} else {
			while (n > 0) {

				r = n % 10;
				sum = (sum * 10) + r;
				n = n / 10;
			}
			if (temp == sum) {
				System.out.println(temp + " is a palindrom number");
			} else
				System.out.println(temp + " is not a palindrom number");

		}
		sc.close();
	}

	public void checkPrime() {
		int flag = 0;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int Mid = n / 2;
		if (n < 0) {
			System.out.println("Please enter a +ve Number or enter a number which is greater then 0 ");
		} else if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number by definition!");
		} else {
			for (int i = 2; i < Mid; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number" + ". It is divisible by " + i);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number.");
			}
		}
		sc.close();
	}

	public void checkArmstrong() {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp = n;
		if (n <= 0) {
			System.out.println("Please enter a +ve Number or enter a number which is greater then 0 ");
		} else {
			while (n > 0) {
				r = n % 10;
				int cube = r * r * r;
				sum = sum + cube;
				n = n / 10;
			}
			if (temp == sum) {
				System.out.println(temp + " is an armstrong number");
			} else
				System.out.println(temp + " is not an armstrong number");
		}

		sc.close();
	}

	public void numberSwapping() {
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Before swapping first number is = " + n1 + " and second number is =" + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("\n After swapping first number is = " + n1 + " and second number is =" + n2);
		sc.close();
	}

	public void numberSwappingViaThirdVariable() {
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Before swapping first number is = " + n1 + " and second number is =" + n2);
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("\n After swapping first number is = " + n1 + " and second number is =" + n2);
		sc.close();
	}

	public void printTable() {
		System.out.println("Enter any number for which you want to print a table");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		sc.close();
	}

	public void printFactorial() {
		System.out.println("Enter any number for which you want to print a Factorial");
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		n = sc.nextInt();
		temp = n;
		if (n < 0) {
			System.out.println("As per definition, can't generate a factorial for a -ve number!");
		} else {
			while (n > 0) {
				fact = fact * n;
				n = n - 1;
			}
			System.out.println(temp + "! = " + fact);
		}
		sc.close();
	}

	public void printFibnocci() {
		System.out.println("Enter the numbers of terms of fibnocci series which you want to print ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n < 2) {
			if (n < 0) {
				System.out.println("Please enter valid terms");
			} else
				System.out.println("Please enter atlest 2 terms");
		} else {
			int firstTerm = 0;
			int secondTerm = 1;
			System.out.println("\n So " + n + " terms of fibnocci series are");
			System.out.print(" " + firstTerm + " , " + secondTerm);
			for (int i = 3; i <= n; i++) {
				int nextTerm = firstTerm + secondTerm;
				System.out.print(" , " + nextTerm);
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
		}
		sc.close();
	}
}
