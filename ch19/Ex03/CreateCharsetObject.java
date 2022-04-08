package ch19.Ex03;

import java.nio.charset.Charset; //Charset 클래스

public class CreateCharsetObject {
	public static void main(String[] args) {
		//문자 인코딩 설정을 적용하는 방법
		//1 Charset.defaultCharset() : 시스템의 기본 설정으로 로드(인코딩 타입)
		Charset cs1=Charset.defaultCharset(); //정적 메소드, 시스템의 기본 설정된 Charset을 불러옴
		System.out.println(cs1); //MS949 --> x-windows-949 (MS949의 확장)
								//UTF-8
		
		//2 Charset.forName("MS949")
		Charset cs2=Charset.forName("MS949");
		System.out.println(cs2);
		
		Charset cs3=Charset.forName("UTF-8");
		System.out.println(cs3);
		
		Charset cs4=Charset.forName("EUC-KR"); //존재하지 않는 인코딩을 넣으면 예외 발생. 실행예외처리 필요
		System.out.println(cs4);
		
		System.out.println(Charset.isSupported("MS949")); //지원되는 인코딩인지 확인
		System.out.println(Charset.isSupported("UTF-8"));
		System.out.println(Charset.isSupported("EUC-KR"));
		System.out.println(Charset.isSupported("UTF-16"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
