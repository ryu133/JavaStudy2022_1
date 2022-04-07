package Ch11.Ex03;
//abstract(추상) 메소드 : 실행 영역이 없는 메소드, 선언만 되어있는 메소드
// 추상 클래스는 객체화할 수 없다, 타입으로 정의할 수는 있음
// ((팀장이 메소드를 정의해줌-> 회사의 기능구현 메소드를 정의
// 팀원은 설계해준 추상 메소드를 오버라이딩해서 구현부를 만들게 됨
// 하위 클래스에서 메소드 오버라이딩 시 오류를 방지하기 위함))
// 자식 클래스에서 재정의해서 구현영역을 생성해야 함
//ex)) 메드의 기본 형식 : void print(){}
//		abstract void print();
//		추상 클래스: abstract class A{추상메소드를 하나 이상 포함하면}
//
abstract class A{ //추상 클래스 : 추상 메소드를 하나라도 포함하면 반드시 추상 클래스여야 함
	abstract void print(); //추상 메소드
	abstract void cry();
}
class B extends A{ //콘크리트 클래스 : 추상 클래스에서 선언한 메소드를 모두 구현한 클래스
	@Override
	void print() {
		System.out.println("콘크리트 클래스 : 추상 클래스의 추상 메소드를 모두 구현한 클래스");
	}
	@Override
	void cry() {
		System.out.println("야옹");
	}
}
abstract class C extends A{ //부모의 추상 메소드 중 일부만 구현할 경우 : 추상 클래스

	@Override
	void print() {
		
	}
}
class D extends C{ //콘크리트 클래스 : 추상 클래스에서 선언한 메소드를 모두 구현한 클래스
	@Override
	void cry() {
		
	}
}

public class AbstractModifier1 {
	public static void main(String[] args) {
		
	}

}
