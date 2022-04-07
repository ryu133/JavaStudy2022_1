package ch15.Ex16;
//Thread.sleep(1000) ==> TimedWaiting 상태로 이동 ==> 특정 시간(1초)이 경과되면 Runnable 상태로 이동됨
															//	==> 인터럽트가 발생되면 예외를 발생시키고 Runnable 상태가 됨
//인스턴스명(객체명).join(1000); ==> TimedWaiting 상태로 이동 ==> 특정 시간(1초)이 경과되면 Runnable 상태로 이동됨
//a.join(1000); : 자신의 스레드는 1초를 기다리고 a 객체에게 cpu를 할당(Runnable), 1초 뒤에는 자신의 스레드도 활성화
//참고) a.join(); ==>Waiting 상태로 이동 ==> 
// 자신의 스레드는 잠시 멈추고(Waiting) a 객체에게 cpu를 (runnable)사용하도록 할당, a 객체가 모두 완료되면 자신의 스레드가 Runnable 상태가됨

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(3000); //3초 동안 TimedWaiting 상태로 이동, 3초 후에는 Runnable 상태로 이동
								//Interrupt 발생 시 예외를 발생시키고 Runnable 상태로 이동
		} catch (InterruptedException e) {
			System.out.println("---sleep() 진행 중 Interrupt 발생---");
			for (long i = 0; i < 100000000L; i++) { }//시간지연 0.5초
		}
		
	}
}



public class TimedWaitingSleep {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start(); //Runnable 상태
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}//스레드 시작 준비 시간
		System.out.println("MyThread State1: "+myThread.getState()); //TimedWaiting
		
		//3초 이전에 interrupt(시간종료) 강제 발생
		myThread.interrupt(); //TimedWaiting
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State2: "+myThread.getState());
		
	}
}
