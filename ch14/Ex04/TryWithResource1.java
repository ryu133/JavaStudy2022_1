package ch14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource1 {
	public static void main(String[] args) {
		//수동 리소스 해제(기존 프로그램 사용) 코드가 길다
		System.out.println("문자를 입력하세요");
//		InputStreamReader isr2=null;//scanner와 비슷. 사용 후 반드시 메모리에서 객체를 삭제해야함 >> isr2.close()
//		//system.in: 콘솔에서 입력 받도록 처리. 1번만 인풋받을 수 있음(객체가 종료되면 다시 인풋받지 못함)
//		
//		try {
//			isr2=new InputStreamReader(System.in);
//			char input=(char)isr2.read(); //일반예외(checked 에외): IOException: 
//			System.out.println("입력글자= "+input);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			//리소스 해제: isr2.close()
//			if (isr2 != null) {
//				try { //리소스 해제
//					isr2.close(); //일반예외: IOExeption (try catch 필요)
//				} catch (IOException e) {					
//					e.printStackTrace();
//				} 
//			}
//		}
		
		//자동 리소스 해제(java 1.7) 코드가 간결함, 필요 조건 있음
		//사용하는 객체가 AutoCloseable 인터페이스를 구현하는 객체여야 함 & 반드시 객체 내부에 close()가 반드시 존재해야 함
		//try(자동 리소스 해제가 필요한 객체 생성){} catch{} finally{}
		
		//InputStreamReader는 AutoCloseable 인터페이스를 구현함. close() 갖고있음
		//try with resource: try(with resource: 객체 메모리 로드){}
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input=(char)isr1.read();
			System.out.println("입력 글자= "+input);
		}catch (IOException e) {
			e.printStackTrace();
		}//finally {} 을 생략해도 객체를 자동으로 isr1.close()할 수 있음
		
	}
}
