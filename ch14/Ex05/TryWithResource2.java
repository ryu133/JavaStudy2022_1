package ch14.Ex05;
//직접 생성한 객체에서 autocloseable 사용
//try(객체 생성 구문){} catch{} >> 자동으로 close()됨 //try(with resource(메모리))
//autocloseable 인터페이스의 close()메소드를 오버라이딩해야함

//java.lang.AutoCloseable: java.lang << 임포트할 필요 없음
//java.lang.Object

//예외 처리 방법
//1 try catch 사용: 자신이 직접 예외를 처리
//2 throws 사용: 예외를 다른(호출) 곳에서 처리하도록 미룸(메소드 예외 전가)
		//throw: 예외 강제 발생
		//throws: 예외 처리 미루기

class A implements AutoCloseable{
	String resource; //resource=null
	A(String resource){//생성자의 매개변수로 String 값을 받아서 메모리로 로딩
		this.resource=resource;
	}
	@Override
	public void close() throws Exception { //close() 자동 호출됨
		System.out.println(resource);
		if (resource!=null) {
			resource=null;
			System.out.println("resource 해제");
			System.out.println(resource);
		}
	}
}

public class TryWithResource2 {
	public static void main(String[] args) {
		//자동 리소스 해제 사용
		try (A a1=new A("특정 파일");){
			
		} catch (Exception e) {
			System.out.println("예외 발생");
		}//finally{} a1.close() 자동 호출됨
		
		System.out.println("==============");
		
		//수동 리소스 해제 사용
		A a2=null;
		try {
			a2=new A("생성자 초기값 할당");
		} catch (Exception e) {
			
		} finally {
			if (a2.resource !=null) {
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
