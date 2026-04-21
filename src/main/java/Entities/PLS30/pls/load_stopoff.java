package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_stopoff", schema = "pls")
public class load_stopoff
{
    @Id
    private long load_stopoff_id;
    private long load_id;
    private String stopoff_company_name;
    private String stopoff_street_address1;
    private String stopoff_street_address2;
    private String stopoff_city;
    private String stopoff_state;
    private String stopoff_zipcode;
    private String stopoff_country;
    private String stopoff_load_action;
    private String stopoff_pickup_number;
    private LocalDateTime net_date;
    private LocalDateTime nlt_date;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;
    private Boolean is_day_light_saving;
    private String time_zone;
    private Long stopoff_selection_type;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Time net_time;
    private Time nlt_time;
    private String stopoff_contact_name;
    private Long stopoff_contact_number;
    private String stopoff_state_code;
    private String stopoff_contact_extension;
    private String stopoff_appointment_no;
    private String facility_notes;
    private Long sequence_in_route;
    private String node_code;
    private String customer_po_number;
    private String package_type;
    private String part_number;
    private Long quantity;
    private BigDecimal weight;

    public long getLoad_stopoff_id()
    {
        return load_stopoff_id;
    }

    public void setLoad_stopoff_id(long load_stopoff_id)
    {
        this.load_stopoff_id = load_stopoff_id;
    }

    public long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(long load_id)
    {
        this.load_id = load_id;
    }

    public String getStopoff_company_name()
    {
        return stopoff_company_name;
    }

    public void setStopoff_company_name(String stopoff_company_name)
    {
        this.stopoff_company_name = stopoff_company_name;
    }

    public String getStopoff_street_address1()
    {
        return stopoff_street_address1;
    }

    public void setStopoff_street_address1(String stopoff_street_address1)
    {
        this.stopoff_street_address1 = stopoff_street_address1;
    }

    public String getStopoff_street_address2()
    {
        return stopoff_street_address2;
    }

    public void setStopoff_street_address2(String stopoff_street_address2)
    {
        this.stopoff_street_address2 = stopoff_street_address2;
    }

    public String getStopoff_city()
    {
        return stopoff_city;
    }

    public void setStopoff_city(String stopoff_city)
    {
        this.stopoff_city = stopoff_city;
    }

    public String getStopoff_state()
    {
        return stopoff_state;
    }

    public void setStopoff_state(String stopoff_state)
    {
        this.stopoff_state = stopoff_state;
    }

    public String getStopoff_zipcode()
    {
        return stopoff_zipcode;
    }

    public void setStopoff_zipcode(String stopoff_zipcode)
    {
        this.stopoff_zipcode = stopoff_zipcode;
    }

    public String getStopoff_country()
    {
        return stopoff_country;
    }

    public void setStopoff_country(String stopoff_country)
    {
        this.stopoff_country = stopoff_country;
    }

    public String getStopoff_load_action()
    {
        return stopoff_load_action;
    }

    public void setStopoff_load_action(String stopoff_load_action)
    {
        this.stopoff_load_action = stopoff_load_action;
    }

    public String getStopoff_pickup_number()
    {
        return stopoff_pickup_number;
    }

    public void setStopoff_pickup_number(String stopoff_pickup_number)
    {
        this.stopoff_pickup_number = stopoff_pickup_number;
    }

    public LocalDateTime getNet_date()
    {
        return net_date;
    }

    public void setNet_date(LocalDateTime net_date)
    {
        this.net_date = net_date;
    }

    public LocalDateTime getNlt_date()
    {
        return nlt_date;
    }

    public void setNlt_date(LocalDateTime nlt_date)
    {
        this.nlt_date = nlt_date;
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

    public Boolean getIs_day_light_saving()
    {
        return is_day_light_saving;
    }

    public void setIs_day_light_saving(Boolean is_day_light_saving)
    {
        this.is_day_light_saving = is_day_light_saving;
    }

    public String getTime_zone()
    {
        return time_zone;
    }

    public void setTime_zone(String time_zone)
    {
        this.time_zone = time_zone;
    }

    public Long getStopoff_selection_type()
    {
        return stopoff_selection_type;
    }

    public void setStopoff_selection_type(Long stopoff_selection_type)
    {
        this.stopoff_selection_type = stopoff_selection_type;
    }

    public BigDecimal getLongitude()
    {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude)
    {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude()
    {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude)
    {
        this.latitude = latitude;
    }

    public Time getNet_time()
    {
        return net_time;
    }

    public void setNet_time(Time net_time)
    {
        this.net_time = net_time;
    }

    public Time getNlt_time()
    {
        return nlt_time;
    }

    public void setNlt_time(Time nlt_time)
    {
        this.nlt_time = nlt_time;
    }

    public String getStopoff_contact_name()
    {
        return stopoff_contact_name;
    }

    public void setStopoff_contact_name(String stopoff_contact_name)
    {
        this.stopoff_contact_name = stopoff_contact_name;
    }

    public Long getStopoff_contact_number()
    {
        return stopoff_contact_number;
    }

    public void setStopoff_contact_number(Long stopoff_contact_number)
    {
        this.stopoff_contact_number = stopoff_contact_number;
    }

    public String getStopoff_state_code()
    {
        return stopoff_state_code;
    }

    public void setStopoff_state_code(String stopoff_state_code)
    {
        this.stopoff_state_code = stopoff_state_code;
    }

    public String getStopoff_contact_extension()
    {
        return stopoff_contact_extension;
    }

    public void setStopoff_contact_extension(String stopoff_contact_extension)
    {
        this.stopoff_contact_extension = stopoff_contact_extension;
    }

    public String getStopoff_appointment_no()
    {
        return stopoff_appointment_no;
    }

    public void setStopoff_appointment_no(String stopoff_appointment_no)
    {
        this.stopoff_appointment_no = stopoff_appointment_no;
    }

    public String getFacility_notes()
    {
        return facility_notes;
    }

    public void setFacility_notes(String facility_notes)
    {
        this.facility_notes = facility_notes;
    }

    public Long getSequence_in_route()
    {
        return sequence_in_route;
    }

    public void setSequence_in_route(Long sequence_in_route)
    {
        this.sequence_in_route = sequence_in_route;
    }

    public String getNode_code()
    {
        return node_code;
    }

    public void setNode_code(String node_code)
    {
        this.node_code = node_code;
    }

    public String getCustomer_po_number()
    {
        return customer_po_number;
    }

    public void setCustomer_po_number(String customer_po_number)
    {
        this.customer_po_number = customer_po_number;
    }

    public String getPackage_type()
    {
        return package_type;
    }

    public void setPackage_type(String package_type)
    {
        this.package_type = package_type;
    }

    public String getPart_number()
    {
        return part_number;
    }

    public void setPart_number(String part_number)
    {
        this.part_number = part_number;
    }

    public Long getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Long quantity)
    {
        this.quantity = quantity;
    }

    public BigDecimal getWeight()
    {
        return weight;
    }

    public void setWeight(BigDecimal weight)
    {
        this.weight = weight;
    }
}
