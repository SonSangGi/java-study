package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		System.out.println(solution2("try hello world"));
	}

	/**
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	 * <p>
	 * 제한 사항
	 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
	 * <p>
	 * try hello world	TrY HeLlO WoRlD
	 * 입출력 예 설명
	 * try hello world는 세 단어 try, hello, world로 구성되어 있습니다.
	 * 각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다.
	 * 따라서 TrY HeLlO WoRlD 를 리턴합니다.
	 */
	public static String solution(String s) {
		String[] wsSplit = s.split(" ");
		String answer = "";
		for (int i = 0; i < wsSplit.length; i++) {
			String[] temp = wsSplit[i].split("");
			for (int j = 0; j < temp.length; j++) {
				answer += j % 2 == 0 ? temp[j].toUpperCase() : temp[j];
			}
			answer += " ";
		}
		return answer;
	}

	public static String solution2(String s) {
		return Arrays.stream(s.split(" "))
				.map(x -> x.split(""))
				.map(x -> IntStream.range(0,x.length)
						.mapToObj(i -> i == x.length - 1 ?  x[i] + " " :  i % 2 == 0 ? x[i].toUpperCase() : x[i]  )
						.collect(Collectors.joining()))
		.collect(Collectors.joining());
	}
}
