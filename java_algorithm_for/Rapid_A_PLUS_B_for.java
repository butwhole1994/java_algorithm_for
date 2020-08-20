//https://www.acmicpc.net/problem/15552
import java.util.*; //StringTokenizer
import java.io.*;//Buffer

public class Rapid_A_PLUS_B_for {

	public static void main(String[] args) throws IOException{
		//buffer클래스를 사용할 경우 예외처리란 것을 해주어야한다.
		//방법은 1. try catch문을 이용하던가, 메인클래스 옆에 throws IOException을 넣어주던가이다.
		
		//<buffer 클래스의 개념>
		//buffer 클래스는 한 곳에 모아두었다가 전송하는 방식으로, 예를 들어 한 삽 한 삽 옮기는 것이 Scanner와 System.out.print였다면
		//buffer는 수레에 담았다가 한 번에 옮기는 것이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//BufferedReader클래스의 입력 인스턴스 생성하는 코드이다.
			//BufferedReader가 읽어들이는 대상은 InputStreamReader()가 된다.
			//InputStreamRedaer가 읽어들이는 대상은 (System.in). 즉, 콘솔창의 입력값을 대상으로 한다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//BufferedWriter클래스의 출력 인스턴스 생성하는 코드이다.
			//BufferedWriter가 출력을 쏘는 곳은 OuputStreamWriter()가 된다.
			//OutputStreamWriter가 출력 쏘는 곳은 (System.out) 즉 콘솔창으로 출력한다.
		
		//즉 읽기의 흐름은 "읽어야할 대상"의 이동경로이다.
		//최초 읽어야할 대상은 System.in(콘솔창)->InputStreamReader 클래스->BufferedReader클래스-> .readLine등의 메소드
		//이러한 순서로 각각의 클래스, 메소드들이 "읽어야할 대상"을 받아간다.
		
		//츌력의 경우는 "출력하는 내용"의 이동경로이다.
		//메소드(로 데이터타입과 그 내용이 정해진다.)-> BufferedWriter클래스 -> OutputWriter 클래스 -> System.out(콘솔창)
		//이러한 순서로 메소드에서 정형화된 내용이 출력클래스들을 거쳐서 최종적으로 어디에 출력되는가를 정한다.
		
		
		
		//<buffer의 특징>
		//1. 개행만 구분자로 인식한다. 즉, 입력값을 줄 때 엔터로만 입력값을 구분한다. ->이 문제에서 StringTokenizer를 사용하려고하는 이유임.
		//2. 받은 데이터의 타입이 String이 된다.(.readLine()함수 때문) -> Int로 사용하기 위해선 Intger.parseInt를 사용하는 이유임. 
		int a = Integer.parseInt(br.readLine());
		//br.readLine()함수는 한 줄을 읽어서 String으로 반환하는 함수다.
		//받은 값을 String으로 반환하기 때문에 Integer.parseInt를 사용해 데이터타입을 Int로 바꿀 필요가 있다.
		
		for(int i=0; i<a; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//StringTokenizer클래스를 사용하기 위해 인스턴트 생성하는 코드이다.
			//분할대상이 되는 String은 바로 br.readLine(). 출처를 따라가보면 결국 콘솔창 입력값이다.
			//br.readLine()은 입력값을 String으로 바꿔버리기 때문에 StringTokenizer를 사용할 수 있는 것이다.
			
			//<StringTokenizer의 개념>
			// 하나의 String을 여러개의 String으로 분열시키기 위해 사용한다. 예를 들면 "String"을 "Str"과"ing"로 나누는 것.
			// 이렇게 분리하기 위해선 "구분 문자"가 필요하다.
			//그리고 각각 분리된 "Str""ing"을 "토큰"이라고 부른다.
			//예를 들어 "String"으로 분리하고 싶을때 구분문자를 &로 설정했다고 치자.
			//그렇다면 Str&ing 라는 식으로 입력받거나, 변수설정이 되어야하며
			//StringTokenizer를 사용할 경우 "Str"과 "ing"가 토큰이 되며 &는 구분문자가 된다.
			
			//<StringTokenizer의 인스턴트 생성자의 종류와 역할>
			//1. StringTokenizer(Str str);
			//이처럼 구분자를 따로 정하지 않는 경우 기본구분자로 설정한다.\t\n\r과 같은 공백문자(스페이스)가 이에 해당한다.
			//2. StringTokenizer(Str str, Str delim); 구분자는 영어로 delim이라고 한다. 이는 구분자를 따로 설정하는 생성자이다.
			//3. StringTokenizer(Str str, Str delim, returnDelims) 구분자까지 토큰으로 인식하도록 하는 생성자이다.
			
			//<StringTokenizer클래스의 주요 함수>
			// 1. .countTokens() 데이터타입 int. 분리된 토큰의 개수를 구한다.
			// 2. .hasMoreTokens() 데이터타입 boolean. 토큰이 존재할 경우 True를 리턴한다.
			// 3. .nextToken() 데이터타입 String. 존재하는 토큰을 차례로 리턴한다.
			
			
			
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			//위 두 줄이 대체 어떻게 입력값을 각각 받아가는가에 대해서 설명해본다.
			// StringTokenizer(Str str); 이 형식으로 st인스턴트를 생성했기 때문에 스페이스를 구분자로 가진다.
			// 이 상황에서 예를들어서 입력값을 "3 4" 로 줬다고 치자. 이 경우 토큰은 3과 4가되고 구분자는 스페이스이다.
			// int b 가 .nextToken()으로 첫번째 토큰3을 가져간다.
			// int c가 .nextToken()으로 두번째 토큰4를 가져간다.
			// 결국 b는 3이, c는 4가 된다.
			
			//Buffer는 개행만 구분자로 인식, StringTokenizer는 공백만 구분자로 인식하는 점을 이용한다면
			//자유자재로 입력 출력값을 설정할 수 있다.
			bw.write(b+c+"\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
	}

}
//InputStream OuputStream에 대한 설명
//http://wiki.gurubee.net/display/SWDEV/InputStreamReader%2C+OutputStreamWriter
//https://hyeonstorage.tistory.com/247

//StringTokenizer에 대한 설명
//https://itjava.tistory.com/46
//https://reakwon.tistory.com/90
//https://hongpossible.tistory.com/entry/Java%EC%9D%98-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B6%84%EB%A6%AC-StringTokenizer

//Buffer클래스와 문제풀이에 대한 설명
//https://jhnyang.tistory.com/92
//https://st-lab.tistory.com/30

//초보자에게 주어지는 문제치고는 "많은 클래스에 대한 이해" "클래스 안의 클래스에 대한 이해" "입출력에 대한 이해" "데이터타입에 대한 이해"  
//등등 복잡하게 얽힌 것들에 대한 이해가 필요한 문제였다. 확실히 알고 넘어간다면 큰 자산이 될 것 같다.