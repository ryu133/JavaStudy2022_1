package ch14.Ex08;
//메소드의 throws를 전가해서 main()까지 예외가 전가된 경우
//예외의 결과(정보)창을 띄우고 프로그램 종료됨
//main메소드는 예외처리를 하지 않는다
class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException {
		int num=Integer.parseInt("10a");//Exception 발생 (NumberFormatException)
	}
}
public class ExceptionMethod {
	public static void main(String[] args) throws NumberFormatException{
		AA aa=new AA();
		
		
		try {
		aa.abc(); //실행 예외(컴파일 단계에서는 오류가 없다.)
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
