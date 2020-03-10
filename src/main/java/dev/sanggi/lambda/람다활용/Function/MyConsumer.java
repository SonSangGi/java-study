package dev.sanggi.lambda.람다활용.Function;

@FunctionalInterface
public interface MyConsumer<T> {
	void accept(T t);
}