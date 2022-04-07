package ch16.Ex08;

class A{}
class B extends A{}
class C extends B{}
//제네릭 타입으로 들어오는 객체에 제한을 둠
class D<T extends B>{ //T: B,C 클래스만 올 수 있다
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


public class BoundedTypeOfGeneric {
	public static void main(String[] args) {
//		D<A> d1=new D<A>(); //불가능 
		D<B> d2=new D<B>(); 
		D<C> d3=new D<C>(); 
		
		D d4=new D(); //타입이르 지정하지 않고 객체 생성 시 최상위 ㅏ칭ㅂ럼;;
		
		d2.setT(new B());
		d2.setT(new C());
//		d2.setT(new A());//오류
		
		//d3는 c 타입만 넣을 수 잇다
//		d3.setT(new B());//오류
		d3.setT(new C());
//		d3.setT(new A());//오류
		
//		d4.setT(new A()); //error
//		d4.setT(new B)); //error
		d4.setT(new C()); //error
		
	}
}
