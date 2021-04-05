// 2. 5회 반복을 하면서 정수를 입력받는다. 입력받은 정수의 합을 전부 출력한다. [20점]
// 만약에 입력받은 합이 100 이상이면, 반복이 5회가 아닐지라도 즉시 종료시키는 프로그램을 작성하시오.
package verify.exam00;

import java.util.Scanner;

public class ExitGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			int num = scan.nextInt();

			sum += num;
			
			System.out.println("정수: " + num + ", 합: " + sum);

			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}

// 실행 결과
// 입력: 7
// 정수: 7, 합: 7
// 입력: 14
// 정수: 14, 합: 21
// 입력: 1000 
// 정수: 1000, 합: 1021
// 프로그램 종료!
