package ch10.Ex02;
//다형성: 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymorphism {

	public static void main(String[] args) {
		//1 업캐스팅: 자식->부모(자동 변환): 생략 시 컴파일러가 자동으로 추가
		A ac=(A)new C();//c->a:c는 a다  ac는 a,b,c 클래스의 필드와 메소드 포함, a의 필드와 메소드에 접근 가능
		A ab=new B();//b->a: b는 a다  ab는 a,b 클래스의 필드와 메소드 포함, a의 필드와 메소드에 접근 가능
		B bd=new D(); //d->b:d는 b다  db는 a,b,d 클래스의 필드와 메소드 포함, a,b의 필드와 메소드에 접근 가능
		C c=new C(); //c->c:c는 c다  c는 c클래스의 필드와 메소드 포함, c의 필드와 메소드에 접근 가능
		
		//2 객체 생성을 할 수 없는 경우(상속)
//		B b=new A();
//		C cc1=new B();
//		D dd1=new B();
//		C cd=new D();
		
		//3 다운캐스팅: 부모->자식(수동 변환): 강제 형변환 필요
		//다운캐스팅이 불가능한 경우:다운캐스팅할 데이터 타입이 포함되어있지 않은 경우
		A aa=new A();//aa는 a타입만 내포하고 있다
//		B b1=(B) aa;//실행 시 오류 발생
		//java.lang.ClassCastException: 다운 캐스팅 시 객체 내의 해당 타입이 존재하지 않는 경우
//		C cc2=new ( C)aa; // aa는 C 타입으로 내포하지 않는데 다운캐스팅할 경우 실행오류
		
		//컴파일 오류: 프로그램을 실행 전 이클립스가 체크
		//런타임 오류: 실행 시 발생되는 오류
		
		//4 다운캐스팅이 가능한 경우:객체 내부에 자식 데이터 타입을 가지고 있으면 캐스팅 가능
		A ac3=new C();//ac3는 abc포함, a의 필드와 메소드 접근 가능
		
		B ac5=(B)ac3;//a->b
		C ac6=(C)ac3;//a->c
		
		A ad2=new D();//ad2는 a,b,d 포함  a만 사용 가능
		B bd3=(B) ad2;
		D dd4=(D)ad2;
		
		
		
	}

}
