package ch15.Ex17;

//a.join(1000) : a 객체에게 cpu를 할당하고 자신은 TimedWaiting 상태로 대기
class MyThread1 extends Thread{
	@Override
	public void run() {
		for (long i = 0; i < 100000000L; i++) { } //시간 지연 0.5초
		for (long i = 0; i < 100000000L; i++) { } //시간 지연 0.5초
		for (long i = 0; i < 100000000L; i++) { } //시간 지연 0.5초
		
		
	}
}
class MyThread2 extends Thread{
	MyThread1 myThread1; //클래스타입  참조변수;
	public MyThread2(MyThread1 myThread1) { //생성자를 통해서 참조변수에 값 할당
		this.myThread1=myThread1;
	}
	@Override
	public void run() {
		try{
			myThread1.join(3000); //MyThread2는 3초 대기하고 mythread1에게 cpu 할당
		}catch (InterruptedException e) {
			System.out.println("---join() 진행 중 interrupt 발생---");
			for (long i = 0; i < 100000000L; i++) {}
		}
	}
	
	
}


public class TimedWaitingJoin {
	public static void main(String[] args) {
		//객체 생성
		MyThread1 myThread1=new MyThread1();
		MyThread2 myThread2=new MyThread2(myThread1);
		myThread1.start();
		myThread2.start();
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} //스레드 시작 준비 시간 0.1초
		System.out.println("MyThread State1: "+myThread1.getState());
		System.out.println("MyThread State2: "+myThread2.getState());
		
		myThread2.interrupt(); //3초 전에 인터럽트가 발생되면 예외를 발생시키고 runnable로 이동함
		try {Thread.sleep(1);} catch (InterruptedException e) {} //스레드 시작 준비 시간 0.1초
		System.out.println("MyThread State1: "+myThread1.getState());
		System.out.println("MyThread State2: "+myThread2.getState());
	}
}
