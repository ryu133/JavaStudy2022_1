package ch19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//BufferedInputStream: InputStream에 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림, 단독으로 사용할 수 없다. 기반 스트림의 추가기능
//BufferedOutputStream: OutputStream에 필터를 장착해서 쓰기 성능을 아주 빠르게 한 스트림, 단독으로 사용할 수 없다. 기반 스트림의 추가기능

public class BufferedInput_BufferedOutputStream {
	public static void main(String[] args) {
		//두 파일을 복사, Buffered를 사용하지 않고 처리하는 경우, Buffered를 사용하는 경우 속도 차이
		
		File orgFile=new File("ch19\\Ex07\\mycat_origin.jpg"); //원본 파일 
		File copyFile1=new File("ch19\\Ex07\\mycat_copy1.jpg"); //Buffered를 사용하지 않고 처리하는 경우
		File copyFile2=new File("ch19\\Ex07\\mycat_copy2.jpg"); //Buffered를 사용하는 경우
		
		//성능 측정을 하기 위한 변수 선언
		long start,end,time1,time2; //time1: Buffered를 사용하지 않는 경우, time2: Buffered를 사용한 경우
		
		
		//1 Buffered를 사용하지 않고 처리하는 경우(BufferedInputStream,BufferedOutputStream)
		start=System.nanoTime(); //시작 시간
		
		
		try (InputStream is=new FileInputStream(orgFile); //Auto close()
			 OutputStream os=new FileOutputStream(copyFile1); //Auto close()
		) {
			//데이터 복사 코드 생성
			int data;
			while ((data=is.read())!=-1) { //is에서 1byte 읽어서 
				os.write(data);				//os에 1byte 쓰기
			}
		} catch (IOException e) {}
		end=System.nanoTime();
		time1=end-start;
		System.out.println("Without Buffered In-Out Stream : "+time1); //버퍼를 사용하지 않고 복사 copy1.jpg
		
		//2 Buffered를 사용해서 처리하는 경우(BufferedInputStream,BufferedOutputStream)
		start=System.nanoTime();
		
		try (InputStream is=new FileInputStream(orgFile); //기반 스트림
				BufferedInputStream bis=new BufferedInputStream(is); //추가 기능을 재공하는 스트림. 성능을 빠르게 처리(Buffer 사용)
				OutputStream os=new FileOutputStream(copyFile2); //기반 스트림
				BufferedOutputStream bos=new BufferedOutputStream(os);) //추가 기능 제공(필터)
		{
			int data;
			while ((data=bis.read())!=-1) { //버퍼를 사용해서 읽기 (빠름)
				bos.write(data); //버퍼를 사용해서 쓰기 (빠름)
			}
		} catch (IOException e) {}
		end=System.nanoTime();
		time2=end-start;
		System.out.println("With Buffered In-Out Stream : "+time2);
		
		//Buffered 사용한 경우(time2), 사용하지 않은 경우(time1)의 비율
		System.out.println("속도 차이 : "+(time1/time2)+"배 빠름");
		
		
	}
}
