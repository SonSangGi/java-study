package dev.sanggi.programmers.level2;

public class 스킬트리 {
	/**
	 * 선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
	 * <p>
	 * 예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
	 * <p>
	 * 위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
	 * <p>
	 * 선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
	 * <p>
	 * 제한 조건
	 * 스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
	 * 스킬 순서와 스킬트리는 문자열로 표기합니다.
	 * 예를 들어, C → B → D 라면 CBD로 표기합니다
	 * 선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
	 * skill_trees는 길이 1 이상 20 이하인 배열입니다.
	 * skill_trees의 원소는 스킬을 나타내는 문자열입니다.
	 * skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
	 */

	public static void main(String[] args) {
		int a = solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
		System.out.println(a);
	}

	public static int solution(String skill, String[] skill_trees) {

		int idx = 0;

		String[] skillArr = skill.split("");

		for (final String skillTree : skill_trees) {

			if (!skillTree.contains(skillArr[0])) break;

			System.out.println("[IN] - [" + skillTree + "]");

			boolean isComplated = false;
			int prevIdx = skillTree.indexOf(skillArr[0]);

			for (int i = 1; i < skillArr.length; i++) {
				if (!skillTree.contains(skillArr[i])) continue;

				int currentIdx = skillTree.indexOf(skillArr[i]);

				System.out.print(skillTree.substring(prevIdx, prevIdx + 1) + "" + prevIdx + " : ");
				if (currentIdx > 0)
					System.out.println(skillTree.substring(currentIdx, currentIdx + 1) + "" + currentIdx + "");
				else System.out.println(currentIdx);

				if (prevIdx < currentIdx)
					isComplated = true;
				else {
					isComplated = false;
					break;
				}
				prevIdx = currentIdx;
			}
			if (isComplated) idx++;
			System.out.println(isComplated);
			System.out.println("[OUT] - [" + skillTree + "]");
		}

		return idx;
	}
}
