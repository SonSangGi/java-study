package dev.sanggi.programmers.level3;

import java.util.*;
import java.util.stream.Collectors;

public class 베스트앨범 {

	public static void main(String[] args) {
		int[] test = solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
		for (int i : test) {
			System.out.println(i);
		}
	}

	public static int[] solution(String[] genres, int[] plays) {

		Map<String, HashMap<Integer, Integer>> chartMap = new HashMap<>();
		// 장르별로 map에 담음
		for (int i = 0; i < genres.length; i++) {
			if (chartMap.get(genres[i]) != null)
				chartMap.get(genres[i]).put(i, plays[i]);
			else {
				HashMap<Integer, Integer> idMap = new HashMap<>();
				idMap.put(i, plays[i]);
				chartMap.put(genres[i], idMap);
			}
		}

		List<Integer> list = new ArrayList();

		chartMap.keySet().stream()
			.sorted((o1, o2) -> {
				int current = chartMap.get(o1).keySet().stream().mapToInt(key -> chartMap.get(o1).get(key)).sum();
				int next = chartMap.get(o2).keySet().stream().mapToInt(key -> chartMap.get(o2).get(key)).sum();
				return next - current;
			}).forEach(key ->
				chartMap.get(key).entrySet().stream()
					.sorted((o1, o2) -> {
						int c = (o1.getValue() - o2.getValue()) * -1;
						return c == 0 ? o1.getKey().compareTo(o2.getKey()) : c;
					})
				.mapToInt(o -> o.getKey())
				.limit(2)
				.forEach(i -> list.add(i))
			);
		// child map의 value sum 값으로 parent map 정렬 후 child map을 value 높은 순 정렬
		// value가 같은 경우 id 값으로 정렬 limit2 후 list에 담음


		return list.stream().mapToInt(i -> i).toArray();
	}
}
