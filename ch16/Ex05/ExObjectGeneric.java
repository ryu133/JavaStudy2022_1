package ch16.Ex05;

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
class Goods3<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class ExObjectGeneric {
	public static void main(String[] args) {
		Goods3<Student> s1=new Goods3();
		s1.setT(new Student("s1", "a1b2", 1111));
		System.out.println(s1.getT());
		
		Goods3<Professor> p1=new Goods3();
		p1.setT(new Professor("p1", 2, "c3d4@abc.com"));
		System.out.println(p1.getT());
		
		Goods3<Tiger> t1=new Goods3();
		t1.setT(new Tiger("t1", "yes"));
		System.out.println(t1.getT());
		
		Goods3<Banana> b1=new Goods3();
		b1.setT(new Banana("b1", "yellow", 3333));
		System.out.println(b1.getT());
		
		
	}
}
