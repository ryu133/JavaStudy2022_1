package ch19.Ex06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//한글을 콘솔에 출력. 1 byte로 출력 시 한글 출력이 안됨, n-byte로 출력해야 함

public class ConsoleOutputObject1_1 {
	public static void main(String[] args) throws IOException {
		OutputStream os=System.out; //System.out : 콘솔에 출력 byte로 콘솔에 값을 넣어야 함

		//2 n-byte 출력(byte[] 처음부터 끝까지 데이터 쓰기)
		byte[] byteArray1="안녕하세요".getBytes(Charset.defaultCharset());
		
		os.write(byteArray1); //버퍼에 쓰기
		os.write('\n');
		
		os.flush(); //버퍼의 내용을 콘솔에 출력
		
		//3 n-byte 출력(byte[]의 offset부터 length개의 byte 데이터 쓰기)
		byte[] byteArray2="반갑습니다.".getBytes(Charset.defaultCharset());
		
		os.write(byteArray2,6,4); //6byte 자리부터 4byte 저장
		
		os.flush();
		
		os.close();
		
		
		
		
		
	}
}
