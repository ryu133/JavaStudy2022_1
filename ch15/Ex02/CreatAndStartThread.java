package ch15.Ex02;
//새로운 스레드 생성
//1 thread 클래스 상속 후 run() 오버라이딩해서 구현(완성된 메소드)
//2 runnable 인터페이스의 run() 구현(미완성 메소드)
class SMFileThread extends Thread{
	@Override
	public void run() {//생성된 스레드에서 작업할 내용을 구현
		//2번째 스레드에서 작업할 내용
		//자막을 출력하는 스레드
		String[] strArray= {"하나", "둘","셋","넷","다섯"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		//자막 출력 구문
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) "+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class CreatAndStartThread {
	public static void main(String[] args) {
		//스레드 작동
		Thread sm=new SMFileThread();
		sm.start(); //run() 메소드 실행 - 스레드 시작
		//주의: run() 직접 호출하면 스레드가 작동되는 것이 아니고 메소드만 출력됨
		//start(): 스레드를 작동하기 위한 메모리 할당 후 run() 호출 : 스레드로 작업됨
		
		//첫번째 스레드 - 비디오 프레임 출력
		int[] intArray= {1,2,3,4,5};
		
		//비디오 프레임 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) "+ intArray[i]);
			
			//작업 지연(0.2초)
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
		
		
		
		
		
	}
}
