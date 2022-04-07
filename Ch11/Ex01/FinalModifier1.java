package Ch11.Ex01;
//final : (수정 불가)마지막
//	-필드명, 지역변수명 앞에 있을 때 : 상수
//			: final double PI=3.14;  <== 상수는 값을 변경할 수 없다.
// 			:클래스 영역 내의 상수 영역에 값이 복사, 객체나 메소드가 사라질 경우에도 호출이 가능
//	-메소드명 앞에 있을 떄 : 오버라이딩이 불가한 메소드(자식 클래스에서 메소드 오버라이딩이 불가)
//			:final void print(){} 
//	-클래스명 앞에 있을 때 : 상속이 불가한 클래스
//			: final class A {}    <== 자식 클래스를 두지 않는 마지막 클래스
class A1{
	int a=3; //필드명, 지역변수명은 소문자 사용, 여러문자가 이어지는 경우 첫자를 대문잘로 작성
	final int B=5; //상수명은 대문자 사용. 값을 변경할 수 없다
	A1(){}
}
class A2{
	int a;
	final int B;
	A2(){
		a=3;
		B=5;
	}
}
class A3{
	int a=3; //필드 : 값 변경 가능
	final int b=5; //상수 : 값 변경 불가
	A3(){
		a=5;
//		b=10; //final은 값을 수정할 수 없다.
	}
}
class B{
	void bcd() { 
		int a=3; //지역변수 : 메소드 내에서 선언된 변수(메소드 호출이 끝나면 사라짐) 스택 영역에 값이 저장됨
		final int B=5; //상수 : 클래스 영역의 상수 영역에 복사되서 메소드가 끝나도 상수 영역에 남아있음
		a=7;
//		B=9; //final은 값을 변경할 수 없다
	}
}
public class FinalModifier1 {
	public static void main(String[] args) {
		
	}
}
