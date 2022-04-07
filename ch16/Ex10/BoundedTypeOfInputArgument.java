package ch16.Ex10;

//제네릭 메소드의 매개변수 제한

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

class Test{ //일반메소드. 매개변수로 들어오는 타입이 제너릭 타입
	void method1(Goods<A> g) {} //A 클래스 (객체생성) 타입
	void method2(Goods<?> g) {} //A,B,C,D
	void method3(Goods<? extends B> g) {} //B,C,D
	void method4(Goods<? super B> g) {} //A,B9+ 
	
}

public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		Test t=new Test();
		
		//method1 / A
		t.method1(new Goods<A>());
//		t.method1(Goods<B>());
//		t.method1(Goods<C>());
//		t.method1(Goods<D>());
		
		//method2 / ? : all
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//method3 / extends B : B~
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//method4 / super B : ~B
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
		
		
		
	}
}
