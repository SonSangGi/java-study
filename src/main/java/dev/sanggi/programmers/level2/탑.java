package dev.sanggi.programmers.level2;


public class 탑 {
	public static void main(String[] args) throws InterruptedException {
//		int[] a1 = solution(new int[]{6, 9, 5, 7, 4});
//		Thread.sleep(2000);
		int[] a2 =solution(new int[]{3,9,9,3,5,7,2});
//		Thread.sleep(2000);
//		int[] a3 =solution(new int[]{1,5,3,6,7,6,5});
	}

	public static int[] solution(int[] heights) {

		int[] answer = new int[heights.length];

		for (int i = heights.length - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}

		return answer;
	}
}
