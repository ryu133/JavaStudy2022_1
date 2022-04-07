package ch15.Ex08;
//동기화(synchronized): 여러 스레드가 하나의 공유된 필드를 접근한 경우 하나의 작업이 완전히 완료된 후 다른 작업 수행
//내가 작업할 때 lock을 걸고 작업을 마치면 lock을 해제한다


//동기화를 하지 않았을 때
class MyData{ //스레드가 공유하는 객체 필드 생성
	int data = 3;
	
	public void plusData() {
		int mydata = data; //데이터를 가져오기
		try { Thread.sleep(2000);} catch (InterruptedException e) {}		
		data = mydata+1;
	}
}

//공유객체를 사용하는 쓰레드 
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


public class TheNeedsForSynchronized {
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
