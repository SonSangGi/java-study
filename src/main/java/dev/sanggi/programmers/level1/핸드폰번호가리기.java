package dev.sanggi.programmers.level1;

public class 핸드폰번호가리기 {
	public static void main(String[] args) {
		String a = solution("01012345678");
		System.out.println(a);
	}

	// 정규식으로
	public static String solution(String phone_number) {
		return phone_number.replaceAll(".(?=.{4})", "*");
	}

	// 반복문으로
	public static String solution2(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.length() - 4; i++)
			answer += "*";
		answer += phone_number.substring(phone_number.length() - 4);
		return answer;
	}
}
