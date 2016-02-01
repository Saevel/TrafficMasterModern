package prv.zielony.trafficmaster.course.tracker.remote;

import prv.zielony.trafficmaster.course.tracker.events.Event;

/**
 * Created by zielony on 27.01.16.
 */
public interface EventsClient {

    public<EventType extends Event> void emitEvent(EventType event);
}
