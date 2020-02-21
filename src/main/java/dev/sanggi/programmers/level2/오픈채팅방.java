package dev.sanggi.programmers.level2;

import java.util.*;

public class 오픈채팅방 {

	public static void main(String[] args) {
		for (String s : solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"})) {
			System.out.println(s);
		}
	}

	public static String[] solution(String[] record) {

		Map id = new HashMap();
		List<String> answer = new ArrayList();

		for (String s : record) {
			String[] command = s.split(" ");
			if (!command[0].equals("Leave"))
				id.put(command[1], command[2]);
		}

		for (String s : record) {
			String[] command = s.split(" ");

			if (command[0].equals("Enter"))
				answer.add(id.get(command[1]) + "님이 들어왔습니다.");
			else if (command[0].equals("Leave"))
				answer.add(id.get(command[1]) + "님이 나갔습니다.");
		}

		return answer.toArray(new String[0]);
	}
}
