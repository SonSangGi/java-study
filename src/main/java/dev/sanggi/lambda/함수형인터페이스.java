package dev.sanggi.lambda;

public class 함수형인터페이스 {

	public static void main(String[] args) {
		// 람다 사용
		Runnable r1 = () -> System.out.println("Hello World1");

		// 익명 클래스 사용
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World2");
			}
		};

		process(r1);
		process(r2);
		process(() -> System.out.println("Hello World3")); // 직접 전달된 람다 표현식으로 Hello World 출력
	}

	public static void process(Runnable r) {
		r.run();
	}
}
