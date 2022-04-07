package ch15.Ex19;

//Waiting 
	//a.join(): 자신의 스레드는 waiting 상태이고 a 객체에게 cpu 할당(runnable)
		//a 객체가 실행이 완료되면 자신의 스레드가 활성화됨(runnable)
		//자신의 스레드가 처리할 내용이 다른 스레드의 결과를 받아서 처리해야할 경우에 사용
	//wait(), notify(), notifyAll() <== 동기화 블록에서만 사용됨
	//wait(): 동기화 블록 내에서 wait() 메소드를 만나면 waiting 상태가 됨
	//notify()&notifyAll(): wait() 메소드를 깨워줌 (반드시 다른 스레드에서 깨워줄 수 있음)
	//

class DataBox {
	int data;
	synchronized void inputData(int data) { //동기화 메소드
		this.data = data;
		System.out.println("입력데이터 : "+data);
	}
	synchronized void outputData() { //동기화 메소드
		System.out.println("출력데이터 : "+data);
	}
}

public class WaitingWaitNotify1 {
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
