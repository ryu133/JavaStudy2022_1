package ch13.Ex08;
//클래스 정의 및 참조변수를 사용 / 미사용인 경우 매개변수로 객체 전달
interface A{
	public abstract void abc();
}
//1 자식 클래스를 직접 생성 
class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}
class C{ //cde()에 인풋값으로 a타입의 객체 a를 받음
	void cde(A a) { //cde()를 호출하면서 매개변수 값으로 A 타입의 객체를 넣음  
		a.abc();
	}
}


public class Anonymous3 {
	public static void main(String[] args) {
		
		//1 방법: 클래스명o + 참조변수명0
		C c=new C(); 
		A a=new B();  //클래스명(A), 참조변수생성(a)  <=첫번째 방법
		c.cde(a); //매개변수에 객체 a를 생성해서 넣음
		
		System.out.println("===============");
		
		//2 방법: 클래스명o + 참조변수명x
		c.cde(new B());
		
	}
}
