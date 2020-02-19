package dev.sanggi.programmers.level1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문자열압축 {

	public static void main(String[] args) {
		//System.out.println(solution2("aabbaccc"));
		//System.out.println(solution3("ababcdcdababcdcd"));
	}

	/**
	 * "aabbaccc"	7
	 * @param s
	 * @return
	 */
	public static int solution2(String s) {
		 return Arrays.stream(s.split("(?<=(.))(?!\\1)"))
				.mapToInt(str -> str.length() > 1 ? 2 : 1)
				.sum();
	}

	public static String solution3(String s) {
		return Arrays.stream(s.split("(?<=(.))(?!\\1)"))
				.map(str -> str.length() > 1 ?  str.length() + str.substring(0,1) : str.substring(0,1))
				.collect(Collectors.joining());
	}
}
