package br.com.daian.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction<T> {
    void consume(final ConsumerRecord<String, T> record);
}
