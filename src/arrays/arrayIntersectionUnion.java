package arrays;
import java.util.*;

public class arrayIntersectionUnion {
	static void getunion(int a[], int n, int b[], int m) {
		// defining a hashset container s 
		HashSet<Integer> s=new HashSet<>();
		
		//inserting element 
		for(int i = 0; i<n; i++) {
			s.add(a[i]);
		}
		for(int i = 0; i<m; i++) {
			s.add(b[i]);
			System.out.print("no of element after union operation: " + s.size() + "\n");
			System.out.print("the union set of both arrays is : " + "\n");
			System.out.print(s.toString() + " ");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 5, 6, 2, 3, 5, 7, 3 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };
 
        getUnion(a, 9, b, 10);
    }
 }

