//https://www.acmicpc.net/problem/8393
import java.util.*;
public class sum_by_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;//sum�̶�� ���� ���� ��Ÿ���� ���� ���������� �д�. �ϴ� ������ 0
		
		
		for(int i=1; i<=a; ++i ) {
			sum += i;
			//���⼭ +=�� ����Ѵ�. �̷��� sum�� ���� sum�� i�� ��ģ ���� �ȴ�.
		}
		System.out.println(sum);
	}

}
