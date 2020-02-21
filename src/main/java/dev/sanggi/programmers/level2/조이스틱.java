package dev.sanggi.programmers.level2;

public class 조이스틱 {
	public static void main(String[] args) {
		solution("JAZ");
	}

	public static int solution(String name) {

		char[] chars = name.toCharArray();
		char center = (('Z' - 'A') / 2 + 'A');

		int moveCount = 0;

		for (int i = -1; i < chars.length - 1; i++) {
			int current = i >= 0 ? chars[i] : 'A';
			int next = chars[i + 1];
			int move = current - next > 0 ? current - next : (current - next) * -1;
			if (move > 13) move = 'Z' - 'A' - move + 1;
			moveCount += move;

			System.out.println("" + (char)current + "에서 " + (char)next + "로 " + move + "번 이동");
		}

		System.out.print(moveCount);
		return 0;
	}
}
