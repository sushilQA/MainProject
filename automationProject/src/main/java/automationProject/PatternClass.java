package automationProject;

public class PatternClass {

	public void printPatern() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printPatern2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printPatern3() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public void printPatern4() {
		int p = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
				p++;
			}
			System.out.println();
		}
	}

	public void printPatern5() {
		int p = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
				p++;
			}
			System.out.println();
		}
	}

	public void printPatern6() {
		int raw=5;
		for (int i = 1; i <= raw; i++) {
			for (int j = 1; j <= raw - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*public void printPatern7() {
		int raw = 5;
		for (int i = 1; i <= raw; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(" ");
				for(int k =0;k<0;k++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}*/

}
