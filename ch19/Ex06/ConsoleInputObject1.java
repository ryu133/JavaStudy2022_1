package ch19.Ex06;
//System.in: console에서 입력받기(자바에서 제공해주는 객체), InputSteam
	//windows: 콘솔에서 enter: \r\n
	//mac: 콘솔에서 enter: \n
//System.out: console에서 출력하기(자바에서 제공해주는 객체), OutputSteam

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject1 {
	public static void main(String[] args) throws IOException {
		//스트림은 한번 쓰면 재사용 불가
		
		//1 console에서 입력받을 객체 생성
		InputStream is1=System.in; //is1은 콘솔에서 입력받아서 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>");
		
		int data;
		
		while ((data=is1.read())!='\r') { //1byte 읽어서 data 변수에 할당
			System.out.println("읽은 데이터: "+(char)data+" 남은 바이트 수: "+is1.available());
		}
		
		System.out.println(data); //\r : 13
		System.out.println(is1.read()); //\n : 10
		
		
		
		while ((data=is1.read())!='\r') {
			System.out.println((char)data);
		}
		
		
		
		
		
		
	}
}
