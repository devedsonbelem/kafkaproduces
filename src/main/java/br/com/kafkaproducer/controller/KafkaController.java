package br.com.kafkaproducer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kafkaproducer.producer.TopicProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	private final TopicProducer topicProducer;

	public KafkaController(TopicProducer topicProducer) {
		super();
		this.topicProducer = topicProducer;
	}

	@GetMapping(value = "/send/{msg}")
	public ResponseEntity<?> send(@PathVariable("msg") String msg) {
		String teste = "Mensagem de teste enviada ao topico ==> ";
		topicProducer.send(teste + msg);
		Map<String, String> mapa = new HashMap<String, String>();
		mapa.put("mensagem ", msg);
		return ResponseEntity.status(200).body(mapa);
	}

}