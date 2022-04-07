package ch14.Ex08;
// 1 Exception을 상속받는 사용자 예외 - 일반예외
//  1-1 점수가 음수인 경우 예외
//  1-2 점수가 100점을 초과하는 경우 예외

class MinusException extends Exception{ //음수가 들어올 경우 강제 발생
	public MinusException(){
		super(); //상위의 생성자 호출
	}
	public MinusException(String message) { //예외 메세지 출력.    e.getMessage();
		super(message);
	}
}

class OverException extends Exception{ //100이상의 값이 들어오면 호출
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
class AAA{
	int score;
	void checkScore(int score) throws MinusException, OverException {
		if (score<0) {
			throw new MinusException("예외 발생 : 음수는 넣을 수 없습니다.");
		} else if (score>100) {
			throw new OverException("예외 발생 : 100이 넘는 수는 넣을 수 없습니다.");
		} else {
			System.out.println("정상적으로 입력되었습니다.");
			this.score=score;
			System.out.println("점수는 : "+this.score);
		}
	}
}

public class UserException {
	public static void main(String[] args) {
		AAA aaa=new AAA();
		
		try {
			aaa.checkScore(-100);
		} catch (MinusException | OverException e) {
//			e.printStackTrace(); //시스템 에러 문구로 나옴
			System.out.println(e.getMessage()); //sysout에서 e.message를 출력 가능
		}
		
		try {
			aaa.checkScore(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage()); //sysout에서 e.message를 출력 가능
		}
		
		try {
			aaa.checkScore(80);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
