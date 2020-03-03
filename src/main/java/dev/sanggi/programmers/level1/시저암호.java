package dev.sanggi.programmers.level1;

public class 시저암호 {
	public static void main(String[] args) {
		System.out.println(solution("a B z", 4));
	}

	public static String solution(String s, int n) {
		final char[] CHARS = s.toCharArray();
		final int CLEAR = 'Z' - 'A' + 1;
		String answer = "";

		for (char c : CHARS) {
			if (c > 'z' || c < 'A') answer += String.valueOf(c);
			else {
				boolean isUpper = c <= 'Z' ? true : false;
				int sumChar = c + n;
				answer += isUpper && c + n > 'Z'
						|| !isUpper && c + n > 'z'
						? String.valueOf((char) (sumChar - CLEAR))
						: (char) sumChar;
			}
		}

		return answer;
	}
}
