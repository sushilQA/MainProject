package automationProject;

public class Student {

	int age = 10;
	int rollNo = 20;

	public void display1() {
		age = 10;
		System.out.println(" Student Age In Method 1 = " + age);
	}

	public void display2() {
		rollNo = 121;
		System.out.println(" Student RollNo In Method 2 = " + rollNo);
	}

	public static void main(String[] str) {
		Student st = new Student();
		st.age = 500;
		st.rollNo = 904;
		st.display1();
		st.display2();
		System.out.println(" Student Age In Main Method = " + st.age);
		System.out.println(" Student RollNo In Main Method = " + st.rollNo);
	}

}
