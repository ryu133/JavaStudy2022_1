package ch14.Ex08;
//1 ID의 값을 넣지 않을 경우(null) Exception 발생
//2 UserID가 8자 이상 20자 이하가 아닌 경우 Exception 발생

//-일반 예외 생성-
class IDFormatException extends Exception{
	public IDFormatException() {
		super();
	}
	public IDFormatException(String message) { //예외 발생 시ㅣ 예외 메세지 출력
		super(message);
	}
}


public class IDFormatTest {
	private String userID; //체크해서 null이나 8자 이하거나 20자 이상인 경우 Exception
	//userID는 캡슐화됨  private: 다른 클래스에서 접근 불가
	//생성자, setter를 통새 값을 할당할 수 있음
	
	public String getUserID() { //getter   메소드 호출 시 메모리의 userID를 넘겨줌
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException { //setter   메모리의 값을 할당
		if (userID==null) {
			throw new IDFormatException("아이디는 비울 수 없습니다.");
		}else if (userID.length()<8||userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 입력해주세요.");
		}else {
			System.out.println("정상 입력됨");
		}
		
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test=new IDFormatTest();
		//userID가 null인 경우
		String userID=null;
		try {
			test.setUserID(userID); //setter 호출 시 null값을 입력 후 호출
			
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID가 8자 미만인 경우
		userID="1234567";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID가 8자 이상, 20자 이하인 경우
		userID="abcd12345678";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===============");
		
		//userID가 20자 초과인 경우
		userID="1234567890abcdefghijklmnop";
		try {
			test.setUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(test.getUserID());
		
		
	}
}
