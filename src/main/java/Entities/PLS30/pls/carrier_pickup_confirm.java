package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "carrier_pickup_confirm", schema = "pls")
public class carrier_pickup_confirm
{
    @Id
    private long carrier_pickup_confirm_id;
    private long carrier_id;
    private Long load_id;
    private Long load_origin_destination_id;
    private Long load_stopoff_id;
    private String pickup_type;
    private String pickup_bol;
    private LocalDateTime pickup_date;
    private String timezone;
    private String pickup_confirmation;
    private String pickup_notes;
    private String pickup_notes_internal;
    private LocalDateTime created_date;
    private long created_by;
    private LocalDateTime modified_date;
    private Long modified_by;
    private Time pnlt_time;

    public long getCarrier_pickup_confirm_id()
    {
        return carrier_pickup_confirm_id;
    }

    public void setCarrier_pickup_confirm_id(long carrier_pickup_confirm_id)
    {
        this.carrier_pickup_confirm_id = carrier_pickup_confirm_id;
    }

    public long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(long carrier_id)
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

    public Long getLoad_origin_destination_id()
    {
        return load_origin_destination_id;
    }

    public void setLoad_origin_destination_id(Long load_origin_destination_id)
    {
        this.load_origin_destination_id = load_origin_destination_id;
    }

    public Long getLoad_stopoff_id()
    {
        return load_stopoff_id;
    }

    public void setLoad_stopoff_id(Long load_stopoff_id)
    {
        this.load_stopoff_id = load_stopoff_id;
    }

    public String getPickup_type()
    {
        return pickup_type;
    }

    public void setPickup_type(String pickup_type)
    {
        this.pickup_type = pickup_type;
    }

    public String getPickup_bol()
    {
        return pickup_bol;
    }

    public void setPickup_bol(String pickup_bol)
    {
        this.pickup_bol = pickup_bol;
    }

    public LocalDateTime getPickup_date()
    {
        return pickup_date;
    }

    public void setPickup_date(LocalDateTime pickup_date)
    {
        this.pickup_date = pickup_date;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public String getPickup_confirmation()
    {
        return pickup_confirmation;
    }

    public void setPickup_confirmation(String pickup_confirmation)
    {
        this.pickup_confirmation = pickup_confirmation;
    }

    public String getPickup_notes()
    {
        return pickup_notes;
    }

    public void setPickup_notes(String pickup_notes)
    {
        this.pickup_notes = pickup_notes;
    }

    public String getPickup_notes_internal()
    {
        return pickup_notes_internal;
    }

    public void setPickup_notes_internal(String pickup_notes_internal)
    {
        this.pickup_notes_internal = pickup_notes_internal;
    }

    public LocalDateTime getCreated_date()
    {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date)
    {
        this.created_date = created_date;
    }

    public long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(long created_by)
    {
        this.created_by = created_by;
    }

    public LocalDateTime getModified_date()
    {
        return modified_date;
    }

    public void setModified_date(LocalDateTime modified_date)
    {
        this.modified_date = modified_date;
    }

    public Long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(Long modified_by)
    {
        this.modified_by = modified_by;
    }

    public Time getPnlt_time()
    {
        return pnlt_time;
    }

    public void setPnlt_time(Time pnlt_time)
    {
        this.pnlt_time = pnlt_time;
    }
}
