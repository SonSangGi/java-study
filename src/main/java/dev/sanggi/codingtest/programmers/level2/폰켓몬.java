package dev.sanggi.codingtest.programmers.level2;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @@author SonSangGi
 * @created 2020/04/02
 */
public class 폰켓몬 {
    public static void main(String[] args) {
        int[] a1 = {3, 1, 2, 3};
        int[] a2 = {3, 3, 3, 2, 2, 4};
        int[] a3 = {3, 3, 3, 2, 2, 2};
        System.out.println(solution(a1));
    }

    public static int solution(int[] nums) {
        int size = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
        return size > nums.length / 2 ? nums.length / 2 : size;
    }
}
