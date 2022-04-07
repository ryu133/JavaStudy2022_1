package ch12.Ex01;

//추상 클래스를 객체화하는 방법2 (익명 클래스 활용)
// 임시로 사용할 때(이벤트)
// 장점: 자식 클래스를 생성하지 않는다. 임시로 사용하기에 유용
// 단점: 여러 개의 객체를 생성해야할 경우 코드가 길어짐 
abstract class AAA{
	abstract void abc();
}
public class AbstractClass2 {
	public static void main(String[] args) {
		//익명 클래스 생성
		AAA aaa=new AAA() {
			void abc() {
				System.out.println("방법2: 객체 생성없이 익명 클래스로 추상 메소드 구현");
			}
		};
		AAA aaa1=new AAA() { //추상클래스는 객체 생성 불가, 익명 클래스 생성 후 메소드 재정의해서 출력
			void abc() {
				System.out.println("방법2: 객체 생성없이 익명 클래스로 추상 메소드 구현");
			}
		};
		AAA aaa2=new AAA() {
			void abc() {
				System.out.println("방법2: 객체 생성없이 익명 클래스로 추상 메소드 구현");
			}
		};
		aaa.abc(); //메소드 호출
		aaa1.abc();
	}
}
