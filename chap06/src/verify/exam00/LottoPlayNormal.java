package verify.exam00;

import java.util.Arrays;

public class LottoPlayNormal {

	// playNormal() 메소드의 매개변수의 타입을 int 배열 타입으로 선언합니다.
	void playNormal(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 46) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		
		// 배열을 올림차순으로 정렬합니다.
		Arrays.sort(num);  

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
