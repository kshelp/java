package verify;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jumin = "900101-1234567";

		String gen = jumin.substring(7, 8);// gen="1";

		if (gen.equals("1") || gen.equals("3")) {
			System.out.println("남자");
		} else if (gen.equals("2") || gen.equals("4")) {
			System.out.println("여자");
		}

	}

}
