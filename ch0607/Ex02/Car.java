package ch0607.Ex02;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) { //ram에 값을 부여할 때 setter 사용
		this.company = company; //this: 자신의 객체
	}
	public String getModel() { ////메소드에 인풋되는 변수명, 인풋된 변수를 받는 변수명, 메모리에 로드할 변수명(this.)
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		//model=mo; //인자(String mo)와 필드의 이름이 다를 때 this 생략 가능
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
