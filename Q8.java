package PCK;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int i, j, x, y, meu = 0, rinrin = 0;
		int[][] array = new int[w][h];
		for(i = 0;i < w;++i){
			for(j = 0;j < h;++j){
				array[i][j] = 0;
			}
		}
		for(i = 0;i < n;++i){
			x = sc.nextInt();
			y = sc.nextInt();
			array[x][y] = 1;
		}
		
		for(i = 0;i < w;++i){
			for(j = 0;j < h;++j){
				if(array[i][j] == 1) rinrin = j;
			}
		}
		
		for(i = 0;i < h;++i){
			for(j = 0;j < w;++j){
				if(array[j][i] == 1) meu = i;
			}
		}
		
		if(rinrin > meu){
			System.out.println(meu);
		}else{
			System.out.println(rinrin);
		}
	}
}
