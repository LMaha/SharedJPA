package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "carrier_change_history_result", schema = "pls")
public class carrier_change_history_result
{
    @Id
    private long carrier_change_history_result_id;
    private long carrier_id;
    private long rev_number;
    private String event;
    private LocalDateTime event_date;
    private String event_modified_by;
    private LocalDateTime created_date;
    private long created_by;
    private long modified_by;
    private LocalDateTime modified_date;
    private String reason_change_note;

    public long getCarrier_change_history_result_id()
    {
        return carrier_change_history_result_id;
    }

    public void setCarrier_change_history_result_id(long carrier_change_history_result_id)
    {
        this.carrier_change_history_result_id = carrier_change_history_result_id;
    }

    public long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(long carrier_id)
    {
        this.carrier_id = carrier_id;
    }

    public long getRev_number()
    {
        return rev_number;
    }

    public void setRev_number(long rev_number)
    {
        this.rev_number = rev_number;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
    }

    public LocalDateTime getEvent_date()
    {
        return event_date;
    }

    public void setEvent_date(LocalDateTime event_date)
    {
        this.event_date = event_date;
    }

    public String getEvent_modified_by()
    {
        return event_modified_by;
    }

    public void setEvent_modified_by(String event_modified_by)
    {
        this.event_modified_by = event_modified_by;
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

    public long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(long modified_by)
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

    public String getReason_change_note()
    {
        return reason_change_note;
    }

    public void setReason_change_note(String reason_change_note)
    {
        this.reason_change_note = reason_change_note;
    }
}
