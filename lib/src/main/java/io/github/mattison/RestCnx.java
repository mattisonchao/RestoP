package io.github.mattison;

import io.netty.handler.codec.haproxy.HAProxyMessage;
import io.netty.util.concurrent.Promise;
import org.apache.pulsar.broker.authentication.AuthenticationDataSource;
import org.apache.pulsar.broker.service.*;

import java.net.SocketAddress;

public class RestCnx implements TransportCnx {
    @Override
    public String getClientVersion() {
        return null;
    }

    @Override
    public SocketAddress clientAddress() {
        return null;
    }

    @Override
    public BrokerService getBrokerService() {
        return null;
    }

    @Override
    public PulsarCommandSender getCommandSender() {
        return null;
    }

    @Override
    public boolean isBatchMessageCompatibleVersion() {
        return false;
    }

    @Override
    public String getAuthRole() {
        return null;
    }

    @Override
    public AuthenticationDataSource getAuthenticationData() {
        return null;
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public boolean isWritable() {
        return false;
    }

    @Override
    public void completedSendOperation(boolean isNonPersistentTopic, int msgSize) {

    }

    @Override
    public void removedProducer(Producer producer) {

    }

    @Override
    public void closeProducer(Producer producer) {

    }

    @Override
    public void cancelPublishRateLimiting() {

    }

    @Override
    public void cancelPublishBufferLimiting() {

    }

    @Override
    public void disableCnxAutoRead() {

    }

    @Override
    public void enableCnxAutoRead() {

    }

    @Override
    public void execute(Runnable runnable) {

    }

    @Override
    public void removedConsumer(Consumer consumer) {

    }

    @Override
    public void closeConsumer(Consumer consumer) {

    }

    @Override
    public boolean isPreciseDispatcherFlowControl() {
        return false;
    }

    @Override
    public Promise<Void> newPromise() {
        return null;
    }

    @Override
    public boolean hasHAProxyMessage() {
        return false;
    }

    @Override
    public HAProxyMessage getHAProxyMessage() {
        return null;
    }

    @Override
    public String clientSourceAddress() {
        return null;
    }
}
