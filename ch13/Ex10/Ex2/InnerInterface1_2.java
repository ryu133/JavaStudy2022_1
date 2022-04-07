package ch13.Ex10.Ex2;

import ch13.Ex10.Ex2.Abc.Def;

class Abc{ //1 객체 생성 후 직접 값 할당 2 생성자를 통해서 값 할당 3 setter를 통해서 값 할당
	Def d;
	
	Abc(){}
	Abc(Def d){
		this.d=d;
	}
	void setDef(Def d) {
		this.d=d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
	}
}
public class InnerInterface1_2 {
	public static void main(String[] args) {
		Abc d1=new Abc();
		d1.d=(Abc.Def)new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("run1");
			}
			
			@Override
			public void fly() {
				System.out.println("fly1");
			}
		};
		d1.ghi();
		
		Abc d2=new Abc(
				new Abc.Def() { 
					@Override
					public void run() {
						System.out.println("run2");
					}
					@Override
					public void fly() {
						System.out.println("fly2");
					}
					
				});
		d2.ghi();
		
		Abc d3=new Abc();
		d3.setDef(new Def() {
			@Override
			public void run() {
				System.out.println("run3");
			}
			@Override
			public void fly() {
				System.out.println("fly3");
			}
		});
		d3.ghi();
		
		
		
	}
}
