package PCK;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int interval = b - a;
		int s, f, t, flag = 0;
		int i = 0;
		for(;i < n;++i){
			s = sc.nextInt();
			f = sc.nextInt();
			t = f - s;
			if((b > s && b <= f) || (a < f && a >= s)){
				flag = 1;
			}
		}
		System.out.print(flag);
	}
}
