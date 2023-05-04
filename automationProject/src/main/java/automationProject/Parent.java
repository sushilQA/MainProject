package automationProject;

public class Parent {
	public Parent() {
		// TODO Auto-generated constructor stub
		this(1, 2, 3);
		System.out.println("Parent Default Constructor");
	}

	public Parent(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("Parent 1 Parameterized Constructor");
	}

	public Parent(int a, int b) {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("Parent 2 Parameterized Constructor");
	}

	public Parent(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		System.out.println("Parent 3 Parameterized Constructor");
	}

	public Parent(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		this(1, 2);
		System.out.println("Parent 4 Parameterized Constructor");
	}

}
