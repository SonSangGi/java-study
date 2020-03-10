package dev.sanggi.codingtest.programmers.level1;

public class 가운데글자가져오기 {
	/**
	 * 문제 설명
	 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	 *
	 * 제한사항
	 * s는 길이가 1 이상, 100이하인 스트링입니다.
	 */
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : s.substring(s.length() / 2, s.length() / 2 + 1);
	}
}
