package prv.zielony.trafficmaster.course.tracker.dto;

/**
 * Created by zielony on 02.02.16.
 */
public class FaultDto {

    private String message;

    private Long code;

    public FaultDto() {
    }

    public FaultDto(prv.zielony.trafficmaster.course.tracker.exceptions.Error error) {
        this.message = error.getCause();
        this.code = error.getCode();
    }


}
