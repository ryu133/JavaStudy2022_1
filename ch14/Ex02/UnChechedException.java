package ch14.Ex02;
//실행예외(unchecked exception,runtime exception): 컴파일 단계에서는 예외가 발생되지 않음
//실행 시 발생될 수 있다

class AA{}
class BB extends AA{}
public class UnChechedException {
	public static void main(String[] args) {
		//실행 예외
		
		//ArithmeticException: 0으로 어떤 수를 나누면 오류 발생
//		System.out.println(10/0);
		
		//ClassCastException: 클래스의 타입을 변환할 때 변환되지 않는 예외
		AA aa=new AA();
//		BB bb=(BB)aa;//컴파일 단계에서는 오류가 발생하지 않음
		
		//ArrayIndexOutOfBoundsException: 배열에서 존재하지 않는 방번호를 출력할 경우 발생
		int[] array= {1,2,3};
//		System.out.println(array[3]); 
		
		//NumberFormatException: 문자형 숫자를 정수 타입으로 변환할 수 업는 예외
		int num=Integer.parseInt("10!"); //숫자인 문자열 10을 정수로 변환
		System.out.println(num);
		
		//NumberFormatException: 
		String string=null;
		System.out.println(string.charAt(4));
		
		
	}
}
