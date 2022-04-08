package ch18.Ex07;

interface A{
	int abc(String str);
}


public class RefOfInstanceMethodType2_2 {
	public static void main(String[] args) {
		//인스턴스 메소드 참조 type2 - 정적 메소드
		//1 익명 이너클래스
		A a1=new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//2 람다식 표현
		A a2=(String str)-> str.length();
		
		//3 인스턴스 메소드 참조 type2
		A a3=String::length;
		
		System.out.println(a1.abc("안녕"));
		System.out.println(a2.abc("안녕하세요"));
		System.out.println(a3.abc("안녕하세요 반갑습니다"));
		
		
		
		
		
		
	}
}
