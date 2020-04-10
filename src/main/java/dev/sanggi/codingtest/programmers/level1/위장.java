package dev.sanggi.codingtest.programmers.level1;

/**
 * @@author SonSangGi
 * @created 2020/04/02
 */
public class 위장 {
    public static void main(String[] args) {
        solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
    }

    public static int solution(String[][] clothes) {

        for (int i = 0; i < clothes.length; i++) {
            for (int j = 0; j < clothes[i].length; j++) {
                System.out.println(clothes[i][j]);
            }
        }
        return 0;
    }

}
