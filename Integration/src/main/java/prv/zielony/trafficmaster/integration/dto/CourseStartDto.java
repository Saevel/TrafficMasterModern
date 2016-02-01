package prv.zielony.trafficmaster.integration.dto;

import java.util.Date;

/**
 * Created by zielony on 29.01.16.
 */
public class CourseStartDto {

    private Date timestamp;

    private Long lineId;

    private Long userId;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
