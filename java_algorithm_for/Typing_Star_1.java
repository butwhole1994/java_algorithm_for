//https://www.acmicpc.net/problem/2438
import java.util.*;
import java.io.*;

public class Typing_Star_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=n; ++i) {
			for(int j=0; j<i; ++j) {
				bw.write("*");//System.out.print("*");
			}
			bw.write("\n");//System.out.println();
		}
		bw.flush();
		br.close();
	
	}
}
