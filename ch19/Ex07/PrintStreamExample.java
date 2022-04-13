package ch19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream(Filter Stream: 추가 기능을 제공하는 Stream, 기반 스트림 필요)
	//다양한 방법으로 출력하는 스트림. 자동으로 flush()가 적용되므로 호출하지 않아도 됨
		//println(),print(),printf()
		//파일에 출력, 콘솔에 출력, .. 

public class PrintStreamExample {
	public static void main(String[] args) {
		//1 File 객체 생성
		File outFile1=new File("ch19/Ex07/printstream1.txt");
		File outFile2=new File("ch19/Ex07/printstream2.txt");
		
		//2 PrintStream(FileOutputStream(File))  <파일에 출력
		
		try (OutputStream os1=new FileOutputStream(outFile1);
				PrintStream ps=new PrintStream(os1);)  //Filter 스트림(추가 기능 제공), 기반 스트림 필요
		{
			ps.println(5.8); //double 출력 후 개행
			ps.print(3+"안녕"+12345+"\n"); //출력 후 개행 없음
			ps.printf("%d이 호출되었습니다. \n", 7); // "%d" : int 값을 호출
			ps.printf("%s %f", "안녕",5.8); //%s : string , %f : double

			//ps.flush(); 자동 호출됨
			
		} catch (Exception e) {	}
		
		
		//3 PrintStream(File)  <파일에 출력
		try (PrintStream ps=new PrintStream(outFile2);){
			ps.println(5.8); //double 출력 후 개행
			ps.print(3+"안녕"+12345+"\n"); //출력 후 개행 없음
			ps.printf("%d이 호출되었습니다. \n", 7); // "%d" : int 값을 호출
			ps.printf("%s %f", "안녕",5.8); //%s : string , %f : double
		} catch (Exception e) {		}
		
		
		//4 PrintStream ps=System.out;  <콘솔에 출력
		try (OutputStream os2=System.out;
				PrintStream ps=new PrintStream(os2);)
		{
			ps.println(5.8); //double 출력 후 개행
			ps.print(3+"안녕"+12345+"\n"); //출력 후 개행 없음
			ps.printf("%d이 호출되었습니다. \n", 7); // "%d" : int 값을 호출
			ps.printf("%s %f", "안녕",5.8);
		} catch (Exception e) {		}
		
		System.out.println();
		
		//5 PrintStream ps=System.out;  <콘솔에 출력
		try (PrintStream ps=System.out;)
		{
			ps.println(5.8); //double 출력 후 개행
			ps.print(3+"안녕"+12345+"\n"); //출력 후 개행 없음
			ps.printf("%d이 호출되었습니다. \n", 7); // "%d" : int 값을 호출
			ps.printf("%s %f", "안녕",5.8);
		} catch (Exception e) {		}
		
		
		
		
		
	}
}
