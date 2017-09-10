package PCK;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int s = x + y;
		double a = ((double) y / (2 * x));
		
		int i, j;
		
		for(i = 1;i < x*2;++i){
			for(j = 1;j < y;++j){
				if(j == a * i && i % 2 == 0){
					--s;
				}
			}
		}
		
		System.out.print(s);
	}
}
