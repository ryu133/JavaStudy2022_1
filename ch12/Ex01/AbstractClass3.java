package ch12.Ex01;
abstract class D{ //클래스 내부에 추상메소드가 있을 경우 abstract 클래스가 되어야 함
					//자식 클래스에서 반드시 오류없이 메소드를 재정의하는 것을 보장
	abstract void print(); //추상 메소드
}
class E extends D{ //추상 클래스의 메소드를 재정의하는 자식 클래스
	@Override
	void print() {
		System.out.println("class E - print()");
	}
}
public class AbstractClass3 {
	public static void main(String[] args) {
		D e=new E();
		e.print();
		D ee=new E();
		ee.print();
		D eee=new E();
		eee.print();
		
		D d=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		D dd=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		D ddd=new D() {
			@Override
			void print() {
				System.out.println("class D - print()");
			}
		};
		d.print();
		dd.print();
		ddd.print();
	}
}
