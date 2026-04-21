package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "load_origin_destination", schema = "pls")
public class load_origin_destination
{
    @Id
    private long load_origin_destination_id;
    private long load_id;
    private String origin_company_name;
    private String origin_street_address1;
    private String origin_street_address2;
    private String origin_city;
    private String origin_state;
    private String origin_zipcode;
    private String origin_country;
    private LocalDateTime origin_pnet_date;
    private LocalDateTime origin_pnlt_date;
    private String origin_pickup_number;
    private String destination_company_name;
    private String destination_street_address1;
    private String destination_street_address2;
    private String destination_city;
    private String destination_state;
    private String destination_zipcode;
    private String destination_country;
    private LocalDateTime destination_pnet_date;
    private LocalDateTime destination_pnlt_date;
    private String destination_delivery_number;
    private BigDecimal mileage;
    private Integer duration_days;
    private Integer duration_hours;
    private Integer duration_mins;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;
    private String day_light_saving;
    private String time_zone;
    private Boolean is_origin_day_light_saving;
    private String origin_timezone;
    private Boolean is_dest_day_light_saving;
    private String dest_time_zone;
    private Long origin_selection_type;
    private Long destination_selection_type;
    private BigDecimal origin_latitude;
    private BigDecimal origin_longitude;
    private BigDecimal destination_latitude;
    private BigDecimal destination_longitude;
    private LocalTime origin_pnet_time;
    private LocalTime origin_pnlt_time;
    private LocalTime destination_pnet_time;
    private LocalTime destination_pnlt_time;
    private String origin_contact_name;
    private Long origin_contact_number;
    private String destination_contact_name;
    private Long destination_contact_number;
    private String origin_state_code;
    private String destination_state_code;
    private String origin_contact_extension;
    private String destination_contact_extension;
    private String origin_appointment_no;
    private String destination_appointment_no;
    private String origin_facility_notes;
    private String destination_facility_notes;
    private Long destination_sequence_in_route;
    private String origin_node_code;
    private String destination_node_code;
    private String origin_customer_po_number;
    private String origin_package_type;
    private String origin_part_number;
    private Long origin_quantity;
    private BigDecimal origin_weight;
    private String dest_customer_po_number;
    private String dest_package_type;
    private String dest_part_number;
    private Long dest_quantity;
    private BigDecimal dest_weight;
    private String dates_change_note;
    private String mileage_calculated_type;

    public long getLoad_origin_destination_id()
    {
        return load_origin_destination_id;
    }

    public void setLoad_origin_destination_id(long load_origin_destination_id)
    {
        this.load_origin_destination_id = load_origin_destination_id;
    }

    public long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(long load_id)
    {
        this.load_id = load_id;
    }

    public String getOrigin_company_name()
    {
        return origin_company_name;
    }

    public void setOrigin_company_name(String origin_company_name)
    {
        this.origin_company_name = origin_company_name;
    }

    public String getOrigin_street_address1()
    {
        return origin_street_address1;
    }

    public void setOrigin_street_address1(String origin_street_address1)
    {
        this.origin_street_address1 = origin_street_address1;
    }

    public String getOrigin_street_address2()
    {
        return origin_street_address2;
    }

    public void setOrigin_street_address2(String origin_street_address2)
    {
        this.origin_street_address2 = origin_street_address2;
    }

    public String getOrigin_city()
    {
        return origin_city;
    }

    public void setOrigin_city(String origin_city)
    {
        this.origin_city = origin_city;
    }

    public String getOrigin_state()
    {
        return origin_state;
    }

    public void setOrigin_state(String origin_state)
    {
        this.origin_state = origin_state;
    }

    public String getOrigin_zipcode()
    {
        return origin_zipcode;
    }

    public void setOrigin_zipcode(String origin_zipcode)
    {
        this.origin_zipcode = origin_zipcode;
    }

    public String getOrigin_country()
    {
        return origin_country;
    }

    public void setOrigin_country(String origin_country)
    {
        this.origin_country = origin_country;
    }

    public LocalDateTime getOrigin_pnet_date()
    {
        return origin_pnet_date;
    }

    public void setOrigin_pnet_date(LocalDateTime origin_pnet_date)
    {
        this.origin_pnet_date = origin_pnet_date;
    }

    public LocalDateTime getOrigin_pnlt_date()
    {
        return origin_pnlt_date;
    }

    public void setOrigin_pnlt_date(LocalDateTime origin_pnlt_date)
    {
        this.origin_pnlt_date = origin_pnlt_date;
    }

    public String getOrigin_pickup_number()
    {
        return origin_pickup_number;
    }

    public void setOrigin_pickup_number(String origin_pickup_number)
    {
        this.origin_pickup_number = origin_pickup_number;
    }

    public String getDestination_company_name()
    {
        return destination_company_name;
    }

    public void setDestination_company_name(String destination_company_name)
    {
        this.destination_company_name = destination_company_name;
    }

    public String getDestination_street_address1()
    {
        return destination_street_address1;
    }

    public void setDestination_street_address1(String destination_street_address1)
    {
        this.destination_street_address1 = destination_street_address1;
    }

    public String getDestination_street_address2()
    {
        return destination_street_address2;
    }

    public void setDestination_street_address2(String destination_street_address2)
    {
        this.destination_street_address2 = destination_street_address2;
    }

    public String getDestination_city()
    {
        return destination_city;
    }

    public void setDestination_city(String destination_city)
    {
        this.destination_city = destination_city;
    }

    public String getDestination_state()
    {
        return destination_state;
    }

    public void setDestination_state(String destination_state)
    {
        this.destination_state = destination_state;
    }

    public String getDestination_zipcode()
    {
        return destination_zipcode;
    }

    public void setDestination_zipcode(String destination_zipcode)
    {
        this.destination_zipcode = destination_zipcode;
    }

    public String getDestination_country()
    {
        return destination_country;
    }

    public void setDestination_country(String destination_country)
    {
        this.destination_country = destination_country;
    }

    public LocalDateTime getDestination_pnet_date()
    {
        return destination_pnet_date;
    }

    public void setDestination_pnet_date(LocalDateTime destination_pnet_date)
    {
        this.destination_pnet_date = destination_pnet_date;
    }

    public LocalDateTime getDestination_pnlt_date()
    {
        return destination_pnlt_date;
    }

    public void setDestination_pnlt_date(LocalDateTime destination_pnlt_date)
    {
        this.destination_pnlt_date = destination_pnlt_date;
    }

    public String getDestination_delivery_number()
    {
        return destination_delivery_number;
    }

    public void setDestination_delivery_number(String destination_delivery_number)
    {
        this.destination_delivery_number = destination_delivery_number;
    }

    public BigDecimal getMileage()
    {
        return mileage;
    }

    public void setMileage(BigDecimal mileage)
    {
        this.mileage = mileage;
    }

    public Integer getDuration_days()
    {
        return duration_days;
    }

    public void setDuration_days(Integer duration_days)
    {
        this.duration_days = duration_days;
    }

    public Integer getDuration_hours()
    {
        return duration_hours;
    }

    public void setDuration_hours(Integer duration_hours)
    {
        this.duration_hours = duration_hours;
    }

    public Integer getDuration_mins()
    {
        return duration_mins;
    }

    public void setDuration_mins(Integer duration_mins)
    {
        this.duration_mins = duration_mins;
    }

    public long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(long created_by)
    {
        this.created_by = created_by;
    }

    public LocalDateTime getCreated_date()
    {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date)
    {
        this.created_date = created_date;
    }

    public Long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(Long modified_by)
    {
        this.modified_by = modified_by;
    }

    public LocalDateTime getModified_date()
    {
        return modified_date;
    }

    public void setModified_date(LocalDateTime modified_date)
    {
        this.modified_date = modified_date;
    }

    public String getDay_light_saving()
    {
        return day_light_saving;
    }

    public void setDay_light_saving(String day_light_saving)
    {
        this.day_light_saving = day_light_saving;
    }

    public String getTime_zone()
    {
        return time_zone;
    }

    public void setTime_zone(String time_zone)
    {
        this.time_zone = time_zone;
    }

    public Boolean getIs_origin_day_light_saving()
    {
        return is_origin_day_light_saving;
    }

    public void setIs_origin_day_light_saving(Boolean is_origin_day_light_saving)
    {
        this.is_origin_day_light_saving = is_origin_day_light_saving;
    }

    public String getOrigin_timezone()
    {
        return origin_timezone;
    }

    public void setOrigin_timezone(String origin_timezone)
    {
        this.origin_timezone = origin_timezone;
    }

    public Boolean getIs_dest_day_light_saving()
    {
        return is_dest_day_light_saving;
    }

    public void setIs_dest_day_light_saving(Boolean is_dest_day_light_saving)
    {
        this.is_dest_day_light_saving = is_dest_day_light_saving;
    }

    public String getDest_time_zone()
    {
        return dest_time_zone;
    }

    public void setDest_time_zone(String dest_time_zone)
    {
        this.dest_time_zone = dest_time_zone;
    }

    public Long getOrigin_selection_type()
    {
        return origin_selection_type;
    }

    public void setOrigin_selection_type(Long origin_selection_type)
    {
        this.origin_selection_type = origin_selection_type;
    }

    public Long getDestination_selection_type()
    {
        return destination_selection_type;
    }

    public void setDestination_selection_type(Long destination_selection_type)
    {
        this.destination_selection_type = destination_selection_type;
    }

    public BigDecimal getOrigin_latitude()
    {
        return origin_latitude;
    }

    public void setOrigin_latitude(BigDecimal origin_latitude)
    {
        this.origin_latitude = origin_latitude;
    }

    public BigDecimal getOrigin_longitude()
    {
        return origin_longitude;
    }

    public void setOrigin_longitude(BigDecimal origin_longitude)
    {
        this.origin_longitude = origin_longitude;
    }

    public BigDecimal getDestination_latitude()
    {
        return destination_latitude;
    }

    public void setDestination_latitude(BigDecimal destination_latitude)
    {
        this.destination_latitude = destination_latitude;
    }

    public BigDecimal getDestination_longitude()
    {
        return destination_longitude;
    }

    public void setDestination_longitude(BigDecimal destination_longitude)
    {
        this.destination_longitude = destination_longitude;
    }

    public LocalTime getOrigin_pnet_time()
    {
        return origin_pnet_time;
    }

    public void setOrigin_pnet_time(LocalTime origin_pnet_time)
    {
        this.origin_pnet_time = origin_pnet_time;
    }

    public LocalTime getOrigin_pnlt_time()
    {
        return origin_pnlt_time;
    }

    public void setOrigin_pnlt_time(LocalTime origin_pnlt_time)
    {
        this.origin_pnlt_time = origin_pnlt_time;
    }

    public LocalTime getDestination_pnet_time()
    {
        return destination_pnet_time;
    }

    public void setDestination_pnet_time(LocalTime destination_pnet_time)
    {
        this.destination_pnet_time = destination_pnet_time;
    }

    public LocalTime getDestination_pnlt_time()
    {
        return destination_pnlt_time;
    }

    public void setDestination_pnlt_time(LocalTime destination_pnlt_time)
    {
        this.destination_pnlt_time = destination_pnlt_time;
    }

    public String getOrigin_contact_name()
    {
        return origin_contact_name;
    }

    public void setOrigin_contact_name(String origin_contact_name)
    {
        this.origin_contact_name = origin_contact_name;
    }

    public Long getOrigin_contact_number()
    {
        return origin_contact_number;
    }

    public void setOrigin_contact_number(Long origin_contact_number)
    {
        this.origin_contact_number = origin_contact_number;
    }

    public String getDestination_contact_name()
    {
        return destination_contact_name;
    }

    public void setDestination_contact_name(String destination_contact_name)
    {
        this.destination_contact_name = destination_contact_name;
    }

    public Long getDestination_contact_number()
    {
        return destination_contact_number;
    }

    public void setDestination_contact_number(Long destination_contact_number)
    {
        this.destination_contact_number = destination_contact_number;
    }

    public String getOrigin_state_code()
    {
        return origin_state_code;
    }

    public void setOrigin_state_code(String origin_state_code)
    {
        this.origin_state_code = origin_state_code;
    }

    public String getDestination_state_code()
    {
        return destination_state_code;
    }

    public void setDestination_state_code(String destination_state_code)
    {
        this.destination_state_code = destination_state_code;
    }

    public String getOrigin_contact_extension()
    {
        return origin_contact_extension;
    }

    public void setOrigin_contact_extension(String origin_contact_extension)
    {
        this.origin_contact_extension = origin_contact_extension;
    }

    public String getDestination_contact_extension()
    {
        return destination_contact_extension;
    }

    public void setDestination_contact_extension(String destination_contact_extension)
    {
        this.destination_contact_extension = destination_contact_extension;
    }

    public String getOrigin_appointment_no()
    {
        return origin_appointment_no;
    }

    public void setOrigin_appointment_no(String origin_appointment_no)
    {
        this.origin_appointment_no = origin_appointment_no;
    }

    public String getDestination_appointment_no()
    {
        return destination_appointment_no;
    }

    public void setDestination_appointment_no(String destination_appointment_no)
    {
        this.destination_appointment_no = destination_appointment_no;
    }

    public String getOrigin_facility_notes()
    {
        return origin_facility_notes;
    }

    public void setOrigin_facility_notes(String origin_facility_notes)
    {
        this.origin_facility_notes = origin_facility_notes;
    }

    public String getDestination_facility_notes()
    {
        return destination_facility_notes;
    }

    public void setDestination_facility_notes(String destination_facility_notes)
    {
        this.destination_facility_notes = destination_facility_notes;
    }

    public Long getDestination_sequence_in_route()
    {
        return destination_sequence_in_route;
    }

    public void setDestination_sequence_in_route(Long destination_sequence_in_route)
    {
        this.destination_sequence_in_route = destination_sequence_in_route;
    }

    public String getOrigin_node_code()
    {
        return origin_node_code;
    }

    public void setOrigin_node_code(String origin_node_code)
    {
        this.origin_node_code = origin_node_code;
    }

    public String getDestination_node_code()
    {
        return destination_node_code;
    }

    public void setDestination_node_code(String destination_node_code)
    {
        this.destination_node_code = destination_node_code;
    }

    public String getOrigin_customer_po_number()
    {
        return origin_customer_po_number;
    }

    public void setOrigin_customer_po_number(String origin_customer_po_number)
    {
        this.origin_customer_po_number = origin_customer_po_number;
    }

    public String getOrigin_package_type()
    {
        return origin_package_type;
    }

    public void setOrigin_package_type(String origin_package_type)
    {
        this.origin_package_type = origin_package_type;
    }

    public String getOrigin_part_number()
    {
        return origin_part_number;
    }

    public void setOrigin_part_number(String origin_part_number)
    {
        this.origin_part_number = origin_part_number;
    }

    public Long getOrigin_quantity()
    {
        return origin_quantity;
    }

    public void setOrigin_quantity(Long origin_quantity)
    {
        this.origin_quantity = origin_quantity;
    }

    public BigDecimal getOrigin_weight()
    {
        return origin_weight;
    }

    public void setOrigin_weight(BigDecimal origin_weight)
    {
        this.origin_weight = origin_weight;
    }

    public String getDest_customer_po_number()
    {
        return dest_customer_po_number;
    }

    public void setDest_customer_po_number(String dest_customer_po_number)
    {
        this.dest_customer_po_number = dest_customer_po_number;
    }

    public String getDest_package_type()
    {
        return dest_package_type;
    }

    public void setDest_package_type(String dest_package_type)
    {
        this.dest_package_type = dest_package_type;
    }

    public String getDest_part_number()
    {
        return dest_part_number;
    }

    public void setDest_part_number(String dest_part_number)
    {
        this.dest_part_number = dest_part_number;
    }

    public Long getDest_quantity()
    {
        return dest_quantity;
    }

    public void setDest_quantity(Long dest_quantity)
    {
        this.dest_quantity = dest_quantity;
    }

    public BigDecimal getDest_weight()
    {
        return dest_weight;
    }

    public void setDest_weight(BigDecimal dest_weight)
    {
        this.dest_weight = dest_weight;
    }

    public String getDates_change_note()
    {
        return dates_change_note;
    }

    public void setDates_change_note(String dates_change_note)
    {
        this.dates_change_note = dates_change_note;
    }

    public String getMileage_calculated_type()
    {
        return mileage_calculated_type;
    }

    public void setMileage_calculated_type(String mileage_calculated_type)
    {
        this.mileage_calculated_type = mileage_calculated_type;
    }
}
