package ch14.Ex03;

public class Multicatch2 {
	public static void main(String[] args) {
		//1 Exception 클래스
		
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10a");
		} catch (Exception e) {
			//try{}에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외처리 Exception");
			
		}
		
		//2 catch{}의 순서가 잘못된 경우 : Exception은 catch의 마지막에 위치해야함
//		try {
//			System.out.println(10/0);
//			int num=Integer.parseInt("10a");
//		} catch (Exception e) {
//			//try{}에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
//			System.out.println("예외처리 Exception");
//		} catch (ArithmeticException e) {
//			
//		} catch (NumberFormatException e) {
//			
//		}
		
		//3 catch{}의 올바른 순서: 최상위 Exception은 catch{}의 마지막에 위치
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10aaa");
		} catch (ArithmeticException e) {
			System.out.println("aa");
		} catch (NumberFormatException e) {
			System.out.println("nn");
		}catch (Exception e) {//최상위 부모인 Exception은 마지막에 위치
			//try{}에서 발생하는 모든 예외는 Exception 클래스가 모두 처리
			System.out.println("예외처리 Exception");
		}
		
		//4 여러개의 exception을 한번에 적용
		try {
			System.out.println(10/0);
			int num=Integer.parseInt("10aaa");
		} catch (ArithmeticException | NumberFormatException e) {
			
		} catch (Exception e) {
			
		}
		
		
		System.out.println("end");
	}
}
