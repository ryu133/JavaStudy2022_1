package ch0607.Ex05;

public class C { //다른 패키지에서 import 가능
	//필드에 부여되는 접근 제어자
	private String company="현대자동차";
	String model;
	protected String color;
	public int maxSpeed;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) { //public 외부 패키지의 클래스에서 접근 가능
		this.model = model;
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

	public void print() {
		System.out.println("company: "+company+" model: "+model+" color: "+color+" maxSpeed: "+maxSpeed);
	}

}
