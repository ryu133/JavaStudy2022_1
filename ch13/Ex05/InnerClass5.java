package ch13.Ex05;
//지역 내부 클래스의 컴파일 이후 생성 클래스 파일
//지역 내부 클래스: 메소드 내부에 선언된 클래스
class A{
	void abc() {
		class B{} //A$1B.class
		class C{} //A$1c.class
	}
	void bcd() {
		class C{} //A$2C.class 동일한 이름이 존재할 경우 메소드 숫자가 들어감
		class D{} //A$1D.class
	}
	void cde() {
		class B{} //A$2B.class
		class C{} //A$3C.class
		
	}
}
public class InnerClass5 {
	public static void main(String[] args) {
		
	}
}
