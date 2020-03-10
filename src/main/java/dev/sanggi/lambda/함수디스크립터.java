package dev.sanggi.lambda;

import java.util.concurrent.Callable;

public class 함수디스크립터 {
	public static void main(String[] args) throws Exception {

		process(() -> System.out.println("This is awesome!!"));
		// 위 코드 실행 시 sout이 출력된다. sout은 인수가 없으며 void를 반환하는 람다 표현식이다. 이는 Runnble의 메서드 시그니처와 같다.

		process(() -> {}); // 유효한 람다 표현식
		System.out.println(fetch().call()); // fetch는 유효한 람다 표현식이다.
		// Predicate<String> p = (String a) -> a.length();
		/* 위의 코드 Predicate<String>의 시그니처는 (String) -> boolean이다.
		 하지만 위는 (String) -> Integer이기 때문에 유효한 람다 표현식이 아니다.*/
	}

	public static void process(Runnable r) {
		r.run();
	}

	public static Callable<String> fetch() {
		return () -> "Tricky example ;-)"; // Callable<String> 메서드의 시그니처는 () -> String이 된다. 시그니처가 일치하기 때문에 올바른 람다이다.
	}
}

