package dev.sanggi.lambda.람다활용;

import dev.sanggi.lambda.람다활용.Function.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class 실행어라운드패턴2 {
	public static void main(String[] args) throws IOException {
		String oneLine = processFile(br -> br.readLine());
		String towLines = processFile(br -> br.readLine() + br.readLine());

		System.out.println(oneLine);
		System.out.println(towLines);
	}

	public static String processFile(BufferedReaderProcessor p) throws IOException {

		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			return p.process(br);
		}
	}
}
