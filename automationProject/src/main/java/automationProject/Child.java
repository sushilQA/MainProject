package automationProject;

public class Child extends Parent {
	public Child() {
		// TODO Auto-generated constructor stub
		this(1, 2, 3);
		System.out.println("Child Default Constructor");
	}

	public Child(int a) {
		// TODO Auto-generated constructor stub
		this(1, 2);
		System.out.println("Child 1 Parameterized Constructor");
	}

	public Child(int a, int b) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("Child 2 Parameterized Constructor");
	}

	public Child(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		super(1, 2, 3, 4);
		System.out.println("Child 3 Parameterized Constructor");
	}

	public Child(int a, int b, int c, int d) {
		// TODO Auto-generated constructor stub
		this(1);
		System.out.println("Child 4 Parameterized Constructor");
	}

	/*public static void main(String[] args) {

		System.out.println("\n********************Assignment 4 ********************\n");
		Child ch = new Child(1, 2, 3, 4);

	}*/

}
