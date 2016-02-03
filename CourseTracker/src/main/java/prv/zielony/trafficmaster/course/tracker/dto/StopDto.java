package prv.zielony.trafficmaster.course.tracker.dto;

import prv.zielony.trafficmaster.course.tracker.model.Location;

import java.time.LocalDateTime;

/**
 * Created by zielony on 03.02.16.
 */
public class StopDto {

    private Long stopId;

    private Long stopName;

    private Location location;

    private LocalDateTime arrival;

    public StopDto() {
    }

    public StopDto(Long stopId, Long stopName, LocalDateTime arrival) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.arrival = arrival;
    }

    public Long getStopId() {
        return stopId;
    }

    public void setStopId(Long stopId) {
        this.stopId = stopId;
    }

    public Long getStopName() {
        return stopName;
    }

    public void setStopName(Long stopName) {
        this.stopName = stopName;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalDateTime arrival) {
        this.arrival = arrival;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
