package PCK;

import java.util.Scanner;
import java.math.*;

public class Q7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int i, j, x, y, cnt=0, hgr=0, rpn = 0, sph = 0, scr, plt;
		int[][] array = new int[4][h];
		int[][] temp1 = new int[4][h];
		int[][] temp2 = new int[4][h];
		int[][] temp3 = new int[4][h];
		
		for(i = 0;i < h;++i){
			for(j = 0;j < 4;++j){
				array[j][i] = 0;
				temp1[j][i] = 0;
				temp2[j][i] = 0;
				temp3[j][i] = 0;
			}
		}
		
		for(i = 0;i < n;++i){
			x = sc.nextInt();
			y = sc.nextInt();
			array[x][y] = 1;
			temp1[x][y] = 1;
			temp2[x][y] = 1;
			temp3[x][y] = 1;
		}
		
		for(i = 0; i < h - 1; ++i){
			for(j = 0; j < 3;++j) {
				 if(array[j][i] == 0 && array[j + 1][i] == 0 && array[j + 1][i + 1] == 0 && array[j][i + 1] == 0){
					array[j][i] = 1;
					array[j + 1][i + 1] = 1;
					array[j + 1][i] = 1;
					array[j][i + 1] = 1;
					++cnt;
				 }
			}
		}
	
		for(j = 0; j < 3; ++j){
			for(i = 0; i < h - 1; ++i){
				 if(temp1[j][i] == 0 && temp1[j + 1][i] == 0 && temp1[j + 1][i + 1] == 0 && temp1[j][i + 1] == 0){
					temp1[j][i] = 1;
					temp1[j + 1][i + 1] = 1;
					temp1[j + 1][i] = 1;
					temp1[j][i + 1] = 1;
					++hgr;
				 }
			}
		}
		
		for(i = h-1;i > 0;--i){
			for(j = 3; j > 0;--j){
				 if(temp2[j][i] == 0 && temp2[j - 1][i] == 0 && temp2[j - 1][i - 1] == 0 && temp2[j][i - 1] == 0){
					temp2[j][i] = 1;
					temp2[j - 1][i - 1] = 1;
					temp2[j - 1][i] = 1;
					temp2[j][i - 1] = 1;
					++rpn;
				 }
			}
		}
	
		
		for(j = 3; j > 0; --j){
			for(i = h-1; i > 0; --i){
				 if(temp3[j][i] == 0 && temp3[j - 1][i] == 0 && temp3[j - 1][i - 1] == 0 && temp3[j][i - 1] == 0){
					temp3[j][i] = 1;
					temp3[j - 1][i - 1] = 1;
					temp3[j - 1][i] = 1;
					temp3[j][i - 1] = 1;
					++sph;
				 }
			}
		}	
		
		scr = Math.max(cnt,  hgr);
		plt = Math.max(rpn, sph);
		
		System.out.println(String.valueOf(Math.max(scr, plt)));
	}
}