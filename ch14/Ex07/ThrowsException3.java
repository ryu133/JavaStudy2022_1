package ch14.Ex07;
//Exception - Checked Exception : 컴파일 오류, 반드시 예외처리
//			- unChecked Exception, RunTime Exception - 실행 시 예외

//예외 처리 방법 2가지
//1 try catch : 자신이 직접 예외를 처리
//2 thows : 예외 처리흫 미룬다(전가), 메소드 블록 안의 예외를 메소드 호출 시 호출하는 곳으로 미룬다
//		throw : 예외를 강제로 발생시킴

//Exception이 발생되는 메소드 내부에서 자신이 직접 예외를 처리하는 경우
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls=Class.forName("java.lang.Object"); //일반예외 ClassNotFoundException
			Thread.sleep(1000); //ms(미리세컨드)  1000ms=1s   //일반예외
		} catch (ClassNotFoundException | InterruptedException e) {
		} 
		//Class.forName : 동적로딩 (컴파일 시 체크하지 않고 실행할 때 객체가 존재하는지 확인
			//실행 시 클래스 파일이 존재할 수도 잇고 아닐수도 있기때문에 예외처리를 해야함
	}
}
class B{ //Throws를 사용해서 Exception을 미루기 
	void abc() {
		
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			
		}
	}
	//bcd()를 호출하는 곳에 예외를 미룬다
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls=Class.forName("java.lang.Object"); //일반예외 ClassNotFoundException
		Thread.sleep(1000);
	}
}
public class ThrowsException3 {
	public static void main(String[] args) {
		
	}
}
