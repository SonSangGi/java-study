package dev.sanggi.programmers.level1;

public class 문자다루기기본 {

	public static void main(String[] args) {
		System.out.println(solution("5.569"));
	}
	public static boolean solution(String s) {
		return s.matches("[0-9]{4}|[0-9]{6}");
	}
}
