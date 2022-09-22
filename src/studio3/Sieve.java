package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input number: ");
		int n = in.nextInt();
		if (n<1) {
			System.out.print("Error: number should be bigger than 1");
		}
		
		boolean[] array = new boolean[n];
		for(int i=0; i<n-1; i++) {
			array[i]=true;
		}
		
		for(int i=2; i<Math.sqrt(n);i++) {
			if (array[i]==true) {
				for (int j=i*i; j<n; j=j+i) {
					array[j] = false;
				}
			}
		}
		
		for(int i=2; i<n-1; i++) {
			if (array[i]==true) {
				System.out.println(i);
			}
		}
		
	}
}
