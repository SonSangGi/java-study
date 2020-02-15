package dev.sanggi.codingtest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class ArrayTest {

	public static void main(String[] args) {

		List<Review> reviews = new ArrayList<>();
		reviews.addAll(Arrays
				.asList(new Review(1, 1, 33),
						new Review(4, 1, 33),
						new Review(5, 1, 33)));
		/*************************************************************************************************/

		int[] tempStar = new int[5];

		reviews.forEach(r -> tempStar[r.getStar() - 1] = r.getStar());

		for (int i = 0; i < tempStar.length; i++) {
			if (tempStar[i] == 0) reviews.add(new Review(i + 1, 0, 0));
		}

		/*************************************************************************************************/
		reviews.sort((o1, o2) -> {
			if (o1.getStar() == o2.getStar()) return 0;
			else if (o1.getStar() > o2.getStar()) return 1;
			else return -1;
		});

		reviews.forEach(r -> log.info("" + r));
	}

	@Data
	@AllArgsConstructor
	public static class Review {
		private int star;
		private int count;
		private double avg;
	}

}
