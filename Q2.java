package PCK;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int f = sc.nextInt();
		int b = sc.nextInt();
		
		if(m >= b) {
			System.out.println(0);
		} else if(m + f < b) {
			System.out.println("NA");
		} else {
			System.out.println(b - m);
		}
	}
}
