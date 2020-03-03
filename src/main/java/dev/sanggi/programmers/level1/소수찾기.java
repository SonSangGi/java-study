package dev.sanggi.programmers.level1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 소수찾기 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); //시작하는 시점 계산

		System.out.println("RESULT : " + solution(1000));
		System.out.println("RESULT2 : " + solution2(1000));
		System.out.println("RESULT3 : " + solution3(1000));
		System.out.println("RESULT4 : " + solution4(1000));

		long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println("실행 시간 : " + (end - start) / 1000.0);
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

	// 통과
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
}
