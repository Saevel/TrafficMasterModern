package prv.zielony.trafficmaster.course.tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prv.zielony.trafficmaster.course.tracker.events.Event;
import prv.zielony.trafficmaster.course.tracker.remote.EventsClient;

/**
 * Created by zielony on 27.01.16.
 */
@Service
public class DefaultEventProcessingService implements EventProcessingService {

    @Autowired
    private EventsClient eventsClient;

    @Override
    public <EventType extends Event> void saveEvent(EventType event) {
        eventsClient.emitEvent(event);
    }
}
