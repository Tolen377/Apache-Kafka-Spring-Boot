package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic generateTopic() {
        Map<String, String> configurations = new HashMap<>();
        // DELETE (borra el mensaje), COMPACT (mantiene el mas actual)
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);
        // Tiempo de retencion del mensaje -DEFAULT -1
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");
        // Tamaño maximo del segmento -DEFAULT 1GB
        configurations.put(TopicConfig.SEGMENT_MS_CONFIG, "1073741824");
        // Tamaño maximo de cada mensaje -DEFAULT 1MB
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");

        return TopicBuilder.name("cifras")
                .partitions(2)
                .replicas(1)
                .configs(configurations)
                .build();
    }
}
