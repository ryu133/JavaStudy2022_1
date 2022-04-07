package ch0607.Ex03;

class Car{
	String company; //필드(인스턴스 필드)의 company를 알려주는 this. heap 메모리에 저장
	String model; //인스턴스: 객체화 했을 때 사용 가능한 필드
	String color; //필드명과 필드값은 힙 영역에 저장
	double maxSpeed;
	Car(){} //기본 생성자
	Car(String company, String model, String color,double maxSpeed){
		this.company=company; //this는 객체의 필드의 변수를 뜻함
		this.model=model; //3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역할
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	void work() { //메소드(인스턴스 메소드): 메소드명과 포인터를 힙 영역에 저장
				//메소드의 전체 구문은 클래스 영역의 메소드 영역에 저장
		System.out.println("회사: "+company+", 모델: "+model+", 색: "+color+", 최대속력: "+maxSpeed);
	}
}
public class Q1 {

	public static void main(String[] args) {
		//생성자를 통해서 기본값을 할당 후 메모리의 내용을 work() 메소드를 사용해서 출력
		Car c1=new Car("A","a","blue",200);
		c1.work();
		Car c2=new Car();
		c2.work();
		
		
	}

}
