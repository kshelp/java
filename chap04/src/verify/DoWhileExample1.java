package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1~100 사이의 수		
		int ran = (int)(Math.random()*100) + 1;
		int cnt = 0, inNum =0;
		
//		1부터 100사이의 숫자를 입력하세요.
//		입력된 값이 ran과 같으면 1번에 맞쳤습니다라고 출려하고 종료
//		ran보다 크면 작은 수를 입력하세요.
//		ran보다 작으면 큰수를 입력하세요.
//		맞출때 까지 반복
		
		do {
			System.out.println("1부터 100사이 숫자를 입력하세요.");
			inNum = sc.nextInt();
			if (inNum > ran )
				System.out.println("작은 수를 입력하세요.");
			else if (inNum < ran)
				System.out.println("큰수를 입력하세요.");
			cnt++;			
		} while (ran != inNum);
		
		System.out.println(cnt+"번에 맞쳤습니다.");
		
		sc.close();

	}

}
