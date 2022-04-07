package ch05;

public class SharingStringObject {
	public static void main(String[] args) {
		//1 문자열 객체 공유(리터럴로 생성한 경우, new로 생성한 경우:별도의 공간에 생성)
		
		String str1=new String("HI"); //new로 생성하면 메모리 공유하지 않음
		String str2="HI";
		String str3="HI";
		String str4=new String("HI");
		
		//각 변수의 메모리 주소 비교(==)
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str1==str4);
		
		//각 변수의 메모리의 값을 비교: 변수명.equals(변수명) <== 참조 자료형일 때 값을 비교함
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str1));
		
	}
}
