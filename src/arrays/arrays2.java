package arrays;
import java.util.Scanner;
// make an array and take input from users

public class arrays2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		// loop for input
		for(int i = 0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		//loop for output
		for(int j = 0; j<size; j++) {
			System.out.println(numbers[j]);
		}
		
	}

}
