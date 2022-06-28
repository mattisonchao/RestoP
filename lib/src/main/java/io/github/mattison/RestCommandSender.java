package io.github.mattison;

import io.netty.util.concurrent.Future;
import org.apache.bookkeeper.mledger.Entry;
import org.apache.pulsar.broker.service.*;
import org.apache.pulsar.common.api.proto.CommandLookupTopicResponse;
import org.apache.pulsar.common.api.proto.ServerError;
import org.apache.pulsar.common.protocol.schema.SchemaVersion;
import org.apache.pulsar.common.schema.SchemaInfo;

import java.util.List;
import java.util.Optional;

public class RestCommandSender implements PulsarCommandSender {
    @Override
    public void sendPartitionMetadataResponse(ServerError error, String errorMsg, long requestId) {

    }

    @Override
    public void sendPartitionMetadataResponse(int partitions, long requestId) {

    }

    @Override
    public void sendSuccessResponse(long requestId) {

    }

    @Override
    public void sendErrorResponse(long requestId, ServerError error, String message) {

    }

    @Override
    public void sendProducerSuccessResponse(long requestId, String producerName, SchemaVersion schemaVersion) {

    }

    @Override
    public void sendProducerSuccessResponse(long requestId, String producerName, long lastSequenceId, SchemaVersion schemaVersion, Optional<Long> topicEpoch, boolean isProducerReady) {

    }

    @Override
    public void sendSendReceiptResponse(long producerId, long sequenceId, long highestId, long ledgerId, long entryId) {

    }

    @Override
    public void sendSendError(long producerId, long sequenceId, ServerError error, String errorMsg) {

    }

    @Override
    public void sendGetTopicsOfNamespaceResponse(List<String> topics, long requestId) {

    }

    @Override
    public void sendGetSchemaResponse(long requestId, SchemaInfo schema, SchemaVersion version) {

    }

    @Override
    public void sendGetSchemaErrorResponse(long requestId, ServerError error, String errorMessage) {

    }

    @Override
    public void sendGetOrCreateSchemaResponse(long requestId, SchemaVersion schemaVersion) {

    }

    @Override
    public void sendGetOrCreateSchemaErrorResponse(long requestId, ServerError error, String errorMessage) {

    }

    @Override
    public void sendConnectedResponse(int clientProtocolVersion, int maxMessageSize) {

    }

    @Override
    public void sendLookupResponse(String brokerServiceUrl, String brokerServiceUrlTls, boolean authoritative, CommandLookupTopicResponse.LookupType response, long requestId, boolean proxyThroughServiceUrl) {

    }

    @Override
    public void sendLookupResponse(ServerError error, String errorMsg, long requestId) {

    }

    @Override
    public void sendActiveConsumerChange(long consumerId, boolean isActive) {

    }

    @Override
    public void sendSuccess(long requestId) {

    }

    @Override
    public void sendError(long requestId, ServerError error, String message) {

    }

    @Override
    public void sendReachedEndOfTopic(long consumerId) {

    }

    @Override
    public Future<Void> sendMessagesToConsumer(long consumerId, String topicName, Subscription subscription, int partitionIdx, List<Entry> entries, EntryBatchSizes batchSizes, EntryBatchIndexesAcks batchIndexesAcks, RedeliveryTracker redeliveryTracker) {
        return null;
    }

    @Override
    public void sendTcClientConnectResponse(long requestId, ServerError error, String message) {

    }

    @Override
    public void sendTcClientConnectResponse(long requestId) {

    }
}
