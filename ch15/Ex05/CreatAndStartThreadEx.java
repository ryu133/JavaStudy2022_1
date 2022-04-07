package ch15.Ex05;

//스레드 4개 생성
//1 스레드 상속 2 runnable 구현 3 익명 내부클래스 생성 후 구현

//스레드 내용
// 이름, 나이, 국어, 영어, 수학

class Abc1 extends Thread{
	@Override
	public void run() {
		String[] str1= {"홍길동","40","100","70","50"};
		try { Thread.sleep(10);} catch (InterruptedException e) {}
		for (int i=0; i<str1.length; i++) {
			System.out.print(str1[i]+" ");
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}

class Abc2 implements Runnable {
	@Override
	public void run() {
		String[] str2 = {"이순신", "50", "90", "60", "70"};
		try { Thread.sleep(20);} catch (InterruptedException e) {}
		for (int i=0; i<str2.length; i++) {
			System.out.print(str2[i]+" ");
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}			
	}
}


public class CreatAndStartThreadEx {
	public static void main(String[] args) {
		 Thread abc1t=new Abc1();
//		 abc1t.start();
		 
		 
//		String[] str0= {"이름","나이","국어","영어","수학"};
//		for (int i = 0; i < str0.length; i++) {
//			System.out.print(str0[i]+" ");
//			try { Thread.sleep(200);} catch (InterruptedException e) {}
//		}
		
		Runnable abc2=new Abc2();
		Thread abc2t=new Thread(abc2);
//		abc2t.start();
		
		Thread abc3t = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] str3 = {"신사임당","60","80","100","80"};
				try { Thread.sleep(30);} catch (InterruptedException e) {}
				for (int i=0; i<str3.length; i++) {
					System.out.println(str3[i]+" ");
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}	
			}
		});
//		abc3t.start();
		
				try { Thread.sleep(0);} catch (InterruptedException e) {}
				String[] str0= {"이름","나이","국어","영어","수학"};
				for (int i = 0; i < str0.length; i++) {
					System.out.print(str0[i]+" ");
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}
				
			
		abc1t.start();
		abc2t.start();
		abc3t.start();
	}
}
