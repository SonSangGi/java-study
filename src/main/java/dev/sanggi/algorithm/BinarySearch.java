package dev.sanggi.algorithm;

public class BinarySearch {
    /**
     * 이진 검색
     *
     * 이진 검색은 정렬된 리스트에서 원하는 항목을 찾기에 효율적인 알고리즘이다.
     * 이 검색법은 후보 범위가 한 항목으로 좁아질 때까지 찾고자 하는 항목을 포함하고 있는 리스트를 반으로 나누는 과정을 계속 반복한다.
     */
    public static void main(String[] args) {
        //int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] primes = new int[10000000];
        for (int i = 0; i < primes.length - 1; i++) {
            primes[i] = i;
        }
        System.out.println(doSearch(primes, 17));
    }

    private static int doSearch(int[] arr, int targetValue) {
        int min = 0;
        int max = arr.length - 1;
        int guess; // 추측 값
        int idx = 0;

        while (max >= min) {
            guess = (int) Math.floor((max + min) / 2);
            System.out.printf("%d) \t 목표 값: %s \t 추측 값: %s %n",++idx, targetValue, arr[guess]);
            if (arr[guess] == targetValue) {
                return guess;
            } else if (arr[guess] < targetValue) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }
}
