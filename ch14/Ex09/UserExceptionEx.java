package ch14.Ex09;

class A{
	//private : 캡슐화, 객체 생성 후 바로 접근하지 못하도록 설정
		//생성자, setter 를 사용해서 필드에 값을 할당할 수 있음
	
	private String season; //봄, 여름, 가을, 겨울 (이외의 값은 예외 "예외 발생 : 봄, 여름, 가을, 겨울만 입력하세요)
	private String week; //월, 화, 수, 목, 금, 토, 일(이외의 값은 예외  "예외 발생 : 월, 화, 수, 목, 금, 토, 일 만 입력하세요)
	private int scoreKor; //0~100 값만 입력( "예외 밯생 : 0~100까지 정수만 입력하세요)
	private int scoreEng; //0~100 값만 입력( "예외 밯생 : 0~100까지 정수만 입력하세요)
	private String userID;//12자 이상 20 이하의 문자 또는 숫자 (예외 발생: 12자 이상 20 이하의 문자 또는 숫자만 입력하세요)
	
	void checkSeason(String season) throws StringMissException{
		if ((season.equals("봄")||season.equals("여름")||season.equals("가을")||season.equals("겨울"))==false) {
			throw new StringMissException("예외 발생 :  봄, 여름, 가을, 겨울만 입력하세요");
		}
		else {
			this.season=season;
			System.out.println("계절은 : "+this.season);
		}
	}
	void checkWeek(String week) throws StringMissException{
		if ((week.equals("월")||week.equals("화")||week.equals("수")||week.equals("목")||week.equals("금")||week.equals("토")||week.equals("일"))==false) {
			throw new StringMissException("예외 발생 : 월, 화, 수, 목, 금, 토, 일만 입력하세요");
		}else {
			this.week=week;
			System.out.println("요일은 : "+this.week);
		}
	}
	void checkScoreKor(int scoreKor) throws OverException{
		if (scoreKor>100||scoreKor<0) {
			throw new OverException("예외 밯생 : 0 ~ 100 까지 정수만 입력하세요");
		}else {
			this.scoreKor=scoreKor;
			System.out.println("국어 점수는 : "+this.scoreKor);
		}
	}
	void checkScoreEng(int scoreEng) throws OverException{
		if (scoreEng>100||scoreEng<0) {
			throw new OverException("예외 밯생 : 0 ~ 100 까지 정수만 입력하세요");
		}else {
			this.scoreEng=scoreEng;
			System.out.println("영어 점수는 : "+this.scoreEng);
		}
	}
	void checkUserID(String userID) throws StringMissException{
		if (userID.length()<12||userID.length()>20) {
			throw new StringMissException("예외 발생: 12자 이상 20 이하의 문자 또는 숫자만 입력하세요");
		} else {
			this.userID= userID;
			System.out.println("userID : "+this.userID);
		}
	}
	
}

class StringMissException extends Exception{
	public StringMissException() {
		super();
	}
	public StringMissException(String message) {
		super(message);
	}
}
class OverException extends Exception{ 
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}
public class UserExceptionEx {
	public static void main(String[] args) {
		A a=new A();
		try {
			a.checkSeason("봄");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkSeason("갈갈");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkWeek("월");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkScoreKor(-200);
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkScoreEng(22);
		} catch (OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			a.checkUserID("abcdefg123456");
		} catch (StringMissException e) {
			System.out.println(e.getMessage());
		}
	}
}
