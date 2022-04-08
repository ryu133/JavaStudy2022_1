package ch19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR: 한국 표준, 한글 표현 가능 전체 중 표기 가능한 것만 구성됨. 약 11000 ->2200만 표기, 8000자는 표기 안됨
	//영문: 1byte, 한글: 2byte
//MS949: Microsoft에서 개발한 한글 표기 방식. 11000자 모두 표기 가능
	//영문: 1byte, 한글: 2byte
//UTF-8: 모든 서버(web,FTP,Mail,DB, ..),git,Mac <가변 길이>
	//영문: 1byte, 한글: 3byte
//URF-16: <고정 길이>
	//영문: 2byte, 한글: 2byte
	
//문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우 해당 인코딩 타입으로 조합을 해야 꺠지지 않는다

//이클립스에서 인코딩 타입 설정 3가지
	//1 전역 설정: 
	//2 프로젝트에서 설정: 
	//3 파일에서 설정: 

	//우선순위- 파일>프로젝트>전역(워크스페이스)
public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
		//1 영문자를 byte로 내보내고 다시 String으로 변환 
		byte[] b1="a".getBytes("EUC-KR"); //문자를 byte로 변환 => 네트워크로 문자를 byte스트림으로 변환해서 전송
			//예외 발생됨 (UnsupportedEncodingException) <= 오타가 발생할 경우 인코딩할 수 없는 예외가 발생됨
		byte[] b2="a".getBytes("MS949"); //문자열 => byte[]
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		System.out.println(new String(b1,"EUC-KR")); //byte[] => 문자열로 바꿈
		System.out.println(new String(b2,"MS949"));
		
		
		//2 한글을 byte로 내보내고 String으로 가져오기
		byte[] b3="가".getBytes("EUC-KR");
		byte[] b4="가".getBytes("MS949");
		
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		System.out.println(new String(b3,"EUC-KR"));
		System.out.println(new String(b4,"MS949"));
		
		
		//3 EUC-KR은 현재 사용 가능한 것만 표기 
		byte[] b5="뷁".getBytes("EUC-KR"); //약 11000자 (총 2200만 표기, 800자 표기x)
		byte[] b6="뷁".getBytes("MS949");	//11000자 모두 처리
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5,"EUC-KR"));
		System.out.println(new String(b6,"MS949"));
		
		
	}

}
