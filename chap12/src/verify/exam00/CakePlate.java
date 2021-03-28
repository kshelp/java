package verify.exam00;

public class CakePlate {
	private int breadCount = 0;

	public CakePlate() {
	}

	public synchronized void makeBread() {
		if (breadCount >= 10) {
			try {
				System.out.println("»§ÀÌ ³²´Â´Ù.");
				wait();
			} catch (InterruptedException ire) {
			}
		}
		breadCount++;// »§ÀÌ 10°³°¡ ¾ÈµÇ¸é ´õ ¸¸µéÀÚ.
		System.out.println("»§À» 1°³ ´õ ¸¸µë  ÃÑ : " + breadCount + "°³");
		this.notifyAll();
	}

	public synchronized void eatBread() {
		if (breadCount < 1) {
			try {
				System.out.println("»§ÀÌ ¸ðÀÚ¶ó ±â´Ù¸²");
				wait();
			} catch (InterruptedException ire) {
			}
		}
		breadCount--;// »§ÀÌ ÀÖÀ¸´Ï ¸ÔÀÚ.
		System.out.println("»§À» 1°³ ¸ÔÀ½  ÃÑ : " + breadCount + "°³");
		this.notifyAll();
	}
}
