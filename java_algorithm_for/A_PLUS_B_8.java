//https://www.acmicpc.net/problem/11022
import java.util.*;
import java.io.*;

public class A_PLUS_B_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = a+b;
			bw.write("Case #"+i+": "+a+" + "+b+" = "+c+"\n");
		}
		bw.flush();
		br.close();
	}

}
