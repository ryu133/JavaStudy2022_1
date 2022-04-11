package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import ch14.Ex04.TryWithResource1;

//1 is1  <=inputstream 객체 (절대경로로 접근 ms949) 예외처리
//2 is2  <=inputstream 객체 (상대경로로 접근 utf-8) 예외처리 
		//close() 자동 처리

//파일인풋스트림으로 읽어서 출력

public class Ex3_Exception1 {
	public static void main(String[] args) {
		File ms=new File("C:\\Users\\kosmo\\OneDrive - 유한대학교\\박장우T\\java\\kosmo_r\\src\\ch19\\Ex04\\exceptionMS949.txt");
		File utf=new File("ch19/Ex04/exceptionUTF8.txt");
		
		InputStream is1=null; //전역 변수로 선언. finally 블록에서 close()를 사용하기 위해
		byte[] arr=new byte[100];
		int data=0;
		
		//try-catch 여러개로 처리
		try {
			is1=new FileInputStream(ms); //객체 생성
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} 
		
		try {
			while ((data=is1.read(arr))!=-1) { 
				String str=new String(arr,0,data,Charset.forName("MS949"));
				System.out.println(str);
//				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		} finally {
			if (is1!=null) {
				try {is1.close();} catch (Exception e2) {}
			}
		}
		System.out.println();
		
		
		//여러 exception에 대해서 단일 try-catch로 처리
			//한글 처리 #1 byte[] 선언
		InputStream is11=null; //전역 변수로 선언. finally 블록에서 close()를 사용하기 위해
		byte[] arr1=new byte[100];
		int data1=0;
		
		try {
			is11=new FileInputStream(ms); //객체 생성	 FileNotFoundException 오류 발생 가능
			while ((data1=is11.read(arr1))!=-1) { 	//IOException 오류 발생 가능
				//한글 처리 #2 read(byte배열)
				String str=new String(arr1,0,data1,Charset.forName("MS949"));
				//한글 처리 #3 String(byte배열,offset,length,"인코딩 타입")
					//offset:		length:
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다.");
		} finally {
			if (is11!=null) {
				try {is11.close();} catch (Exception e2) {}
			}
		}

		
		
		System.out.println();
		
		byte[] arr2=new byte[100];
			//한글 처리 #1 byte 배열 선언
		try (InputStream is2=new FileInputStream(utf);) {
			//try(with resource): 객체생성, 메모리(RAM) 사용 <= close() 자동 처리됨 AutoCloseable의 close()를 구현한 클래스
			while ((data=is2.read(arr2))!=-1) {
					//한글 처리 #2 is.read(byte 배열)
				String str=new String(arr2,Charset.forName("UTF-8"));
					//한글 처리 #3 new String(byte배열,(offset,length,)"encoding")
													//offset,length 생략 가능
				System.out.println(str);
//				System.out.print((char)data);
			}
		} catch (Exception e) {
			System.out.println("error");
		}
		
		
	}
}
