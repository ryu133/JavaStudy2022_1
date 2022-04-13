package ch19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream(Filter Stream: 추가 기능을 제공하는 Stream, 기반 스트림 필요)
	//다양한 방법으로 출력하는 스트림. 자동으로 flush()가 적용되므로 호출하지 않아도 됨
		//println(),print(),printf()
		//파일에 출력, 콘솔에 출력, .. 

public class PrintStreamExample2 {
	public static void main(String[] args) {
		//1 File 객체 생성
		File outFile1=new File("ch19/Ex07/printstream3.txt");
		File outFile2=new File("ch19/Ex07/printstream4.txt");
		
		//2 PrintStream(FileOutputStream(File))  <파일에 출력
		
		try (PrintStream ps=new PrintStream(outFile1);)  
		{
			ps.println(5.8); //double 출력 후 개행
			ps.print(3+"안녕"+12345+"\n"); //출력 후 개행 없음
			ps.printf("%d이 호출되었습니다. \n", 7); // "%d" : int 값을 호출
			ps.printf("%s %f", "안녕",5.8); //%s : string , %f : double
			
		} catch (Exception e) {	}
		
		try (InputStream is=new FileInputStream(outFile1);) 
		{
			int count;
			byte[] byteArray1=new byte[100];
			count=is.read(byteArray1);
			
			System.out.println(new String(byteArray1,0,count,"UTF-8"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
}
