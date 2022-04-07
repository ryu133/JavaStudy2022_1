package ch16.Ex11;

//제네릭 클래스의 상속
///자식 클래스는 부모 클래스의 제네릭 변수(K,V,T,E)의 수와 타입이 같거나 더 많아야 함

class Parent<T>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Child1<T> extends Parent<T>{
	
}

class Child2<T,V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
	
}


public class InheritanceGenericClass {
	public static void main(String[] args) {
		//부모 제네릭 클래스 생성
//		Parent<String> p=new Parent<String>();
//		Parent<String> p=new Parent();//생략 가능
		Parent<String> p=new Parent<>();//생략 가능
		
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		
		Parent<Integer>i1=new Parent();
		i1.setT(1);
		System.out.println(i1.getT());
		
		//자식 클래스 
		Child1<String>c1=new Child1();
		c1.setT("자식1 제너리 ㄱ클래스");
		System.out.println(c1.getT());
		
		//자식 클래스 2
		Child2<String, Integer> c2=new Child2();
		
		c2.setT("자식2 = 제네릭 클래스");//부모
		c2.setV(100);				//자식
		System.out.println(c2.getT());//부모
		System.out.println(c2.getV());//자식
		
		
		
		
	}

}
