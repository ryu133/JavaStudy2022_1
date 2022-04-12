package ch19.Ex05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//InputStream: 추상 클래스 <= FileInputStream를 구현한 클래스 (읽기)
//OutputStream: 추상 클래스 <= FileOutputStream를 구현한 클래스 (쓰기)
//FileInputStream: byte 단위 데이터 읽기
//FileOutputStream: byte 단위 데이터 쓰기

//Windows 콘솔이나 메모장에 Enter를 넣으면 \r\n으로 값이 처리됨
//Mac : \n

public class FileOutputStream1 {
	public static void main(String[] args) throws IOException {
		//1 입력 파일 생성
		File outFile=new File("ch19/Ex05/FileOutput1.txt");
			//FileOutputStream에 존재하지 않는 파일을 넣으면 실행 시 생성됨
			//FileInputStream 경로에 파일이 존재해야 함. 없다면 예외 발생
		
		//2-1 byte 쓰기
		OutputStream os1=new FileOutputStream(outFile);
		os1.write('J');  //write: IOExceptioin 발생 가능
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); //13  <= 생략 가능
		os1.write('\n'); //10
		
		//중요! write() 는 버퍼(RAM)에 쓰기, 버퍼가 다 차면 파일에 쓰기
		//		flush() : 버퍼에 저장된 내용을 파일에 강제로 쓰기
		
		os1.flush(); //버퍼가 다 차지 않더라도 강제로 파일에 쓰게 함 <= 생략 가능, write()를 사용하면 flush() 사용할 것을 권장
		os1.close(); //close() 호출 시 flush() 먼저 작동됨
		
		//2-2 n-byte 단위 쓰기 (byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os2=new FileOutputStream(outFile);  //덮어쓰기(false) 기본값. 생략 가능  //이어쓰기(true)
						//FileOutputStream(File o, Boolean append) o:파일 객체 append: true or false
		byte[] byteArray1="Hello!".getBytes();  //Hello!: string --> byte로 변환해야 함. getBytes() 사용
		
		os2.write(byteArray1);
		os2.write('\n'); //\r은 생략 가능, \n만 넣어도 windows에서 enter 적용됨
		
		os2.flush();
		os2.close(); //
		
		//3 n-byte 단위 쓰기 (byte[]의 offset부터 length개의 byte 데이터 쓰기)
		OutputStream os3=new FileOutputStream(outFile,true); //이어쓰기
		byte[] byteArray2="Better the last smile than the first laughter".getBytes();
		os3.write(byteArray2,7,8); //7부터 8개 읽어서 저장
		
		os3.flush();
		os3.close();
		
		
		
		
	}
}
