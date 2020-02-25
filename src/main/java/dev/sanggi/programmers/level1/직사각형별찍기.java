package dev.sanggi.programmers.level1;

import joptsimple.internal.Strings;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 직사각형별찍기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		IntStream.range(0, b).forEach(i -> System.out.println("*".repeat(a)));
	}
}
