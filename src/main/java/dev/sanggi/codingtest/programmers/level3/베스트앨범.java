package dev.sanggi.codingtest.programmers.level3;

import java.util.*;

public class 베스트앨범 {

	/**
	 * 문제 설명
	 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
	 *
	 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
	 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
	 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
	 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
	 *
	 * 제한사항
	 * genres[i]는 고유번호가 i인 노래의 장르입니다.
	 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
	 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
	 * 장르 종류는 100개 미만입니다.
	 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
	 * 모든 장르는 재생된 횟수가 다릅니다.
	 *
	 * 입출력 예
	 * genres	plays	return
	 * [classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
	 *
	 * 입출력 예 설명
	 * classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
	 *
	 * 고유 번호 3: 800회 재생
	 * 고유 번호 0: 500회 재생
	 * 고유 번호 2: 150회 재생
	 * pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
	 *
	 * 고유 번호 4: 2,500회 재생
	 * 고유 번호 1: 600회 재생
	 * 따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
	 */

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
