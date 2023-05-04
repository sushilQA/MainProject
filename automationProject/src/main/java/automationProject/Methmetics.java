package automationProject;

public class Methmetics {

	public int Sum(int value1, int value2) {
		System.out.println("Value1 =" + value1);
		System.out.println("Value2 =" + value2);

		int sum = value1 + value2;
		System.out.println("sumResult " + sum);
		return sum;
	}

	public int Sub(int value1, int value2) {
		System.out.println("Value1 =" + value1);
		System.out.println("Value2 =" + value2);
		int sub = value1 - value2;
		System.out.println("subResult " + sub);
		return sub;
	}

	public int Mul(int value1, int value2) {
		System.out.println("Value1 =" + value1);
		System.out.println("Value2 =" + value2);
		int mul = value1 * value2;
		System.out.println("mulResult " + mul);
		return mul;
	}

	public void Div(int value1, int value2) {
		System.out.println("Value1 =" + value1);
		System.out.println("Value2 =" + value2);
		int div = value1 / value2;
		System.out.print("Final Result =" + div);

	}

	public void Assignment1() {
		int sumResult = Sum(10, 2);
		int finalSum = Sum(sumResult, 2);
		int subResult = Sub(finalSum, 2);
		int mulResult = Mul(subResult, 2);
		Div(mulResult, 2);
		System.out.println("");
	}

	public void Assignment2() {

		int mulResult = Mul(10, 2);
		int sumResult = Sum(mulResult, 2);
		int finalMulResult = Mul(sumResult, 2);
		int subResult = Sub(finalMulResult, 2);
		Div(subResult, 2);
	}

	/*public static void main(String[] str) {

		Methmetics mt = new Methmetics();
		System.out.println("**************** Assignment 1 ****************");
		mt.Assignment1();
		System.out.println("**************** Assignment 2 ****************");
		mt.Assignment2();

	}*/

}
