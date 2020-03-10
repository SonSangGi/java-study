package dev.sanggi.codingtest.programmers.level1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class 소수찾기 {

	/**
	 * 문제 설명
	 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	 *
	 * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
	 * (1은 소수가 아닙니다.)
	 *
	 * 제한 조건
	 * n은 2이상 1000000이하의 자연수입니다.
	 *
	 * 입출력 예
	 * n	result
	 * 10	4
	 * 5	3
	 *
	 * 입출력 예 설명
	 * 입출력 예 #1
	 * 1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
	 *
	 * 입출력 예 #2
	 * 1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
	 */

	public static void main(String[] args) {
		System.out.println("RESULT : " + solution(1000));
		System.out.println("RESULT2 : " + solution2(1000));
		System.out.println("RESULT3 : " + solution3(1000));
		System.out.println("RESULT4 : " + solution4(1000));
	}

	// 통과 (에라토스테네스의 체)
	public static int solution4(int n) {

		boolean[] primes = new boolean[n + 1];
		int count = 0;

		for (int i = 2; i <= n; i++)
			primes[i] = true;

		for (int i = 2; (i * i) <= n; i++) {
			if (primes[i])
				for (int j = i * 2; j <= n; j += i) primes[j] = false;
		}

		for (int i = 0; i <= n; i++)
			if (primes[i]) count++;

		return count;
	}

	// 시간 초과
	public static int solution(int n) {
		return IntStream.range(2, n + 1)
				.filter(i -> {
					for (int j = 2; j < i; j++)
						if (i % j == 0) return false;
					return true;
				}).toArray().length;
	}

	// 시간 초과
	public static int solution2(int n) {
		int result = 0;

		for (int i = 2; i <= n; i++) {
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) result++;
		}

		return result;
	}

	// 시간초과 ㅡㅡ
	public static int solution3(int n) {

		ArrayList<Boolean> primes = new ArrayList<>(n + 1);

		primes.add(false);
		primes.add(false);

		for (int i = 2; i <= n; i++)
			primes.add(true);

		for (int i = 2; (i * i) <= n; i++) {
			if (primes.get(i))
				for (int j = i * 2; j <= n; j += i) primes.set(j, false);
		}

		return (int) primes.stream().filter(prime -> prime).count();
	}

}
