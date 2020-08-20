//https://www.acmicpc.net/problem/10871
import java.util.*;

public class smaller_than_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; ++i) {
			int input = sc.nextInt();
			if(input<x) {
				System.out.print(input+" ");
			}
		}

	}

}
