//https://www.acmicpc.net/problem/2739
import java.util.*;

public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<10; ++i) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}

	}

}