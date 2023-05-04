package automationProject;

public class ConstructorDemo {

	public ConstructorDemo() {

		this(121, 122, 123, 124);
		System.out.println("Default Constructo");
	}

	public ConstructorDemo(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("One Parameterized Constructo");

	}

	public ConstructorDemo(int a, int b) {
		// TODO Auto-generated constructor stub
		this(121);
		System.out.println("Two Parameterized Constructo");

	}

	public ConstructorDemo(int a, int b, int c) {
		// TODO Auto-generated constructor stub\
		this(121, 122);
		System.out.println("Three Parameterized Constructo");

	}

	public ConstructorDemo(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub

		System.out.println("Four Parameterized Constructo");

	}

	public void method1() {
		this.method4(121, 122, 123);
		System.out.println("Default Method");
		this.method2(121);
		this.method5(121, 122, 123, 124);
		this.method3(121, 122);

	}

	public void method2(int one) {
		System.out.println("One Parameterized Method");

	}

	public void method3(int one, int two) {
		System.out.println("Two Parameterized Method");

	}

	public void method4(int one, int two, int three) {
		System.out.println("Three Parameterized Method");

	}

	public void method5(int one, int two, int three, int four) {
		System.out.println("Four Parameterized Method");

	}

	public static void main(String[] args) {

		System.out.println("\n********************Assignment One********************\n");
		
		ConstructorDemo con = new ConstructorDemo(121, 122, 123);
		
		System.out.println("\n********************Assignment Two********************\n");

		con.method1();
	}

}
