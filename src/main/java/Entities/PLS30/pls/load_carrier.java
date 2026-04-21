package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "load_carrier", schema = "pls")
public class load_carrier
{
    @Id
    private long load_carrier_id;
    private Long carrier_id;
    private Long load_id;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;
    private LocalDateTime date_carrier;
    private Long user_id;
    private Boolean is_active;
    private LocalTime time_carrier;
    private Long drivers_phone;
    private Long carrier_contact_id;
    private Long carrier_issue_reason_id;
    private BigDecimal adjustment_id;
    private String carrier_issue_reason_notes;
    private String truck_number;

    public long getLoad_carrier_id()
    {
        return load_carrier_id;
    }

    public void setLoad_carrier_id(long load_carrier_id)
    {
        this.load_carrier_id = load_carrier_id;
    }

    public Long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(Long carrier_id)
    {
        this.carrier_id = carrier_id;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
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

    public LocalDateTime getDate_carrier()
    {
        return date_carrier;
    }

    public void setDate_carrier(LocalDateTime date_carrier)
    {
        this.date_carrier = date_carrier;
    }

    public Long getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Long user_id)
    {
        this.user_id = user_id;
    }

    public Boolean getIs_active()
    {
        return is_active;
    }

    public void setIs_active(Boolean is_active)
    {
        this.is_active = is_active;
    }

    public LocalTime getTime_carrier()
    {
        return time_carrier;
    }

    public void setTime_carrier(LocalTime time_carrier)
    {
        this.time_carrier = time_carrier;
    }

    public Long getDrivers_phone()
    {
        return drivers_phone;
    }

    public void setDrivers_phone(Long drivers_phone)
    {
        this.drivers_phone = drivers_phone;
    }

    public Long getCarrier_contact_id()
    {
        return carrier_contact_id;
    }

    public void setCarrier_contact_id(Long carrier_contact_id)
    {
        this.carrier_contact_id = carrier_contact_id;
    }

    public Long getCarrier_issue_reason_id()
    {
        return carrier_issue_reason_id;
    }

    public void setCarrier_issue_reason_id(Long carrier_issue_reason_id)
    {
        this.carrier_issue_reason_id = carrier_issue_reason_id;
    }

    public BigDecimal getAdjustment_id()
    {
        return adjustment_id;
    }

    public void setAdjustment_id(BigDecimal adjustment_id)
    {
        this.adjustment_id = adjustment_id;
    }

    public String getCarrier_issue_reason_notes()
    {
        return carrier_issue_reason_notes;
    }

    public void setCarrier_issue_reason_notes(String carrier_issue_reason_notes)
    {
        this.carrier_issue_reason_notes = carrier_issue_reason_notes;
    }

    public String getTruck_number()
    {
        return truck_number;
    }

    public void setTruck_number(String truck_number)
    {
        this.truck_number = truck_number;
    }
}
