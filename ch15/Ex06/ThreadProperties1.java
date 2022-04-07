package ch15.Ex06;

public class ThreadProperties1 {
	public static void main(String[] args) {
		//1 객체 가져오기 (currentThread()) / 쓰레드 수 (activeCount())
		Thread curThread = Thread.currentThread(); //현재 스레드(main)
		//클래스(데이터 타입) 참조변수 = 클래스명.메소드명
		System.out.println("현재 스레드의 이름 = " + curThread.getName());
		System.out.println("동작하는 스레스 수 = " + Thread.activeCount());
		
		//2 스레드 이름 지정 (자동지정) - JVM이 스레드 이름을 자동 할당( Thread-0 ~ Thread-n)
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName()); //스레드 이름 출력
			thread.start();
		}
		
		//3 스레드 이름 직접 지정 : 객체명.setName()
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			thread.setName(i+" 번째 스레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		
		//4 스레드 이름 지정 (자동지정)
		for(int i=0; i<10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}		
		
		//5 스레드 수 
		System.out.println("동작하는 스레드 수 = " + Thread.activeCount());
		
		
		
	}
}
