package dev.sanggi.codingtest.lambda.람다활용.Function;

@FunctionalInterface
public interface MyFunction<T, R> {
	R apply(T t);
}

