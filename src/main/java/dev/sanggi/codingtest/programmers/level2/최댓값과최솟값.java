package dev.sanggi.codingtest.programmers.level2;

/**
 * @@author SonSangGi
 * @created 2020/04/05
 */
public class 최댓값과최솟값 {
    /*
    문제 설명
    문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
    str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값) (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요.
    예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3 -4라면 -4 -1을 리턴하면 됩니다.

    제한 조건
    s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
    입출력 예
    s	              return
    1 2 3 4	        1 4
    -1 -2 -3 -4	    -4 -1
    -1 -1	          -1 -1
     */
    public static void main(String[] args) {
        String str = solution("-1 -2 -3 -4");
        System.out.println(str);

        System.out.println(Integer.parseInt("-1") < 0);
    }

    public static String solution(String s) {
        int max = 0, min = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i].equals("-") ?
                    Integer.parseInt(arr[i].concat(arr[i + 1]))
                    : Integer.parseInt(arr[i]);
            if (i == 0) {
                max = number;
                min = number;
                continue;
            }
            if (number > max) max = number;
            if (number < min) min = number;
        }

        return min + " " + max;
    }
}
