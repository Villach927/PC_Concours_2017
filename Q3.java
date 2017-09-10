package PCK;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		int x = new Scanner(System.in).nextInt();
		
		switch(x % 7) {
		case 0:
			System.out.print("thu");
			break;
		case 1:
			System.out.println("fri");
			break;
		case 2:
			System.out.print("sat");
			break;
		case 3:
			System.out.print("sun");
			break;
		case 4:
			System.out.print("mon");
			break;
		case 5:
			System.out.print("tue");
			break;
		case 6:
			System.out.print("wed");
			break;
		}
	}
}
