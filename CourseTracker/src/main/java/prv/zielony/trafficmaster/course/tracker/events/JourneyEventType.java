package prv.zielony.trafficmaster.course.tracker.events;

/**
 * A type of <code>JourneyEvent</code>.
 */
public enum JourneyEventType {
    /**
     * The start of the journey.
     */
    START,

    /**
     * The successful end of a journey.
     */
    END_SUCCESSFUL,

    /**
     * The failed end of a journey.
     */
    END_FAILED;
}
