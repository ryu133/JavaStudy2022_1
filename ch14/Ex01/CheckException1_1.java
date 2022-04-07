package ch14.Ex01;

public class CheckException1_1 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		} catch (ArithmeticException e) {
			//try{}에서 오류가 발생할 경우에 작동
//			e.printStackTrace();//오류에 대한 자세한 정보를 출력
			System.out.println("0을 넣을 수 없습니다.");
			//catch{}에 내용이 없어도 예외처리가 됨 
		}finally {
			//try{}에 오류가 없어도, 있어도 작동됨
			//try{}가 작동되면 finally{} 항상 작동
			//객체를 사용 후 객체의 메모리를 제거할 때 사용함  ex)sc.close();
			System.out.println("finally{} 항상 호출됨");
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}
}
