package ch14.Ex03;
//여러개의 예외가 동시에 발생될 경우
public class MultiCatch1 {
	public static void main(String[] args) {
		//try catch
		//1 단일 예외 처리
		try {
			//ArithmeticException
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			//catch{}에 아무 내용이 없어도 예외처리됨
			System.out.println("정상 출력(ArithmeticException)");
		}
		
		try {
			//NumberFormatException
			int num1=Integer.parseInt("10a");
			
		} catch (NumberFormatException e) {
			System.out.println("정상 출력(NumberFormatException)");
		}
		
		System.out.println("=======================");
		
		//2 다중 예외처리 1
		try { //try{}에서 여러 예외가 발생될 경우 
			System.out.println(10/0);
			int num2=Integer.parseInt("10a");
			
		} catch (ArithmeticException e) {
			System.out.println("(ArithmeticException) 발생");
		}catch (NumberFormatException e) {
			System.out.println("(NumberFormatException) 발생");
		}
		
		//2 다중 예외처리 2
		try {
			System.out.println(10/0);
			int num2=Integer.parseInt("10a");
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("다중 예외 처ㅣㄹ");
		}
		
		
		System.out.println("end");
	}
}
