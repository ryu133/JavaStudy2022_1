package ch05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1 문자열 + 문자열
		String str1="HI"+"HELLO"+"!";
		System.out.println(str1);
		
		String str2="BOOO";
		str2+="i'm hungry"; 
		str2+="!"; 
		System.out.println(str2);
		
		//2 문자열 + 기본자료형 (기본자료형이 문자열로 변환됨)
		String str3="HI"+1;
		String str4="HI"+String.valueOf(1);
		String str5="HI"+"1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//3 문자열과 기본자료형을 혼용하여 사용하는 경우
		System.out.println(1+"HI");
		System.out.println(1+"HI"+2);
		System.out.println("HI"+1+2);
		System.out.println(1+2+"HI");
	}

}
