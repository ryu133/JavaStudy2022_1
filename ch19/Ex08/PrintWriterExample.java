package ch19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter: 자동 flush() 기능이 있지만 활성화를 해야 함


public class PrintWriterExample {
	public static void main(String[] args) {
		//파일 객체 생성
		File pw1=new File("ch19/Ex08/pw1.txt");
		File pw2=new File("ch19/Ex08/pw2.txt");
		File pw3=new File("ch19/Ex08/pw3.txt");
		
		//2 PrintWriter(File o)
		try (PrintWriter pw=new PrintWriter(pw1);) {
			pw.println("PrintWriter Ex1");
			pw.println(13);
			pw.println(5.8);
			pw.print("Hello ");
			pw.println("Nice ");
			pw.printf("%d,%s",7,"Hi").printf("%s %f", "Thx",3.7);
			
		} catch (Exception e) {}
		
		//3 PrintWriter(OutputStream os)
		try (PrintWriter pw=new PrintWriter(new FileOutputStream(pw2));) {
			pw.println("PrintWriter Ex1");
			pw.println(13);
			pw.println(5.8);
			pw.print("Hello ");
			pw.println("Nice ");
			pw.printf("%d,%s",7,"Hi").printf("%s %f", "Thx",3.7);
			
		} catch (Exception e) {}
		
		//4 PrintWriter(System.out)
		
			PrintWriter pw=new PrintWriter(System.out,true); 
			//PrintWriter(System.out,true) : Auto flush() 활성화
			pw.println("PrintWriter Ex1");
			pw.println(13);
			pw.println(5.8);
			pw.print("Hello ");
			pw.println("Nice ");
			pw.printf("%d,%s",7,"Hi").printf("%s %f", "Thx",3.7);
//			pw.flush();
//			pw.close();
			
		
	}
}
