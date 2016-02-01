package prv.zielony.trafficmaster.course.tracker.events;

import java.util.Date;

/**
 * A generic event.
 */
public class Event {
    /**
     * The date and time when the event occurred.
     */
    private Date timestamp;

    //GETSET

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
