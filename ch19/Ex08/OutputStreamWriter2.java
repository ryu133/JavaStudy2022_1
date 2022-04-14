package ch19.Ex08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//Reader / Writer : 추상클래스, char을 처리, 문자(o),이미지(x),MP3(x),...
//FileReader /FileWriter : 완성된 클래스, Default charser만 사용 
//InputStreamReader/OutputStreamReader: 읽으르 때 인코딩 지정해서 읽기, 쓰기

//주의! System.in: 콘솔에서 입력/ System.out: 콘솔에 출력  <= 한번 close()되면 재사용 불가
	//byte 일기, 쓰기

public class OutputStreamWriter2 {
	public static void main(String[] args) {
		//콘솔 출력(MS949)
		try {
			OutputStreamWriter osw=new OutputStreamWriter(System.out,"MS949");
			osw.write("OutputStreamWriter2 예제 파일입니다.\n".toCharArray()); //String을 char[]에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다."); //string
			osw.write('\n'); //char 저장
			osw.write("Good Bye !!!\n\n"); //write: 버퍼(메모리)에 쓴다
			osw.flush(); //버퍼에 있는 것을 콘솔에 출력
		} catch (Exception e) {		}
		
		
		//콘솔 출력(UTF-8) (깨짐 정상)
		try {
			OutputStreamWriter osw=new OutputStreamWriter(System.out,"UTF-8");
			osw.write("OutputStreamWriter2 예제 파일입니다.\n".toCharArray()); //String을 char[]에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다."); //string
			osw.write('\n'); //char 저장
			osw.write("Good Bye !!!\n\n"); //write: 버퍼(메모리)에 쓴다
			osw.flush(); //버퍼에 있는 것을 콘솔에 출력
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
	}
}
