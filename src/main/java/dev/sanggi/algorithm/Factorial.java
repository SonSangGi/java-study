package dev.sanggi.algorithm;

public class Factorial {
    /**
     * 종류: 재귀함수
     * <p>
     * n의 팩토리얼은 n!이라고 표시한다. 이는 1부터 n까지의 정수를 곱하는 단순 연산이다.
     * 예를 들어 5!는 1 * 2 * 3 * 4 * 5, 즉 120이다.
     * 0!은 1보다 크거나 같고 0보다 작은 모든 정수의 곱이지만, 그런 수는 존재하지 않음. 그러므로 0!는 곱셈의 항등원인 1과 같다고 정의
     */
    public static void main(String[] args) {
        System.out.println(solution1(6));
        System.out.println(solution2(10));
    }

    // 재귀 함수 방식
    public static int solution2(int n) {
        if (n == 0) return 1;
        else return solution2(n - 1) * n;
    }

    // 일반 for문 방식
    public static int solution1(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
