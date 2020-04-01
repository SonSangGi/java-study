package dev.sanggi.codingtest.programmers.level2;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JadenCase문자열만들기 {

    /*
    문제 설명
    JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
    문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

    제한 조건
    s는 길이 1 이상인 문자열입니다.
    s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
    첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )

    입출력 예
    s	                     | return
    3people unFollowed me	 | 3people Unfollowed Me
    for the last week	     | For The Last Week
     */

    public static void main(String[] args) {
        System.out.println(solution3("3people unFollowed me "));
    }

    // #2
    public static String solution2(final String s) {

        return IntStream.range(0, s.length())
                .map(i -> i > 0 && s.charAt(i - 1) != ' '
                        ? Character.toLowerCase(s.charAt(i))
                        :Character.toUpperCase(s.charAt(i)))
                .mapToObj(i ->Character.toString((char)i))
                .collect(Collectors.joining());
    }

    // #1
    public static String solution(String s) {

        ArrayList<Integer> blankIndexList = new ArrayList<>();
        blankIndexList.add(0);

        int index = 0;

        while (true) {
            index = s.indexOf(' ', index);
            if (index > 0 && index == s.length()) blankIndexList.add(++index);
            else break;
        }

        String answer = "";

        for (int i = 0; i < blankIndexList.size(); i++) {
            answer += Character.toUpperCase(s.charAt(blankIndexList.get(i)));
            answer += blankIndexList.size() - 1 != i
                    ? s.substring(blankIndexList.get(i) + 1, blankIndexList.get(i + 1)).toLowerCase()
                    : s.substring(blankIndexList.get(i) + 1).toLowerCase();
        }

        return answer;
    }

    // 다른사람풀이
    public static String solution3(String s) {
        String answer = "";
        boolean flag = true;
        String[] arr = s.toLowerCase().split("");

        for (String str : arr) {
            answer += flag ? str.toUpperCase() : str;
            flag = str.equals(" ") ? true : false;
        }

        return answer;
    }
}
