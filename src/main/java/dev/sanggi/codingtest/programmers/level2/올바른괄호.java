package dev.sanggi.codingtest.programmers.level2;

public class 올바른괄호 {

    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }

    public static boolean solution(String s) {

        char[] chars = s.toCharArray();

        int temp = 0;

        for (char c : chars) {
            if (c == '(') temp++;
            else temp--;
            if (temp < 0) return false;
        }

        if (temp > 0) return false;

        return true;
    }

}
