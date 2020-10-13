package javaapp1013;

public class PerfectNumber {
	public static void main(String[] args) {
		// 2부터 1000까지 완전수의 개수 구하기
		// 완전수 : 자기 자신을 제외한 약수의 합이 자기 자신과 동일한 수

		// 완전수 개수를 저장할 변수
		int cnt = 0;
		for (int i = 2; i <= 1000; i = i + 1) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j = j + 1) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i) {
				cnt = cnt + 1;
				// 확인해보기 위해서 i를 출력
				System.out.printf("완전수 : %d\n", i);
			}
		}

		System.out.printf("완전수의 개수는 %d개 입니다.", cnt);

	}
}
