package ch05;

import java.util.Arrays;

public class MethodOfString01 {
	public static void main(String[] args) {
		//1 문자열 길이 (length): int 타입으로 반환
		String str1="Hello Java!";
		String str2="안녕하세요! 반갑습니다.";
		//str1: 참조변수, 객체, 인스턴스
		System.out.println(str1.length());
		System.out.println(str2.length());
		//java에서 length는 글자수를 뜻함(한글은 2byte지만)
		
		//2 문자열 검색(charAt(), indexOf(), lastInexOf())
		System.out.println(str1.charAt(1)); //1번 방의 문자를 출력
		System.out.println(str2.charAt(1));
		//indexOf(): 0번째 방부터 마지막 방까지 글자의 방 번호(index) 출력
		//lastIndexOf(): 마지막 방부터 0번째 방으로 글자의 방 번호를 출력
		System.out.println(str1.indexOf('a')); //7
		System.out.println(str1.lastIndexOf('a')); //9
		System.out.println(str1.indexOf('a',8)); //8번 방부터 검색 시작-> 
		System.out.println(str1.lastIndexOf('a',8)); //8번 방부터 검색 시작<-
		System.out.println(str1.indexOf("Java")); //검색 시작-> 
		System.out.println(str1.lastIndexOf("Java")); //검색 시작<-
		System.out.println(str2.indexOf("하세요")); //검색 시작-> 
		System.out.println(str2.lastIndexOf("하세요")); //검색 시작<-
		System.out.println(str1.lastIndexOf("Bye")); //검색 시작<- <<중요!>>(해당 값이 없다면 -1 출력)
		
		//3 문자열 변환 및 연결(String.valueOf(), concat())
		//String.valueOf(기본자료형): String으로 변환
		String str3=String.valueOf(2.3); //실수 2.3을 문자열로 변환
		String str4=String.valueOf(false); //false를 문자열로 변환
		System.out.println(str3);
		System.out.println(str4);
		
		//concat(): 문자열과 문자열을 연결 (+연산자 역할)
		String str5=str3.concat(str4);
		System.out.println(str5);
		
		//concat() 메소드에서 String.valueOf 사용 >> + (자동으로 타입 변환)
		String str6="안녕"+3; //연산자를 사용할 때 자동으로 변환됨
		String str7="안녕".concat(String.valueOf(3));
		//concat을 사용할 때 String 타입으로 변환 필요
		System.out.println(str6);
		System.out.println(str7);
		
		//4 문자열 ==> byte[] 타입으로 변환 (getBytes())
		//문자열 ==> char[] 타입으로 변환 (toCharArray())
		
		String str8="Hello Java!";
		String str9="안녕하세요";
		
		byte[] array1=str8.getBytes(); 
		byte[] array2=str9.getBytes();
		System.out.println(Arrays.toString(array1)); //아스키 코드가 출력됨
		System.out.println(Arrays.toString(array2));
		
		char[] array3=str8.toCharArray();
		char[] array4=str9.toCharArray();
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
	}
}
