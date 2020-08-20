//https://www.acmicpc.net/problem/11021
import java.util.*;
public class A_PLUS_B_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a; ++i) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case #"+i+": "+(b+c));
		}

	}

}
