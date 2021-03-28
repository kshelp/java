package verify.exam00;

public class SleepThread extends Thread {
	public SleepThread(String name) {
		setName(name);
	}

	public void run() {
		show();
	}

	public void show() {
		for (int i = 0; i < 50; i++) {
			print();
			try {
				Thread.sleep(50);// 50/1000 ÃÊ
			} catch (InterruptedException ite) {
			}
		}
	}

	public void print() {
		System.out.print(getName());// Thread¿¡¼­
	}
}