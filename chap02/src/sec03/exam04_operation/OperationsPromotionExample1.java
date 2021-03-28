package sec03.exam04_operation;

public class OperationsPromotionExample1 {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;   //컴파일 에러
		byte byteValue3 = (byte)(byteValue1 + byteValue2);   //강제타입변환(casting)
		int intByteValue3 = byteValue3;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		System.out.println(intByteValue3);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;   //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;   //컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		//String strValue = "A";
		//char var = (char) strValue; // Cannot cast from String to char
		String stringAns="hello";
		char charAns1=stringAns.charAt(0); // 'h'를 반환함
		char charAns2=stringAns.charAt(1); // 'e'를 반환함
		System.out.println("charAns1="+charAns1);
		System.out.println("charAns2="+charAns2);

	}

}
