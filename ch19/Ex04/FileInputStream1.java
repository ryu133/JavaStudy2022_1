package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStream1 {
	public static void main(String[] args) throws IOException {
		//현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		//1 입력 파일 생성
		//절대 경로로 설정
		File inFile1=new File("C:\\Users\\RMJ\\OneDrive - 유한대학교\\박장우T\\java\\kosmo_r\\src\\ch19\\files\\FileInputStream1.txt");
		//상대 경로로 설정: 현재 작업 디렉토리를 기준으로 설정
		File inFile=new File("ch19/files/FileInputStream1.txt"); 
		
		//InputStream 객체를 생성해야 파일의 내용을 읽을 수 있다
		InputStream is=new FileInputStream(inFile);
			//InputStream은 추상클래스, 직접 객체를 생성할 수 없다. 타입 지정은 가능
		
		//파일의 내용을 출력
		
		//UTF-8: 영어는 1byte, 한글은 3byte
		//MS949: 영어는 1byte, 한글은 2byte
		//EUC-KR: 영어는 1byte, 한글은 2byte
		//UTF-16: 영어는 2byte, 한글은 2byte ,첫번째에 식별자 BOM 2byte
		
		//한 바이트 데이터를 읽어서 char로 변환 후 출력
		System.out.print((char)is.read()); //read(): 한 바이트를 읽어들인다
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		System.out.print((char)is.read());
		
		System.out.println();
		System.out.println();
		
		//스트림은 다 읽으면 더 이상 읽을 수 없다(메모리에서 삭제됨) 다시 읽기 위해서는 새로운 스트림을 생성해야 함
		
		//int read(): 한 바이트를 읽어서 값이 존재할 경우 양수를 리턴, 읽을 데이터가 없는 경우 -1 리턴
		//while 문을 사용해서 한번에 출력
		InputStream is1=new FileInputStream(inFile);
		
		int data;
		
		while ((data=is1.read())!=-1) { //마지막 값까지 순환
			System.out.print((char)data);
		}
		
		InputStream is2=new FileInputStream(inFile);
		
		//available(): 스트림의 남은 바이트 수를 출력
		while ((data=is2.read())!=-1) { //마지막 값까지 순환
			System.out.println("읽은 데이터: "+(char)data+" 남은 바이트 수: "+is2.available());
		}
		is.close();
		is1.close();
		is2.close();
		
		
		
		
		
		
		
		
		
	}
}
