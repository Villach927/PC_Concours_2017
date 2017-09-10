package PCK;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, temp, meu;
		int[] array = new int[n];
		for(i = 0;i < n;++i){
			array[i] = sc.nextInt();
		}
		
		if(array[0] < 10 || array[n - 1] < 10){
			System.out.println("no");
			return;
		}else{
			for(i = 0;i < n;++i){
				meu = 0;
				temp = i;
				while(array[i] < (meu + 1) * 10){
					--i;
					if(i < 0){
						System.out.print("no");
						return;
					}
					++meu;
				}
				i = temp;
			}
			
			for(i = n - 1;i >= 0;--i){
				meu = 0;
				temp = i;
				while(array[i] < (meu + 1) * 10){
					++i;
					if(i > n - 1){
						System.out.print("no");
						return;
					}
					++meu;
				}
				i = temp;
			}
		}
		
		System.out.print("yes");
	}
}
