package Ch11.Ex02;
//final 메소드와 final class의 특징
//final 메소드: 오버라이딩이 불가. 아주 중요한 메소드는 자식에서 재정의하지 못하도록 설정
//final 클래스: 상속이 불가한 클래스
class A{
	void abc() {}
	final void bcd() {} //final 할당된 메소드는 자식 클래스에서 오버라이딩 불가
}
class B extends A{
	@Override
	void abc() {} //메소드 오버라이딩 가능
//	void bcd() {} //메소드 오버라이딩 불가
}
final class C{} //final class는 상속 불가한 클래스
//class D extends C{} //
public class FinalModifier2 {
	public static void main(String[] args) {
		
	}
}
