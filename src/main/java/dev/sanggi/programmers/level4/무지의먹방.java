package dev.sanggi.programmers.level4;

public class 무지의먹방 {
	public static void main(String[] args) {
		solution(new int[]{3, 1, 2,5,6,4,6,33,212,99,2,100}, 90);
	}

	public static int solution(int[] food_times, long k) {

		int index = 0;
		int next = 0;

		while (index != k) {
			for (int i = 0; i < food_times.length; i++) {
				if (index == k)  {
					if(food_times[i] == 0) k++;
					else next = i;
					break;
				}
				if (food_times[i] > 0) {
					index++;
					food_times[i] = food_times[i] - 1;
					System.out.println(i + ") " + food_times[i]);
				}
			}
		}
		System.out.println();

		for (int food_time : food_times) {
			System.out.println(food_time);
		}
		System.out.println(next + " )))) " + k);

		return next + 1;
	}
}
