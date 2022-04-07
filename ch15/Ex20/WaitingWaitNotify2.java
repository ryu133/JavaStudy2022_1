package ch15.Ex20;

class DataBox {
	boolean isEmpty=true;
	int data;
	synchronized void inputData(int data) { //동기화 메소드
		if (!isEmpty) { //false일 때  
			try {
				wait(); //동기화 블록이나 동기화 메소드에서 WAITING 상태로 전환
						//wait(i); //t2 스레드가 처리하도록 잠시 대기 
			} catch (InterruptedException e) {}
		}
		isEmpty=false; //data 필드에 값을 넣고 자신은 t2가 값을 읽을 수 있도록 false로 설정 
		this.data = data;
		System.out.println("입력데이터 : "+data); //매개변수 값으로 들어온 데이터
		notify();
	}
	synchronized void outputData() { //동기화 메소드
		if (isEmpty) { //true일 때  
			try {wait();} catch (InterruptedException e) {} //WAITING 상태로 전환
			}
		isEmpty=true;
		System.out.println("출력데이터 : "+data); //data: 메모리의 data , this 생략됨
		notify(); //inputData() 메소드의 wait()된 스레드를 깨워준다
	}
}

public class WaitingWaitNotify2 {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		//첫번째 스레드 : 공유 객체에 값을 넣는 스레드
		Thread t1 = new Thread() { //익명 내부클래스
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.inputData(i);
				}
			};
		};
		
		//두번째 스레드 : 공유 객체로부터 값을 읽어오는 메소드
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1; i<9; i++) {
					dataBox.outputData();
				}
			};
		};
		
		t1.start();
		t2.start();
	}
}