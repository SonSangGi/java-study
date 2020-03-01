package dev.sanggi.programmers.level1;

public class 핸드폰번호가리기 {
	public static void main(String[] args) {
		String a = solution("01012345678");
		System.out.println(a);
	}

	public static String solution(String phone_number) {
		return phone_number.replaceAll("(\\d{4})$", "$1*");
	}
}
