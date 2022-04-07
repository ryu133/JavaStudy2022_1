package ch0607.Ex02;

class Abc{
	int m=3; //필드(힙에 저장), 객체화 시켰을 때 사용 가능
	int n=4;
	
	void work1() { //메소드(인풋값이 없는 메소드)
		int k=5; //지역변수(스택영역에 저장). 메소드가 종료시 없어진다.
		System.out.println(k);
		work2(3); //다른 메소드 호출
	}
	void work2(int i){
		int j=4; //지역변수 스댁공간에 변수와 값이 저장
		System.out.println(i+j);
	}
}
public class FieldComponent {
	public static void main(String[] args) {
		//클래스를 활용해서 객체(abc) 생성
		Abc abc=new Abc(); //abc 객체 생성
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		abc.work1();
		
		
	}

}
