package dev.sanggi.lambda.람다활용.Function;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {
	String process(BufferedReader br) throws IOException;
}