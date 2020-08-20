//https://www.acmicpc.net/problem/15552
import java.util.*; //StringTokenizer
import java.io.*;//Buffer

public class Rapid_A_PLUS_B_for {

	public static void main(String[] args) throws IOException{
		//bufferŬ������ ����� ��� ����ó���� ���� ���־���Ѵ�.
		//����� 1. try catch���� �̿��ϴ���, ����Ŭ���� ���� throws IOException�� �־��ִ����̴�.
		
		//<buffer Ŭ������ ����>
		//buffer Ŭ������ �� ���� ��Ƶξ��ٰ� �����ϴ� �������, ���� ��� �� �� �� �� �ű�� ���� Scanner�� System.out.print���ٸ�
		//buffer�� ������ ��Ҵٰ� �� ���� �ű�� ���̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//BufferedReaderŬ������ �Է� �ν��Ͻ� �����ϴ� �ڵ��̴�.
			//BufferedReader�� �о���̴� ����� InputStreamReader()�� �ȴ�.
			//InputStreamRedaer�� �о���̴� ����� (System.in). ��, �ܼ�â�� �Է°��� ������� �Ѵ�.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			//BufferedWriterŬ������ ��� �ν��Ͻ� �����ϴ� �ڵ��̴�.
			//BufferedWriter�� ����� ��� ���� OuputStreamWriter()�� �ȴ�.
			//OutputStreamWriter�� ��� ��� ���� (System.out) �� �ܼ�â���� ����Ѵ�.
		
		//�� �б��� �帧�� "�о���� ���"�� �̵�����̴�.
		//���� �о���� ����� System.in(�ܼ�â)->InputStreamReader Ŭ����->BufferedReaderŬ����-> .readLine���� �޼ҵ�
		//�̷��� ������ ������ Ŭ����, �޼ҵ���� "�о���� ���"�� �޾ư���.
		
		//������ ���� "����ϴ� ����"�� �̵�����̴�.
		//�޼ҵ�(�� ������Ÿ�԰� �� ������ ��������.)-> BufferedWriterŬ���� -> OutputWriter Ŭ���� -> System.out(�ܼ�â)
		//�̷��� ������ �޼ҵ忡�� ����ȭ�� ������ ���Ŭ�������� ���ļ� ���������� ��� ��µǴ°��� ���Ѵ�.
		
		
		
		//<buffer�� Ư¡>
		//1. ���ุ �����ڷ� �ν��Ѵ�. ��, �Է°��� �� �� ���ͷθ� �Է°��� �����Ѵ�. ->�� �������� StringTokenizer�� ����Ϸ����ϴ� ������.
		//2. ���� �������� Ÿ���� String�� �ȴ�.(.readLine()�Լ� ����) -> Int�� ����ϱ� ���ؼ� Intger.parseInt�� ����ϴ� ������. 
		int a = Integer.parseInt(br.readLine());
		//br.readLine()�Լ��� �� ���� �о String���� ��ȯ�ϴ� �Լ���.
		//���� ���� String���� ��ȯ�ϱ� ������ Integer.parseInt�� ����� ������Ÿ���� Int�� �ٲ� �ʿ䰡 �ִ�.
		
		for(int i=0; i<a; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//StringTokenizerŬ������ ����ϱ� ���� �ν���Ʈ �����ϴ� �ڵ��̴�.
			//���Ҵ���� �Ǵ� String�� �ٷ� br.readLine(). ��ó�� ���󰡺��� �ᱹ �ܼ�â �Է°��̴�.
			//br.readLine()�� �Է°��� String���� �ٲ������ ������ StringTokenizer�� ����� �� �ִ� ���̴�.
			
			//<StringTokenizer�� ����>
			// �ϳ��� String�� �������� String���� �п���Ű�� ���� ����Ѵ�. ���� ��� "String"�� "Str"��"ing"�� ������ ��.
			// �̷��� �и��ϱ� ���ؼ� "���� ����"�� �ʿ��ϴ�.
			//�׸��� ���� �и��� "Str""ing"�� "��ū"�̶�� �θ���.
			//���� ��� "String"���� �и��ϰ� ������ ���й��ڸ� &�� �����ߴٰ� ġ��.
			//�׷��ٸ� Str&ing ��� ������ �Է¹ްų�, ���������� �Ǿ���ϸ�
			//StringTokenizer�� ����� ��� "Str"�� "ing"�� ��ū�� �Ǹ� &�� ���й��ڰ� �ȴ�.
			
			//<StringTokenizer�� �ν���Ʈ �������� ������ ����>
			//1. StringTokenizer(Str str);
			//��ó�� �����ڸ� ���� ������ �ʴ� ��� �⺻�����ڷ� �����Ѵ�.\t\n\r�� ���� ���鹮��(�����̽�)�� �̿� �ش��Ѵ�.
			//2. StringTokenizer(Str str, Str delim); �����ڴ� ����� delim�̶�� �Ѵ�. �̴� �����ڸ� ���� �����ϴ� �������̴�.
			//3. StringTokenizer(Str str, Str delim, returnDelims) �����ڱ��� ��ū���� �ν��ϵ��� �ϴ� �������̴�.
			
			//<StringTokenizerŬ������ �ֿ� �Լ�>
			// 1. .countTokens() ������Ÿ�� int. �и��� ��ū�� ������ ���Ѵ�.
			// 2. .hasMoreTokens() ������Ÿ�� boolean. ��ū�� ������ ��� True�� �����Ѵ�.
			// 3. .nextToken() ������Ÿ�� String. �����ϴ� ��ū�� ���ʷ� �����Ѵ�.
			
			
			
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			//�� �� ���� ��ü ��� �Է°��� ���� �޾ư��°��� ���ؼ� �����غ���.
			// StringTokenizer(Str str); �� �������� st�ν���Ʈ�� �����߱� ������ �����̽��� �����ڷ� ������.
			// �� ��Ȳ���� ������ �Է°��� "3 4" �� ��ٰ� ġ��. �� ��� ��ū�� 3�� 4���ǰ� �����ڴ� �����̽��̴�.
			// int b �� .nextToken()���� ù��° ��ū3�� ��������.
			// int c�� .nextToken()���� �ι�° ��ū4�� ��������.
			// �ᱹ b�� 3��, c�� 4�� �ȴ�.
			
			//Buffer�� ���ุ �����ڷ� �ν�, StringTokenizer�� ���鸸 �����ڷ� �ν��ϴ� ���� �̿��Ѵٸ�
			//��������� �Է� ��°��� ������ �� �ִ�.
			bw.write(b+c+"\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
	}

}
//InputStream OuputStream�� ���� ����
//http://wiki.gurubee.net/display/SWDEV/InputStreamReader%2C+OutputStreamWriter
//https://hyeonstorage.tistory.com/247

//StringTokenizer�� ���� ����
//https://itjava.tistory.com/46
//https://reakwon.tistory.com/90
//https://hongpossible.tistory.com/entry/Java%EC%9D%98-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B6%84%EB%A6%AC-StringTokenizer

//BufferŬ������ ����Ǯ�̿� ���� ����
//https://jhnyang.tistory.com/92
//https://st-lab.tistory.com/30

//�ʺ��ڿ��� �־����� ����ġ��� "���� Ŭ������ ���� ����" "Ŭ���� ���� Ŭ������ ���� ����" "����¿� ���� ����" "������Ÿ�Կ� ���� ����"  
//��� �����ϰ� ���� �͵鿡 ���� ���ذ� �ʿ��� ��������. Ȯ���� �˰� �Ѿ�ٸ� ū �ڻ��� �� �� ����.