package dev.sanggi.lambda.람다활용.Function;

@FunctionalInterface
public interface MyFunction<T, R> {
	R apply(T t);
}

