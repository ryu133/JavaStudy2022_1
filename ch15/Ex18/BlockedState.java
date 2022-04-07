package ch15.Ex18;

//blocked 상태: 동기화 메소드나 동기화 블록에서 한 스레드가 키를 점유해서 대기 상태인 스레드 

class MyBlockTest{
	//공유 객체(동기화 메ㅔ소드, 동기화 블록에서 처리하기 때문에 필요함)
	MyClass mc=new MyClass();
	//세 개의 스레드 필드 생성
	Thread t1=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t2=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	Thread t3=new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		}
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	
	class MyClass{
		synchronized void syncMethod() { //동기화 메소드 : 키를 가진 스레드만 접근 가능
			try {Thread.sleep(100);} catch (InterruptedException e) {} //스레드 준비시간 0.1초
			System.out.println("==="+Thread.currentThread().getName()+"====");
			System.out.println("thread1 -> "+t1.getState());
			System.out.println("thread1 -> "+t2.getState());
			System.out.println("thread1 -> "+t3.getState());
			
		}
	}
}

public class BlockedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest();
		mbt.startAll();	
	}
}
