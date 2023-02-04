package arrays;
//program to transpose a matrix
import java.util.Scanner;

public class arrays2d2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int matrix[][] = new int[5][6];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("the transpose matrix is ; ");
		for(int j = 0; j<m; j++) {
			for(int i = 0; i<n; i++) {
				System.out.print(matrix[i][j]+"");
			}
			System.out.println();
		}
	}

}
