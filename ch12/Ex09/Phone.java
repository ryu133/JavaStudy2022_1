package ch12.Ex09;

public interface Phone {
	int TIMEOUT=10000; //»ó¼ö  (public static final »ý·«µÊ)
	void sendCall(); //(public abstract)
	void receiveCall(); //(public abstract)
	default void printLogo() {
		System.out.println("print Logo");
	}
}
