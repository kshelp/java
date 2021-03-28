package verify.exam00;

public class LottoRun {

	public static void main(String[] args) {
		LottoPlayNormal normal = new LottoPlayNormal();
		for (int i = 1; i <= 10; i++) {
			normal.playNormal(new int[6]);
			System.out.println();
		}
	}

}