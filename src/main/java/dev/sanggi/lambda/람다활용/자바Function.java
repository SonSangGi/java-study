package dev.sanggi.lambda.람다활용;

import dev.sanggi.lambda.람다활용.Function.MyFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 자바Function {

	public static void main(String[] args) {
		/**
		 * java.util.function.Function<T, R> 인터페이스는 제네릭 형식의 T를 인수로 받아서 제네릭 형식 R 객체를 반환하는 추상메서드 apply를 정의한다.
		 * 입력을 출력으로 매핑하는 람다를 정의할 때 Function 인터페이스를 활용할 수 있다.
		 * 예를 들면 사과의 무게 정보를 추출하거나 문자열을 길이와 매핑
		 * 다음은 String 리스트를 인수로 받아 각 String의 길이를 포함하는 Integer리스트로 변환하는 map 메서드를 정의하는 예제이다.
		 */
		List<Integer> list = map(
						Arrays.asList("개발은","너무","재밌다"),
						(String s) -> s.length()
		);

		list.forEach(System.out::println);
	}

	static <T, R> List<R> map(List<T> list, MyFunction<T, R> f) {

		List<R> result = new ArrayList<>();
		list.forEach(t -> result.add(f.apply(t)));
		return result;
	}

}

