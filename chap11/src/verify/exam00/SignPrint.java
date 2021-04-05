// 3. 표준입력장치(콘솔)로 입력 받은 변수 num의 값에 따라 '양수', '음수', 
// '0'을 출력하는 프로그램을 삼항 연산자를 이용해서 작성하시오. [20점]
package verify.exam00;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력: ");
		int num = scan.nextInt();

		String result = num > 0 ? "양수" : num == 0 ? "0" : "음수" ;
		System.out.println(result);

	}
}

// 실행 결과
// 정수입력: 5
// 음수