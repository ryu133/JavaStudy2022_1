package ch15.Ex14;
//스레드 상태
//1 New			:스레드 객체 생성 후 .start() 메소드가 호출되기 전 상태
//2 Runnable	:.start()메소드가 호출되면 run() 메소드 내부의 코드가 cpu에서 실행되고있는 상태
//3 Terminated	:run()의 모든 코드가 실행되면 스레드 종료
//4 Timed_waiting: 특정 시간동안만 대기상태 thread.sleep()  특정 시간이 종료되면 실행상태로 바뀜. 인터럽트(깨우기)가 발생되면 예외를 발생시키고 실행상태로 바뀜
					//a.join(1000) 현재 자신의 스레드는 1초 대기상태, a 객체를 실행상태로 먼저 바꿈
//5 Blocked		:동기화 처리에서 LOCK이 걸려서 접근이 잠시 차단된 상태, 다른 스레드가 키를 반납한 경우 키를 획득해서 실행 상태로 변할수잇다
//6 Waiting		:무한정 대기 상태. 깨워야 실행으로 변함. 다른 스레드가 깨워야함 
public class NewRunnableTerminated {
	public static void main(String[] args) {
		
		Thread.State state; //스레드의 상태를 저장하는 클래스(6 종류)
		//state 변수에는 6가지 상수만 들어감 
		
		//1 객체 생성 - 익명 내부 클래스 생성
		//new: 스레드 객체 생성 후 start() 호출되기 전까지의 상태
		Thread myThread=new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 1000000000L; i++) {} //0.5초 지연 (cpu마다 상이함)
				//객체 생성 시 약간의 시간이 필요
				//메모리의 할당시간이 필요
			}
		};
		state =myThread.getState(); //스레드의 상태를 가지고 와서 state 변수에 할당
		System.out.println("myThread state: "+state); //NEW
		
		//2 myThread 시작
		myThread.start(); //스레드를 시작 시 cpu에서 실행
		state=myThread.getState();
		System.out.println("myThread state: "+state); //RUNNABLE
		
		//3 스레드 종료
//		myThread.join(); 내 스레드(메인)는 대기하고 mythread를 처리하게 함 
		try {myThread.join();} catch (InterruptedException e) {}
		state=myThread.getState();
		System.out.println("myThread state: "+state);
		
		
		
		
	}
}
