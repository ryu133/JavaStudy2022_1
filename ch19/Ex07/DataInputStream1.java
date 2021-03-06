package ch19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//InputStream: 기반 스트림
	//int => SSS(문자), SSS(문자) => int 
//DataInputStream: 기반 스트림의 추가 기능을 제공하는 스트림, 기반 스트림이 반드시 존재해야 함. 단독 사용 불가
	//다양한 형식의 데이터를 빠르게 전송할 때 사용 
	//int => int, double => double 별도의 변환을 하지 않음(바이트로 분해했다가 다시 조립하는 과정을 하지 않는다)

public class DataInputStream1 {
	public static void main(String[] args) {
		//파일 생성
		File dataFile=new File("ch19/Ex07/file1.data"); //확장자 주의
		
		//데이터 쓰기
		try (OutputStream os=new FileOutputStream(dataFile);
				DataOutputStream dos=new DataOutputStream(os);) //추가 기능을 제공: 생성자 내부에 기반 스트림 포함
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		} catch (Exception e) {		} //모든 예외의 최상위 클래스 Exception: 거의 모든 예외를 처리함
		
		//   #@333333 A 안녕하세요      <<깨진게 아니다?
		//데이터 읽기(DataInputStream)
		try (InputStream is=new FileInputStream(dataFile);
				DataInputStream dis=new DataInputStream(is);)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
