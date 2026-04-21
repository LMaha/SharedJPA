package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_change_history_result", schema = "pls")
public class customer_change_history_result
{
    @Id
    private long customer_change_history_result_id;
    private long customer_id;
    private long rev_number;
    private String event;
    private LocalDateTime event_date;
    private String event_modified_by;
    private Long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;

    public long getCustomer_change_history_result_id()
    {
        return customer_change_history_result_id;
    }

    public void setCustomer_change_history_result_id(long customer_change_history_result_id)
    {
        this.customer_change_history_result_id = customer_change_history_result_id;
    }

    public long getCustomer_id()
    {
        return customer_id;
    }

    public void setCustomer_id(long customer_id)
    {
        this.customer_id = customer_id;
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

    public Long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(Long created_by)
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
}
