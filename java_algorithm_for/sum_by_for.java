//https://www.acmicpc.net/problem/8393
import java.util.*;
public class sum_by_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;//sum이라는 수의 합을 나타내는 값을 전역변수로 둔다. 일단 시작은 0
		
		
		for(int i=1; i<=a; ++i ) {
			sum += i;
			//여기서 +=를 사용한다. 이러면 sum의 값은 sum과 i를 합친 값이 된다.
		}
		System.out.println(sum);
	}

}
