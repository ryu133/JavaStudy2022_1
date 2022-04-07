package ch15.Ex12;
class A{}
class B{}
class C{}
class MyData{
	//동기화된 메소드는 key값이 모두 this가 자동으로 등록됨, 수정 불가
	//동기화 메소드는 key값을 넣을 수 없다
	//하나의 스레드가 접근할 때 key를 가지고 동기화된 메소드 접근 가능
	//key는 객체를 키로 사용할 수 있다
	//동기화 블록은 key값을 임의로 할당 가능하다
	synchronized void abc() { //여러 스레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
				try {Thread.sleep(10);} catch (InterruptedException e) {} 
				for (int i = 0; i < 3; i++) {
				System.out.println(i+" sec");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} //1초 지연
		}
	}
	synchronized void bcd() { //여러 스레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		try {Thread.sleep(20);} catch (InterruptedException e) {} 
		for (int i = 0; i < 3; i++) {
			System.out.println(i+" 초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {} //1초 지연
		}
	}
	void cde() { //여러 스레드가 접근할 때 동시성 문제를 방지하기 위해서 동기화 처리
		synchronized (new Object()) { //별도의 키 생성: 임의의 키,스레드가 접근하는 키,객체 생성
			try {Thread.sleep(30);} catch (InterruptedException e) {} 
			for (int i = 0; i < 3; i++) {
				System.out.println(i+" 번째");
				try {Thread.sleep(1000);} catch (InterruptedException e) {} //1초 지연
			}
			
		}
	}
}


public class KeyObject2 {
	public static void main(String[] args) {
		MyData myData=new MyData(); //공유객체: 여러 스레드가 공유 객체에 접근
		
		
		//3개의 스레드가 각각의 메소드 호출
		new Thread() { //익명클래스: 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() { //익명클래스: 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() { //익명클래스: 스레드 클래스를 구현하는 자식 익명 클래스
			public void run() {
				myData.cde();
			};
		}.start();
	}
}
