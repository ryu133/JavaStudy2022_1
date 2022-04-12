package ch19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject2 {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in; //콘솔을 통해 입력 받겠다
			//System.in은 한 페이지에서 한번만 만들 수 있음. 중간에 close() 호출하면 다시 입력받을 수 없다.
//		InputStream is2=System.in; //생성할 수 없음
		
		System.out.println("영문을 입력하세요. >>");
		
		//1-1 byte 단위 읽기
		int data;
		while ((data=is.read())!='\r') { //'\r' <= is.read() 호출될 때 콘솔에서 입력 대기
			System.out.print((char)data);
		}
		is.read(); //10 <= \n     //버퍼에 \n이 남아있음, 버퍼에서 \n 처리해야 함. 안하면 다음 read()에 남아있음
			//남은 \n 읽기
		
		System.out.println();
		System.out.println("==================");
		
		//2 n-byte 단위로 읽기 (byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1=new byte[100]; //콘솔에서 배열에 저장될 때 \r\n
		int count1=is.read(byteArray1); //count1은 100,100,30,-1
			//count1: 배열에서 읽은 값의 개수를 저장
		
		for (int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1= "+count1);
		}
		System.out.println("=================");
		
		int count2;
		count2=is.read(byteArray1); //배열 내부에 \r, \n 이 들어간다. 
		System.out.println(new String(byteArray1,0,count2));
		
//		while ((count2=is.read(byteArray1))!='\r') { //콘솔에서는 -1을 사용하지 않고 \r로 처리
//			System.out.println(new String(byteArray1));
//		}
//		is.read();  //주석 처리됨. 배열 내부에 \r\n 이 남아 들어가서 개행 시켜준다 
		
		System.out.println("==================");
		
		//3 n-byte 단위로 읽기 (byte[]의 length만큼 읽어서 offset 위치에서 저장)
		byte[] byteArray2=new byte[8];
		int offset=3;
		int length=5;
		
		int count3=is.read(byteArray2,offset,length);
		
		for (int i = 0; i < offset+length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		is.close(); //제일 마지막
	}
}
