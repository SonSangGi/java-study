package dev.sanggi.lambda.람다활용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 기타기능 {
	public static void main(String[] args) {

		// 두 값 조합
		IntBinaryOperator i = (int x, int y) -> x * y;
		int a = i.applyAsInt(10, 20);

		// 두 객체 비교
		Comparator<String> comparator = String::compareTo;
		comparator.compare("Hi", "Bye");

		// 불리언 표현
		Predicate<List<Integer>> predicate = List::isEmpty;
		predicate.test(Arrays.asList());

		// 객체 생성
		Supplier<String> stringSupplier = String::new;
		stringSupplier.get();

		// 객체에서 소비
		Consumer<List<String>> consumer = (List<String> list) -> list.forEach(System.out::println);
		consumer.accept(Arrays.asList("Hello", "World!"));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 3, 5, 5, 667,2 , 4);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
