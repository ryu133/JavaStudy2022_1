package ch14.Ex06;
//일반 예외 (checked exception):컴파일 단계에서 예외
// 1 직접 처리
// 2 throws 전가(미루기)

//main 메소드에 throws를 전가시키는 경우 >>exception 발생 시 exception의 정보를 출력하고 중지됨

public class ThrowsException2 {
	public static void main(String[] args) throws ClassNotFoundException{
		
		//정상적으로 파일이 존재함 
		Class cls1=Class.forName("java.lang.Object");
		
		//파일이 존재하지 않음.  ClassNotFoundException 발생
//		Class cls2=Class.forName("java.lang.Object00");
		
	}
}
