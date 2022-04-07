package ch15.Ex03;
//2번째 스레드
class SMFileThread extends Thread{ //자막 파일 처리 스레드
	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막번호) "+strArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {} //0.2초 딜레이
		}
		
	}
}
//3번째 스레드
class VideoFileThread extends Thread{ //비디오 프레임 처리 스레드
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i=0; i<intArray.length; i++) {
			System.out.print("(비디오프레임) "+intArray[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

public class CreatAndThread2 {
	//1번째 메인스레드
	public static void main(String[] args) {
		//SMIFileThread 객체 생성 및 시작
		Thread smi=new SMFileThread();
		smi.start();
		
		//VideoFileThread 객체 생성 및 시작
		Thread video=new VideoFileThread();
		video.start();
	}
}
