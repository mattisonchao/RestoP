package io.github.mattison;

import org.apache.pulsar.broker.PulsarService;
import org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletWithPulsarService;
import org.apache.pulsar.common.configuration.PulsarConfiguration;
import org.eclipse.jetty.servlet.ServletHolder;

public class RestAdditionalServlet implements AdditionalServletWithPulsarService {

    @Override
    public void setPulsarService(PulsarService pulsarService) {

    }

    @Override
    public void loadConfig(PulsarConfiguration pulsarConfiguration) {

    }

    @Override
    public String getBasePath() {
        return null;
    }

    @Override
    public ServletHolder getServletHolder() {
        return null;
    }

    @Override
    public void close() {

    }
}
