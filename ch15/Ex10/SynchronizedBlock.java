package ch15.Ex10;

//동기화: 여러 스레드가 공유된 필드에 접근할 때 하나의 스레드 작업 시 다른 스레드가 접근하지 못하도록 함
//1 메소드 동기화: 메소드 안에 synchronized(this){}
//2 블락 동기화
//블락 동기화: <<메소드 내부의 일부분만 동기화함>>
	//-구문 형식: synchronized(this or 임의의 객체){}

class A{}
class B{}
class C{}

class MyData {
	int data = 3;
	
	public void plusData() {
							//new A() //new Object() //this
		synchronized (new SynchronizedBlock()) { 
			//블락 동기화: 메소드의 일부분만 동기화, (this)(new 임의의 객체) 
			//this: 자신의 객체를 뜻하고 동기화 블록에 접근하는 키이다
			//모든 스레드는 key를 가져야 동기화 블럭에 접근할 수 있다
			//key는 임의의 객체를 키로 사용할 수 있다
			int mydata = data; //데이터를 가져오기
			try { Thread.sleep(2000);} catch (InterruptedException e) {}		
			data = mydata+1;
		}
	}
}

//#공유객체를 사용하는 쓰레드 
class PlusThread extends Thread {
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData=myData;
	}
	
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		//#공유객체 생성
		MyData myData = new MyData();
				
		//#1.  plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		//#2.  plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
