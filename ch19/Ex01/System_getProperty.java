package ch19.Ex01;

public class System_getProperty {
	public static void main(String[] args) {
		//System.getProperty() 
		System.out.println(System.getProperty("user.dir")); //���� �۾� ���丮
		System.out.println(System.getProperty("java.version")); //�ڹ� ����
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home")); //�ڹ� ��ġ Ȩ����
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name")); //�α����� ����
		System.out.println(System.getProperty("user.home")); //Ȩ����
		System.out.println(System.getProperty("os.home")); //os ����
		System.out.println(System.getProperty("os.arch")); //os ��Ű����
		System.out.println(System.getProperty("os.version")); 
		System.out.println(System.getProperty("file.separator")); //���� ������
		System.out.println(System.getProperty("path.separator")); //�н� ������
		System.out.println(System.getProperty("line.separator")); //�� ������
	}
}
