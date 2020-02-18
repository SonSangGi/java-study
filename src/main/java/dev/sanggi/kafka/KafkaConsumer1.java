package dev.sanggi.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
public class KafkaConsumer1 {
	public static void main(String[] args) {

		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092"); // 브로커 리스트 정의
		props.put("group.id", "mqnic-group"); // 그룹 아이디 지정
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("enable.auto.commit", "true"); // 자동 커밋
		props.put("auto.offset.reset", "latest"); // earliest: 토픽의 처음부터 가져옴, latest 토픽의 마지막부터 가져옴 default

		log.info("test");

		KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);  // 컨슈머 생성
		consumer.subscribe(Arrays.asList("mqnic-topic")); // 토픽 구독, 리스트형태로 여러개의 토픽 구독 가능
		try {
			while (true) {
				ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100000));
				records.forEach(r ->
						System.out.printf("Topic: %s, Partition: %s, Offset: %d, Key: %s, Value: %s\n"
								, r.topic(), r.partition(), r.offset(), r.key(), r.value()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			consumer.close();
		}
	}
}
