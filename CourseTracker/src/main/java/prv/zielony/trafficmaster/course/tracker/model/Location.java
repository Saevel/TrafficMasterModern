package prv.zielony.trafficmaster.course.tracker.model;

/**
 * A physical location.
 */
public class Location {
    /**
     * The location's longitude.
     */
    private double longitude;

    /**
     * The location's latitude.
     */
    private double latitude;

    /**
     * The location's name.
     */
    private String name;

    //GETSET

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
