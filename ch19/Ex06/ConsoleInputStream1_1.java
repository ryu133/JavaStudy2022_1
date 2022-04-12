package ch19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputStream1_1 {
	public static void main(String[] args) throws IOException {
		//스트림은 한번 쓰면 재사용 불가
		
		//1 console에서 입력받을 객체 생성
		InputStream is1=System.in; //is1은 콘솔에서 입력받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>");
		
		int data;
		
		while ((data=is1.read())!='\n') { //1byte 읽어서 data 변수에 할당
			System.out.print((char)data);
		}
		
		System.out.println(data); //\n : 10
		System.out.println(is1.read()); // 값 없음
		
		
		
		
	}
}
