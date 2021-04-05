//1에서 100까지의 합과 평균을 산출하는 프로그램을 작성하시오. (30점)
package verify.exam00;

public class SumAvg {

	public static void main(String[] args) {
		/*
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		double avg = sum / 100.0;
		
		System.out.println("1~100 합계: " + sum);
		System.out.println("평균: " + avg);
		*/
		
		// 가우스 공식: n~m의 합 = (n+m)(n부터 m까지의 수의 개수)/2
		// 예) 1~100의 합 = 101 * 100 / 2 = 5050
		int num = 100;
		int sum = ((1 + num) * num) / 2 ;
		double avg = (double) sum / num;
		
		System.out.println("1~100 합계: " + sum);
		System.out.printf("평균: %.2f \n", avg);
		

	}
}
