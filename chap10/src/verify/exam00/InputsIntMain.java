package verify.exam00;
public class InputsIntMain {
	public static void main(String[] args) {
		InputsInt ins=new InputsInt();
		int [] anum=ins.input(3,0,9);//0에서 9까지 3개의숫자 중복허용
		ins.prints(anum);
		System.out.println("\n---------------");
		anum=ins.input(3,0,9,false);//0에서 9까지 3개의숫자 중복불허
		ins.prints(anum);
		System.exit(1);
	}
}
