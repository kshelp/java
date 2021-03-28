package verify.exam00;

public class MemberPrintMain {
	public static void main(String[] args) {
		MemberPrint mp = new MemberPrint();
		Thread t1 = new Thread(mp, "a");
		Thread t2 = new Thread(mp, "b");
		Thread t3 = new Thread(mp, "c");
		t1.start();
		t2.start();
		t3.start();
	}
}