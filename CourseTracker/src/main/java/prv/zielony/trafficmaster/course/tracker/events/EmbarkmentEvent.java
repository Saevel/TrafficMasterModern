package prv.zielony.trafficmaster.course.tracker.events;

/**
 * An event marking the emarkment on a means of transport.
 */
public class EmbarkmentEvent extends Event {
    /**
     * The identifier of the embarkment stop.
     */
    private Long stopId;

    /**
     * The identifier of the course on which the user embarked.
     */
    private Long courseId;

    /**
     * Embarkment or disemabrkment
     */
    private EmbarkmentEventType type;

    //GETSET

    public Long getStopId() {
        return stopId;
    }

    public void setStopId(Long stopId) {
        this.stopId = stopId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public EmbarkmentEventType getType() {
        return type;
    }

    public void setType(EmbarkmentEventType type) {
        this.type = type;
    }
}
