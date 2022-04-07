package ch14.Ex06;
//예외 처리 2가지
//1 직접 처리: try catch
//2 예외 전가(미루기): throws  (메소드를 호출해서 처리함)

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);//일반 예외 : interruptedException
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("예외 발생 1");
		}
	}
}
class B{
	void abc() {//bcd()의 예외 처리 의무를 가짐
		try {
			bcd();
			
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("예외 발생 2");
		}
	}
	void bcd() throws InterruptedException { //bcd()에서 예외를 처리하도록 미룬다
		Thread.sleep(1000); //일반 예외 : interruptedException
	}
}

public class ThrowsExeption1 {
	public static void main(String[] args) {
		A a1=new A();
		a1.abc();
		B b1=new B();
		b1.abc();
	}
}
