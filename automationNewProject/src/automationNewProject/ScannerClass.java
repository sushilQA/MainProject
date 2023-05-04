package automationNewProject;

import java.util.Scanner;

public class ScannerClass {

	int x1, x2, x3, x4, x5, x6;

	public int Sum(int value1, int value2) {

		int sum = value1 + value2;
		return sum;
	}

	public int Sub(int value1, int value2) {

		int sub = value1 - value2;
		return sub;
	}

	public int Mul(int value1, int value2) {

		int mul = value1 * value2;
		return mul;
	}

	public float Div(float value1, float value2) {

		float div = value1 / value2;
		return div;

	}

	public void Assignment1(int x1, int x2, int x3, int x4, int x5, int x6) {

		System.out.println("18th December 2021 Assignment 1  (((((x1*x2)+x3)-x4)+x5)/x6)****************");
		int mulResult = Mul(x1, x2);
		int sumResult = Sum(mulResult, x3);
		int subResult = Sub(sumResult, x4);
		sumResult = Sum(subResult, x5);
		float output = Div(sumResult, x6);
		System.out.println("\n The output of the statement [" + "(((((" + x1 + "*" + x2
				+ ")+" + x3 + ")-" + x4 + ")+" + x5 + ")/" + x6 + ") ] is = " + output);

	}

	public void Assignment2(int x1, int x2, int x3, int x4, int x5, int x6) {

		System.out.println("\n18th December 2021 Assignment 2 = ((((x1+x2)-x3)*x4)-x5)/x6)****************\n");
		int sumResult = Sum(x1, x2);
		int subResult = Sub(sumResult, x3);
		int mulResult = Mul(subResult, x4);
		subResult = Sub(mulResult, x5);
		float output = Div(subResult, x6);
		System.out.println("The output of the statement [" + "(((((" + x1 + "+" + x2
				+ ")-" + x3 + ")*" + x4 + ")-" + x5 + ")/" + x6 + ") ] is =  " + output);
	}

	public static void main(String[] args) {

		int x1, x2, x3, x4, x5, x6;
		Scanner sc = new Scanner(System.in);
		ScannerClass obj = new ScannerClass();
		System.out.println("Enter the value of X1, X2, X3, X4,X5 and X6");
		x1 = sc.nextInt(); x2 = sc.nextInt();x3 = sc.nextInt();x4 = sc.nextInt();x5 = sc.nextInt();x6 = sc.nextInt();
		obj.Assignment1(x1, x2, x3, x4, x5, x6);
		System.out.println();
		obj.Assignment2(x1, x2, x3, x4, x5, x6);

	}
}
