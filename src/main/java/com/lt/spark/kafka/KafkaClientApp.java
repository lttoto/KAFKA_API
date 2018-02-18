package com.lt.spark.kafka;

/**
 * Created by taoshiliu on 2018/2/18.
 */
public class KafkaClientApp {

    public static void main(String[] args) {
        new KafkaProducer(KafkaProperties.TOPIC).start();
        new KafkaConsumer(KafkaProperties.TOPIC).start();
    }

}
