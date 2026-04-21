package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_status", schema = "pls")
public class load_status
{
    @Id
    private long load_status_id;
    private String load_status_name;
    private String load_status_desc;
    private boolean is_active;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;

    public long getLoad_status_id()
    {
        return load_status_id;
    }

    public void setLoad_status_id(long load_status_id)
    {
        this.load_status_id = load_status_id;
    }

    public String getLoad_status_name()
    {
        return load_status_name;
    }

    public void setLoad_status_name(String load_status_name)
    {
        this.load_status_name = load_status_name;
    }

    public String getLoad_status_desc()
    {
        return load_status_desc;
    }

    public void setLoad_status_desc(String load_status_desc)
    {
        this.load_status_desc = load_status_desc;
    }

    public boolean isIs_active()
    {
        return is_active;
    }

    public void setIs_active(boolean is_active)
    {
        this.is_active = is_active;
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
}
