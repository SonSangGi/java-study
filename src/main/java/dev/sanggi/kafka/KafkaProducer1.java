package dev.sanggi.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaProducer1 {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.put("bootstrap.servers","localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		Producer<String ,String> producer = new KafkaProducer<>(props);
		producer.send(new ProducerRecord<>("mqnic-topic","자바에서 보냅니다."));
		producer.close();
	}
}
