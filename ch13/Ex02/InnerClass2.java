package ch13.Ex02;
//이너 클래스에서 외부 클래스의 필드와 메소드 접근 방법
/*오버라이딩 : 1 부모와 자식이 상속 관계
			2 <<인스턴스 메소드 오버라이딩>>
			3 인스턴스 필드, 정적(static) 필드, 정적(static) 메소드는 오버라이딩 불가
*/

class A{
	int a=3;
	int b=4;
	int c=33;
	int d=44;
	void abc() {
		System.out.println("A 클래스의 메소드 abc()");
	}
	class  B{ //이너클래스에서 외부 클래스의 중복된 필드나 메소드를 호출할 경우 A.this.
		int a=5;
		int b=6;
		void abc() { // 주의! 오버라이딩이 아닌 별개의 메소드. 외부와 내부 클래스의 동일한 메소드는 별개의 공간에 위치
			System.out.println("B 클래스의 메소드 abc()");
		}
		void bcd() {
			//1 자기 자신의 필드와 메소드 호출(이너클래스의 필드와 메소드) 
			System.out.println(a); //5 this.a
			System.out.println(b); //6 this.b
			abc(); //B 클래스의 메소드 abc()  this.abc()
			
			//2 아우터 클래스의 필드와 메소드 호출
			System.out.println(A.this.a); //3  A.this.a: outer class의 필드값 호출
			System.out.println(A.this.b); //4  <<주의! 상속이 아니므로 super가 아님>>
			
			A.this.abc(); //A 클래스의 메소드 abc()
			//3 아우터 클래스의 필드와 메소드 호출
			System.out.println(c); //33
			System.out.println(d); //44
			
		}
	}
	
}
public class InnerClass2 {
	public static void main(String[] args) {
		A a=new A();
		A.B b=a.new B();
		
		b.bcd();
		
		System.out.println("============");
		
		//내부 클래스의 필드와 메소드 호출
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
		
				
	}
}
