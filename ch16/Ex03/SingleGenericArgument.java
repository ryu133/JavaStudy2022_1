package ch16.Ex03;
//Object: 모든 객체를 저장할 수 있지만 매번 다운캐스팅이 필요함, 캐스팅 시 예외 발생 가능(약한 타입 체크)
//generic class: 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다
	//제너릭 타입 변수 : T(타입), K(key) ,V(value) , N(number) , E(element)
	//A~Z 임의로 넣을 수 있음

	//wrapper 클래스: 기본 타입을 객체화시켜놓은 클래스
		//- int(기본타입)==> Integer(객체),boolean==> Boolean, char==> Character, double==>Double, float==>Float 등등

class MyClass<T>{ //제너릭 클래스
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}


public class SingleGenericArgument {
	public static void main(String[] args) {
		//제너릭 클래스 객체 생성
		MyClass<String> mc1=new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2=new MyClass<Integer>();
		mc2.set(100);
		System.out.println(mc2.get());
		
		MyClass<Double> mc3=new MyClass(); //생성자의 자료형은 생략 가능
		mc3.set(2.56);
		System.out.println(mc3.get());
		
		MyClass<Boolean> mc4=new MyClass();
		mc4.set(true);
		mc4.set(false);
//		mc4.set("안녕"); //강한 타입 체크, 실행 시 오류 방지
		System.out.println(mc4.get());
	}
}
