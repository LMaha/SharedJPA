package Entities.PLS30.pls_tracking;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_stops", schema = "pls_tracking")
public class order_stops {
    @Id
    private Integer stop_id;
    private Integer tracking_order_id;
    private String stop_name;
    private String stop_type;
    private Integer sequence_in_route;
    private String start_tracking_date_time;
    private String end_tracking_date_time;
    private String latitude;
    private String longitude;
    private String address1;
    private String city;
    private String state_code;
    private String postal_code;
    private String country_code;

    public Integer getStop_id() {
        return stop_id;
    }

    public void setStop_id(Integer stop_id) {
        this.stop_id = stop_id;
    }

    public Integer getTracking_order_id() {
        return tracking_order_id;
    }

    public void setTracking_order_id(Integer tracking_order_id) {
        this.tracking_order_id = tracking_order_id;
    }

    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }

    public String getStop_type() {
        return stop_type;
    }

    public void setStop_type(String stop_type) {
        this.stop_type = stop_type;
    }

    public Integer getSequence_in_route() {
        return sequence_in_route;
    }

    public void setSequence_in_route(Integer sequence_in_route) {
        this.sequence_in_route = sequence_in_route;
    }

    public String getStart_tracking_date_time() {
        return start_tracking_date_time;
    }

    public void setStart_tracking_date_time(String start_tracking_date_time) {
        this.start_tracking_date_time = start_tracking_date_time;
    }

    public String getEnd_tracking_date_time() {
        return end_tracking_date_time;
    }

    public void setEnd_tracking_date_time(String end_tracking_date_time) {
        this.end_tracking_date_time = end_tracking_date_time;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }
}
