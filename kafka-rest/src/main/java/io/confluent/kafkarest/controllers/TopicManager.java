package io.confluent.kafkarest.controllers;

import io.confluent.kafkarest.entities.Topic;
import io.confluent.kafkarest.entities.TopicInfo;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * A service to manage Kafka {@link Topic Topics}.
 */
public interface TopicManager {
    /**
    Returns the list of Kafka {@link Topic Topics} known.
     */
    CompletableFuture<List<Topic>> listTopics(String clusterId);

    CompletableFuture<List<Topic>> getTopic(String clusterId, String topicName);
}