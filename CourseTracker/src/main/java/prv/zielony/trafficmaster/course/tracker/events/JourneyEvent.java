package prv.zielony.trafficmaster.course.tracker.events;

import prv.zielony.trafficmaster.course.tracker.model.Location;

import java.util.Date;

/**
 * An event marking the start of the journey
 */
public class JourneyEvent extends Event {
    /**
     * The location of the start of the journey.
     */
    private Location location;

    /**
     * The type of <coe>JounreyEvent</coe>
     */
    private JourneyEventType type;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public JourneyEventType getType() {
        return type;
    }

    public void setType(JourneyEventType type) {
        this.type = type;
    }
}