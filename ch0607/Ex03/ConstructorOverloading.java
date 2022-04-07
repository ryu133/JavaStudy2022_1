package ch0607.Ex03;
//생성자 오버로딩: 하나의 생성자명에 여러 데이터 타입과 개수에 따라 다른 생성자가 호출됨
//주의! 데이터 타입과 매개변수의 수가 모두 같은 생성자를 만드려고할 경우 오류 발생
class Abc{
	int a,b,c;
	String d;
	
	Abc(){System.out.println(a+", "+b+", "+c);} //기본 생성자
	Abc(int a){ //매개변수가 1개인 생성자
		this.a=a;
		System.out.println(a);
	}
	Abc(int a,int b){//매개변수가 2개인 생성자
		this.a=a;
		this.b=b;
		System.out.println(a+", "+b);
	}
	Abc(int a,int b,int c){//매개변수가 3개인 생성자
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println(a+", "+b+", "+c);
	}
	Abc(String d){
		this.d=d;
		System.out.println(d);
	}
	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		
		Abc abc=new Abc(); //기본 생성자 호출
		Abc abc1=new Abc(1);
		Abc abc2=new Abc(2,3);
		Abc abc3=new Abc(4,5,6);
		Abc abc4=new Abc("aaa"); //매개변수의 값이 같더라도 타입이 다르면 해당 메소드를 호출
		
		
		
	}
}
