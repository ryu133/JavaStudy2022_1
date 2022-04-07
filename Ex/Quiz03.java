package Ex;

class Student{
	//java는 다중 상속 불가, 자바의 모든 클래스는 object 클래스의 자식 클래스이다.
	//object 클래스에서 정의한 필드나 메소드를 재사용(오버라이딩)할 수 있다.
	String name;
	int studentID; //학번
	int kor; //국어점수
	int eng; //영어점수
	int math;//수학점수
	int sum=0; //점수합계
	double avg=0; //평균
	
	void hobby() {
		System.out.println("각 학생의 취미 입니다.");
	}

	@Override
	public String toString() { //object clasas의 메소드. 객체 자체를 출력할 때 [패키지명.클래스명@해시코드]
		return "이름 : "+name+", 학번 : "+studentID+", 국어 : "+kor+", 영어 : "+eng+", 수학 : "+math+", 합계 : "+sum+", 평균 : "+avg;
	}
	
}
class S철수 extends Student{
	S철수(String name,int studentID,int kor,int eng,int math){ //생성자: 클래스명과 동일, 리턴타입 없음
		super.name=name; //super 부모 클래스
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3; //double 로 캐스팅 필요
	}
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
		
	}
}
class S영희 extends Student{
	S영희(String name,int studentID,int kor,int eng,int math){
		super.name=name;
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("영희의 취미는 운동입니다.");
	}
	
}
class S영식 extends Student{
	S영식(String name,int studentID,int kor,int eng,int math){
		super.name=name;
		super.studentID=studentID;
		super.kor=kor;
		super.eng=eng;
		super.math=math;
		super.sum=kor+eng+math;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("영식의 취미는 요리입니다.");
	}
}
public class Quiz03 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.hobby();
		Student cs=new S철수("aa", 1111, 80, 90, 85);
//		System.out.println(cs);
//		cs.hobby();
		Student yh=new S영희("bb", 2222, 90, 95, 88);
//		System.out.println(yh);
//		yh.hobby();
		Student ys=new S영식("cc", 3333, 68, 70, 85);
//		System.out.println(ys);
//		ys.hobby();
		
		
		Student[] arr= {cs,yh,ys};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].hobby();
		}
		for (Student k : arr) { //데이터 타입  객체 변수 : 배열
			System.out.println(k);
			k.hobby();
		}
	
	}
	
}
