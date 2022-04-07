package ch13.Ex10.Ex1;

class A{
	B b; //B: 인터페이스 타입, b: 참조변수 (값을 할당하는 방법)
			//b:null
	//1 객체 생성 후 값을 할당
	//2 생성자를 통해서 값을 할당
	//3 setter를 통해서 값을 할당
	
	A(){}
	A(B b){
		this.b=b;
	}
	
	public void setB(B b) {
		this.b=b;
	}
	
	interface B{
		void play();
		void stop();
	}
	void abc() { //play(), stop() 재정의
		b.play();
		b.stop();
	}
}
public class InnerInterface1_1 {
	public static void main(String[] args) {
		A a=new A();
		a.setB(new A.B() {
			
			@Override
			public void stop() {
				System.out.println("stop");
			}
			
			@Override
			public void play() {
				System.out.println("play");
			}
		});
	
		a.abc();
		
		System.out.println("==============");
		//1 객체 생성 후 필드의 값 할당
		A a1=new A();
		
		a1.b=(A.B)new A.B(){
			@Override
			public void play() {System.out.println("짹짹");}
			@Override
			public void stop() {System.out.println("새는 하늘을 납니다.");}
		}; //인터페이스 : A.B
		a1.abc();
		
		System.out.println("===============");
		
		//2 생성자를 이용해서 값을 할당
		A a2=new A(
				new A.B() {
					@Override
					public void stop() {
						System.out.println("어흥");
					}
					@Override
					public void play() {
						System.out.println("어흥 플레이");
					}
				}); //생성자 내부에 A.B타입의 객체 생성 후 주입
		a2.abc();
				
		//3 setter를 통해서 값을 할당		
		A a3=new A();
		a3.setB(new A.B() {
			@Override
			public void stop() {
				System.out.println("stop3");
			}
			@Override
			public void play() {
				System.out.println("play3");
			}
		});
		
		
	}
}
