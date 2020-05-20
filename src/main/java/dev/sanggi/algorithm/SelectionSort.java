package dev.sanggi.algorithm;

import java.util.Arrays;

public class SelectionSort {
    /**
     * 선택 정렬
     *
     * #1 스왑 함수
     *  - 선택 정렬 알고리즘을 포함하여 정렬알고리즘의 중요한 단계는 배열 내 두개 항목의 위치를 바꾸는 것이다.
     *
     *  #2. 하위 배열에서 최솟값 구하기
     *
     *  #3. 선택정렬
     *  - 스왑 함수와 indexOfMinimum 함수를 사용하여 구현
     */
    public static void main(String[] args) {
        // #1
        int[] arr = {1, 2, 3};
        System.out.printf("배열 %s \n",Arrays.toString(arr));
        swap(arr, 1, 2);
        System.out.printf("스왑 %s \n\n",Arrays.toString(arr));

        // #2
        int[] arr2 = {5, 8, 31, 68, 21, 56, 33, 12, 7, 9};
        int startIndex = 4;
        System.out.printf("배열 %s \n시작 인덱스 %d \n시작 인덱스부터의 가장 작은 값 %d \n\n",Arrays.toString(arr2), startIndex, arr2[indexOfMinimum(arr2, startIndex)]);

        // #3
        int[] arr3 = {5, 6, 4, 3, 2, 7, 2, 8, 9, 1};
        System.out.printf("배열 %s \n", Arrays.toString(arr3));
        selectionSort(arr3);
        System.out.printf("정렬 %s", Arrays.toString(arr3));
    }

    // #1 스왑 함수
    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    // #2 하위배열에서 최솟 값 구하기
    private static int indexOfMinimum(int[] arr, int startIndex) {
        int minValue = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }

        return minIndex;
    }

    // #3 선택 정렬
    private static void selectionSort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = indexOfMinimum(arr, i);
            swap(arr, minIndex, i);
        }
    }


}
