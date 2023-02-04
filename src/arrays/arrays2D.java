package arrays;
import java.util.*;

//program to print spiral of matrix

public class arrays2D {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int matrix[][] = new int[n][m];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("the spiral order matrix is : ");
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart = 0;
		int colEnd = m-1;
		// to print spiral matrix order
		while(rowStart <= rowEnd && colStart <= colEnd) {
			//condition 2
			for(int col = colStart; col<=colEnd; col++) {
				System.out.println(matrix[rowStart][col] + " ");
			}
			rowStart++;
			for(int row = rowStart; row<=rowEnd; row++) {
				System.out.println(matrix[row][colEnd]+ " ");
			}
			colEnd--;
			for(int col = colEnd; col>= colStart; col--) {
				System.out.println(matrix[col][colStart]+ " ");
			}
			rowEnd--;
			for(int row = rowEnd; row>=rowStart; row--) {
				System.out.println(matrix[row][colStart]+ " ");
			}
			colStart++;
		}
	}

}
