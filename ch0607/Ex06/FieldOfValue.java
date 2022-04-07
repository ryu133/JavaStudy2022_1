package ch0607.Ex06;

//객체의 필드에 값을 할당하는 방식
//1. 필드에 직접 값을 부여하는 방식 <- 객체를 생성 후 
//2. setter를 통해서 객체의 필드에 값을 부여 <- 객체를 생성 후 
//3. 생성자를 통해서 객체의 필드 값을 부여 <- 객체를 생성할 때 초기값으로 할당 

class Aa{ //1. 객체 생성 후 직접 필드에 값 할당
	String name; //이름
	int age; //나이
	String mail; //메일주소
	
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
class Bb{ //2. setter를 통해서 객체의 필드에 값을 할당
	String name; //이름
	int age; //나이
	String mail; //메일주소
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
class Cc{ //3. 생성자를 통해서 객체의 필드의 값을 할당
	String name; //이름
	int age; //나이
	String mail; //메일주소
	
	Cc(String name,int age, String mail){
		this.name=name;
		this.age=age;
		this.mail=mail;
	}
	
	void print() {
		System.out.println("name: "+name+" age: "+age+" mail: "+mail);
	}
}
public class FieldOfValue {
	public static void main(String[] args) {
		Aa aa=new Aa();

		aa.name="가가";
		aa.age=10;
		aa.mail="aa@aaa.com";
		aa.print();
		
		Bb bb=new Bb();
		bb.setName("나나");
		bb.setAge(20);
		bb.setMail("bb@bbb.com");
		bb.print();
		
		Cc cc=new Cc("다다",30,"cc@ccc.com");
		cc.print();
		
		
		
	}
}
