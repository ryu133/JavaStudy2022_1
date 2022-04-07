package ch15.Ex07;

//일반 스레드 : setDeamon(false) default off: 마지막 스레드가 종료되더라도 자신의 일을 모두 마치고 종료한다

//데몬 스레드: setDeamon(true) , 스레드를 start할 때 수정이나 변경 불가
//마지막 스레드가 종료되는 시점에 종료됨. 다른 스레드의 작업을 돕는 보조 역할의 스레드
//종료시점(마지막 일반스레드가 종료될 때) 외에는 일반 스레드와 동일함
//가비지 컬렉터(메모리의 사용되지 않는 객체를 가비지 컬렉터가 자동으로 객체를 제거)
//-프로세서가 종료시점에 자동 저장, 화면 자동 갱신
//-무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족하면 작업을 수행하고 다시 대기상태로 들어감



class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" : "+(isDaemon()?"데몬스레드":"일반스레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName()+" : "+i+"초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {	}
		}
		
	}
}

public class ThreadProperties3 {
	public static void main(String[] args) {
		//일반 쓰레드
		Thread thread1=new MyThread();
		thread1.setDaemon(false);//디포트
		thread1.setName("thread1");
		thread1.start();
		
		//데몬 스레드: 마지막 스레드가 종료되는 시점에 종료
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);//데몬쓰레드로 설정
		thread2.setName("thread2");
		thread2.start();
		
		//# 3.5초 후 main Thread 종료
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("main Thread 종료");
		
	}
}
