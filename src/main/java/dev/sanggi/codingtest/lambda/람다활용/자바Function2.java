package dev.sanggi.codingtest.lambda.람다활용;

import dev.sanggi.codingtest.lambda.람다활용.Function.MyIntPredicate;
import scala.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class 자바Function2 {

	public static void main(String[] args) {

		/**
		 * 자바의 모든 형식은 참조형 아니면 기본형에 해당한다.
		 * 하지만 제네릭 파라미터에는 참조형만 사용할 수 있다.(제네릭의 내부 구현 때문)
		 * 자바에서는 기본형을 참조형으로 변환하는 기능을 제공한다.
		 * 이를 박싱이라하고, 반대는 언박싱이라고 한다.
		 *
		 * 자바는 프로그래머가 편리하게 코드를 구현할 수 있다로고 오토박싱 이라는 기능을 제공한다.
		 */
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 300; i++) {
			list.add(i);
		}
		/**
		 * 하지만 이런 변환 과정은 비용이 소모된다.
		 * 박싱한 값은 기본형을 감싸는 래퍼며 힙에 저장된다.
		 * 따라서 박싱한 값은 메모리를 더 소비하며 기본형을 가져올 때도 메모리를 탐색하는 과정이 필요하다.
		 *
		 * 자바8에서는 기본형을 입출력으로 사용하는 상황에서 오토박싱 동작을 피할 수 있도록 함수형 인터페이스를 제공한다.
		 * 예를 들어 아래 예제에서 IntPredicate는 1000이라는 값을 박싱하지 않지만, Predicate<Integer>는 1000이라는 값을 Integer 객체로 박싱한다.
		 */

		MyIntPredicate evennumbers = (int i) -> i % 2  == 0;
		boolean a = evennumbers.test(1000); // 참(박싱 없음)

		Predicate<Integer> oddnumbers = (Integer i) -> i % 2 != 0;
		boolean b = oddnumbers.test(1000); // 거짓(박싱)

		System.out.println(a + " : " + b);

		/**
		 * 일반적으로  특정 형식을 입력으로 받는 함수형 인터페이스의 이름 앞에는 DoublePredicate, IntConsumer 처럼 형식명이 붙는다.
		 */
	}
}
