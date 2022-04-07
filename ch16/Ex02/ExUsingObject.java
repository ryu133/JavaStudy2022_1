package ch16.Ex02;
//Objcet를 사용해서 4개의 객체를 저장하고 출려하기

class Student{
	String name;
	String id;
	int pass;
	Student(String name,String id,int pass){
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	@Override
	public String toString() {
		return "이름: "+name+", id: "+id+", pass: "+pass;
	}
}
class Professor{
	String name;
	int year;
	String email;
	Professor(String name,int year, String email){
		this.name=name;
		this.year=year;
		this.email=email;
	}
	@Override
	public String toString() {
		return "이름: "+name+", year: "+year+", email: "+email;
	}
}
class Tiger{
	String name;
	String run;
	Tiger(String name,String run){
		this.name=name;
		this.run=run;
	}
	@Override
	public String toString() {
		return "이름: "+name+", run: "+run;
	}
}
class Banana{
	String name;
	String color;
	int price;
	Banana(String name,String color,int price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString() {
		return "이름: "+name+", color: "+color+", price: "+price;
	}
}
class Goods{
	private Object object=new Object();

	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class ExUsingObject {
	public static void main(String[] args) {
		Goods s1=new Goods();
		s1.setObject(new Student("s1", "1",12));
		System.out.println((Student)s1.getObject());
		
		Goods p1=new Goods();
		p1.setObject(new Professor("p1",34,"2"));
		System.out.println((Professor)p1.getObject());
		
		Goods t1=new Goods();
		t1.setObject(new Tiger("t1","yes"));
		System.out.println((Tiger)t1.getObject());
		
		Goods b1=new Goods();
		b1.setObject(new Banana("b1","3",56));
		System.out.println((Banana)b1.getObject());
		
	}
}
