package prv.zielony.trafficmaster.course.tracker.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import prv.zielony.trafficmaster.course.tracker.events.Event;

/**
 * Created by zielony on 27.01.16.
 */
@Component
public class DefaultEventsClient implements EventsClient {

    @Value("integration.bus.url")
    private String integrationBusHost;

    @Value("integration.bus.events")
    private String eventsProjectPath;

    @Autowired
    private RestTemplate restClient;

    @Override
    public <EventType extends Event> void emitEvent(EventType event) {

        String submitEventsPath = this.buildIntegrationBusPath(integrationBusHost, eventsProjectPath) + "/sink";
        restClient.postForEntity(submitEventsPath, event, Object.class);
    }

    protected String buildIntegrationBusPath(String busUrl, String projectPath) {
        StringBuilder builder = new StringBuilder();
        builder.append(busUrl);
        builder.append('/');
        builder.append(projectPath);
        return builder.toString();
    }
}
