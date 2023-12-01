package br.com.kafkaproducer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@EnableKafka
@SpringBootApplication
public class KafkaproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaproducerApplication.class, args);
	}

}
