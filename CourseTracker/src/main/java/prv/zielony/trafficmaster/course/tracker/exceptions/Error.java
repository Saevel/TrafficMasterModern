package prv.zielony.trafficmaster.course.tracker.exceptions;

/**
 * Created by zielony on 02.02.16.
 */
public enum Error {

    UNKNOWN_ERROR(0L, "Unknown Error"),

    NO_SUCH_STOP(1L, "No such stop");

    private Long code;

    private String cause;

    Error(Long code, String cause) {
        this.code = code;
        this.cause = cause;
    }

    public Long getCode() {
        return code;
    }

    public String getCause() {
        return cause;
    }
}
