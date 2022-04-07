package ch16.Ex01;

//객체를 담을 클래스를 만들 경우 매번 객체를 생성할 때마다 그 객체를 담을 클래스를 생성해야함

class Apple{
	String name;
	int price;
	Apple(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() { //객체 자체를 출력시 객체의 주소 대신 필드의 정보를 출력하게 설정
		return "이름: "+name+", 가격: "+price;
	}
}
//apple 클래스를 사용할 클래스 생성
class Goods1{
	private Apple apple=new Apple("사과1" , 5000);
	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple=apple;
	}
}

class Pancil{
	String name;
	int price;
	Pancil(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "이름: "+name+", 가격: "+price;
	}
}

//pancil을 사용할 클래스 생성
class Goods2{
	private Pancil pancil=new Pancil("연필1", 2000);

	public Pancil getPancil() {
		return pancil;
	}

	public void setPancil(Pancil pancil) {
		this.pancil = pancil;
	}
	
}

public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
	
		Goods1 goods1=new Goods1();
		goods1.setApple(new Apple("apple2", 4000) );
		System.out.println(goods1.getApple());
		
		
		Goods2 goods2=new Goods2();
		goods2.setPancil(new Pancil("연필2", 4000));
		System.out.println(goods2.getPancil());
		
	}	
}
