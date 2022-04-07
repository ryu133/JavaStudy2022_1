package ch14.Ex08;
//사용자 정의 예외
// 1 Exception을 상속하는 예외 : Checked Exception - 컴파일 단계에서 예외처리 필요
// 2 RunTime Exception을 상속하는 예외 : unChecked Exception - 실행 시 예외 발생할 수 있음

class MyException extends Exception{
	public MyException(){
		super();
	}
	public MyException(String message){//예외 메세지 출력
		super(message);
	}
}
class MyRTException extends RuntimeException{
	public MyRTException (){
		super();
	}
	public MyRTException(String message) {//예외 메세지 출력
		super(message);
	}
}
class A{
	//사용자 정의 예외 객체 생성
	MyException me1=new MyException();
	MyException me2=new MyException("예외 메세지 : MyException"); //예외 발생 시 에외 메세지를 출력하는 생성자
	
	MyRTException mre1=new MyRTException();
	MyRTException mre2=new MyRTException("예외 메세지 : MyRTException");
	
	//예외를 강제로 발생시키기(throw)
	void abc1(int num) {
		try {
			if (num>70) { //abc1()
				System.out.println("정상 작동");
			} else {
				throw me1; //예외를 강제로 발생시킴
			}
			
		} catch (Exception e) { //me1에 throw로 강제로 예외를 발생시킴
			System.out.println("70 이하 값을 넣었습니다. 70 이상의 값을 넣으세요");
			System.out.println(e.getMessage());
		}
	}
	
	//예외의 전가(throws): abc2()메소드를 호출하는 곳에서 예외 처리
	void abc2(int num) throws MyException {
		if (num>70) {
			System.out.println("정상작동");
		}else {
			throw me2; //throw는 강제 예외 발생시킴
		}
	}
	
	
	void bcd1() {
		abc1(65);//예외 발생함
	}
	void bcd2() {
		try {
			abc2(65);
		} catch (MyException e) {
			System.out.println("70 이하 값을 넣었습니다. 70 이상의 값을 넣으세요");
			System.out.println(e.getMessage());
		}
	}
}
public class CreatUserException1 {
	public static void main(String[] args) {
		A a=new A();
		a.bcd1(); //예외 직접 처리
		a.bcd2(); //예외 미뤄서 처리
		
	}
}
