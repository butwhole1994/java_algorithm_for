//https://www.acmicpc.net/problem/2439
import java.util.*;
public class Typing_Star_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; ++i) {
			for(int j=0; j<(n-i); ++j) {
				System.out.print(" ");
			}
			for(int t=0; t<i; ++t) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
