package sec10.exam04_singleton;

public class SingletonLazyInit {
	private volatile static SingletonLazyInit singleton; // DCL를 위한 volatile 키워드 이용

	private SingletonLazyInit() {
	}

	public static SingletonLazyInit getInstance() {
		if (singleton == null) {
			synchronized (SingletonLazyInit.class) { // 인스턴스를 생성할때만 동기화 시킴
				if (singleton == null) { // DCL(Double-Checking Locking)
					singleton = new SingletonLazyInit();
				}
			}
		}
		return singleton;
	}
}
