package dev.sanggi.programmers.level3;

import java.util.*;

public class 이중우선순위큐 {

	public static void main(String[] args) {
		String answer = Arrays.toString(solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}));
		System.out.println(answer);
	}

	public static int[] solution(String[] operations) {

		List<Integer> list = new ArrayList<>();

		for (String operation : operations) {
			if (operation.startsWith("I"))
				list.add(Integer.parseInt(operation.substring(operation.indexOf(" ") + 1)));
			else if (operation.startsWith("D"))
				if (operation.substring(operation.indexOf(" ") + 1).startsWith("-"))
					list.removeIf(i -> list.stream().mapToInt(Integer::valueOf).min().getAsInt() == i);
				else
					list.removeIf(i -> list.stream().mapToInt(Integer::valueOf).max().getAsInt() == i);
		}

		return list.isEmpty() ? new int[]{0, 0} :
				new int[]{list.stream().mapToInt(Integer::valueOf).max().getAsInt()
				,list.stream().mapToInt(Integer::valueOf).min().getAsInt()};
	}
}
