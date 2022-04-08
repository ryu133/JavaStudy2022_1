package ch19.Ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArraytoString {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//1 String getBytes(): String -> Byte[]로 분해해서 변환
		byte[] array1="안녕".getBytes(); //charset을 지정하지 않음
		byte[] array2="감사".getBytes(Charset.defaultCharset()); //문자열을 바이트로 변환해서 배열에 저장
		byte[] array3="베리".getBytes(Charset.forName("MS949"));//실행 예외 발생 가능
		byte[] array4="감사".getBytes("UTF-8"); //예외처리 필요 //일반 예외 발생 가능
		
		//2 각 인코딩의 바이트 수 출력
		System.out.println(array1.length); //MS949 : 한글 2byte //4
		System.out.println(array2.length); //MS949 : 한글 2byte //4
		System.out.println(array3.length); //MS949 : 한글 2byte //4
		System.out.println(array4.length); //UTF-8 : 한글 3byte //6
		
		//3 new String() : byte[] -> String 변환
		String str1=new String(array1);
		String str2=new String(array2,Charset.defaultCharset());
		String str3=new String(array3,Charset.forName("MS949")); //가져올 때 인코딩 타입이 일치해야 함(다르면 깨짐)
		String str4=new String(array4,Charset.forName("UTF-8"));
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		//4 한글이 깨지는 경우: 내보내는 인코딩 타입과 가져오는 인코딩 타입이 불일치할 경우
		String str5=new String(array1,Charset.forName("UTF-8"));
		String str6=new String(array1,Charset.forName("MS949"));
		String str7=new String(array3,Charset.forName("MS949"));
		
		
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		
		
		
		
		
		
	}
}
