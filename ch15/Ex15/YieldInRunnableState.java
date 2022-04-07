package ch15.Ex15;

//Thread.yield(): 스레드 실행상태(RUNNABLE)에 있는 특정 스레드에게 자신의 스레드 순서를 일시 양보
//실행 상태 내부에서 다른 스레드를 먼저 실행하도록 양보
//동기화에서 key를 서로 점유하는 현상이 발행되는데 키를 양보해서 균등하게 처리하도록할 때 사용.

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while (true) {//무한루프
			if (yieldFlag) { //yieldFlag가 True일 때 스레드를 양보함
				Thread.yield(); //thread 양보함
			} else { //yieldFlag가 false일때 스레드 정보를 출력
				System.out.println(getName()+"실행");
				for (long i = 0; i < 100000000L; i++) {} //0.5초 시간 지연
			}
		}
	}
}

public class YieldInRunnableState {

	public static void main(String[] args) {
		MyThread thread1=new MyThread();
		thread1.setName("thread1");
		thread1.yieldFlag=false; //false일 때 스레드 정보 출력
		thread1.setDaemon(true); //마지막 스레드가 종료될 때 종료   무한루프 탈출을 위해
		thread1.start();
		
		MyThread thread2=new MyThread();
		thread2.setName("thread2");
		thread2.yieldFlag=true; //false일 때 스레드 정보 출력
		thread2.setDaemon(true);
		thread2.start();
		
		//스레드 6초 지연(1초마다 한번씩 양보)
		for (int i = 0; i < 6; i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {} //0.0 1초 지연
			thread1.yieldFlag=!thread1.yieldFlag; //참일 때는 거짓을 저장. 거짓일 때는 참을 저장
			thread2.yieldFlag=!thread2.yieldFlag;
		}
		
		
	}

}
