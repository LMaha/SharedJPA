package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "required_field_audit_history", schema = "pls")
public class required_field_audit_history
{
    @Id
    private Long required_field_audit_history_id;
    private Long load_id;
    private String event;
    private Long created_by;
    private LocalDateTime created_date;
    private long rev_id;

    public Long getRequired_field_audit_history_id()
    {
        return required_field_audit_history_id;
    }

    public void setRequired_field_audit_history_id(Long required_field_audit_history_id)
    {
        this.required_field_audit_history_id = required_field_audit_history_id;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String event)
    {
        this.event = event;
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

    public long getRev_id()
    {
        return rev_id;
    }

    public void setRev_id(long rev_id)
    {
        this.rev_id = rev_id;
    }
}
