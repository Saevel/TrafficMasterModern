package prv.zielony.trafficmaster.course.tracker.services;

import prv.zielony.trafficmaster.course.tracker.events.Event;

/**
 * Created by zielony on 27.01.16.
 */
public interface EventProcessingService {

    public<EventType extends Event> void saveEvent(EventType event);
}
