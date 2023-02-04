import java.util.Scanner;
public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[]= new int[size];
		//loop for input
		for(int i = 0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		//loop for output
		for(int i = 0; i<size; i++) {
			if(numbers[i]==x) {
				System.out.println("x is found at index:" +i);
			}
		}
	}

}
