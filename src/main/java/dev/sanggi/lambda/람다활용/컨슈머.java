package dev.sanggi.lambda.람다활용;

import dev.sanggi.lambda.람다활용.Function.MyConsumer;

import java.util.Arrays;
import java.util.List;

public class 컨슈머 {
	public static void main(String[] args) {
		/**
		 * Consumer는 제네릭 T 객체를 받아서 void를 반환하는 accept라는 추상 메소드를 정의한다.
		 * T 형식의 객체를 인수르 받아서 어떤 동작을 수행하고 싶을 때 Consumer 인터페이스를 사용할 수 있다.
		 */
		forEach(
						Arrays.asList(1, 2, 3, 4, 5, 6),
						(Integer i) -> System.out.println(i)
		);  // consumer의 accept 메소드를 구현하는 람다
	}

	static <T> void forEach(List<T> list, MyConsumer<T> c) {
		for (T t : list) c.accept(t);
	}
}



