package ch19.Ex04;

//�빮�� A~Z, �ҹ��� a~z���� �ƽ�Ű �ڵ尪 ��� for�� ���
//��� ��� 
//A, 65
//B, 66
//======
//a,97
//..


public class CharacterEx2 {
	public static void main(String[] args) {
		char[] c=new char[26];
		for (int i = 0; i < 26; i++) {
			c[i]=(char) (65+i);
			System.out.println(c[i]+", "+(int)c[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 26; i++) {
			c[i]=(char) (97+i);
			System.out.println(c[i]+", "+(int)c[i]);
		}
		
		
	}
}
