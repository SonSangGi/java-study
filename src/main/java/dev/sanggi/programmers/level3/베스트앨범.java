package dev.sanggi.programmers.level3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {
	public static void main(String[] args) {
		solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};

		Map<String, HashMap<Integer, Integer>> chartMap = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			if (chartMap.get(genres[i]) != null)
				chartMap.get(genres[i]).put(i, plays[i]);
			else {
				HashMap<Integer, Integer> idMap = new HashMap<>();
				idMap.put(i, plays[i]);
				chartMap.put(genres[i], idMap);
			}
			System.out.println(i + ") " + genres[i] + ": " + plays[i]);
		}

		chartMap.keySet().forEach(key -> {
			chartMap.get(key).entrySet().stream()
					.sorted((o1, o2) -> (o1.getValue() - o2.getValue()) * -1)
					.mapToInt()
		});

		System.out.println();

		chartMap.keySet().forEach(key -> System.out.println(key + " : " + chartMap.get(key)));

		return answer;
	}
}
