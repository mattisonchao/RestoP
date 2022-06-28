package io.github.mattison;

import org.apache.pulsar.broker.service.Consumer;
import org.apache.pulsar.broker.service.Subscription;
import org.apache.pulsar.broker.service.TransportCnx;
import org.apache.pulsar.client.api.MessageId;
import org.apache.pulsar.common.api.proto.CommandSubscribe;
import org.apache.pulsar.common.api.proto.KeySharedMeta;
import java.util.Map;

public class RestConsumerImpl extends Consumer implements RestConsumer {

    public RestConsumerImpl(Subscription subscription, CommandSubscribe.SubType subType,
                            String topicName, long consumerId, int priorityLevel, String consumerName,
                            int maxUnackedMessages, TransportCnx cnx, String appId, Map<String, String> metadata,
                            boolean readCompacted, CommandSubscribe.InitialPosition subscriptionInitialPosition,
                            KeySharedMeta keySharedMeta, MessageId startMessageId) {
        super(subscription, subType, topicName, consumerId, priorityLevel, consumerName,
                maxUnackedMessages, cnx, appId, metadata, readCompacted,
                subscriptionInitialPosition, keySharedMeta, startMessageId);
    }


}
