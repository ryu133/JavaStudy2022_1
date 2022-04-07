package ch15.Ex04;

//Runnable 인터페이스 상속하여 run()을 구현하는 클래스 생성
class SMIFileRunnalble implements Runnable { //인터페이스
	@Override
	public void run() {
		//자막 번호 하나~다섯
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		//자막번호 출력
		for (int i=0; i<strArray.length; i++) {
			System.out.println(" - (자막번호) "+strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class VideoFileRunnable implements Runnable {
	@Override
	public void run() {
		//비디오프레임 1~5
		int[] intArray = {1, 2, 3, 4, 5};
		
		//비디오 프레임 출력
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(비디오프레임) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}			
	}
}

public class CreatAndThread3 {
	public static void main(String[] args) {
		//SMIRunnable 객체 생성
		Runnable smi = new SMIFileRunnalble();
		//smiFileRunnable.start(); //start()는 runnable 인터페이스 내에 존재하지 않는다(오류)
		Thread thread1 = new Thread(smi);//runnable 객체를 thread 생성자 내부에 넣는다
		thread1.start();
		
		//VideoFileRunnable 객체 생성
		Runnable video = new VideoFileRunnable();
		//videoFileRunnable.start(); //오류
		Thread thread2 = new Thread(video);
		thread2.start();
		
		
	}
}
