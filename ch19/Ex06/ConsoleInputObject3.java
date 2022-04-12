package ch19.Ex06;
//콘솔 입력 한글 처리
//InputStream System.in

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ConsoleInputObject3 {
	public static void main(String[] args) throws IOException {
		InputStream is=System.in; //System.in: 한번만 사용(선언) 가능. close() 제일 마지막에 사용

		System.out.println("한글을 입력하세요 >>");
		
		//#2 n-byte 배열 읽기 (byte[] 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1=new byte[100];
		int count1=is.read(byteArray1); //\r\n 포함
			//count1: byteArray1에 저장된 값의 개수
		
		String str1=new String(byteArray1,0,count1,Charset.defaultCharset());
		System.out.println(str1);
		
		System.out.println("배열의 방의 총 개수(r,n 포함됨): "+count1);
		
		System.out.println("================\n");
		
		//3 n-byte 단위 읽기(offset[index]위치에 length만큼 읽어서 byte[]에 저장)
		byte[] byteArray2=new byte[9];
		int offset=3;
		int length=6;
		int count2=is.read(byteArray2,offset,length);
		
		String str2=new String(byteArray2,0,offset+count2,Charset.defaultCharset());
		System.out.println(str2);
		
		
		
	}
}
