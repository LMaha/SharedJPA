package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "pls_office", schema = "pls")
public class pls_office
{
    @Id
    private long pls_office_id;
    private String pls_office_name;
    private String pls_office_desc;
    private boolean is_active;
    private long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private String pls_office_code;

    public long getPls_office_id()
    {
        return pls_office_id;
    }

    public void setPls_office_id(long pls_office_id)
    {
        this.pls_office_id = pls_office_id;
    }

    public String getPls_office_name()
    {
        return pls_office_name;
    }

    public void setPls_office_name(String pls_office_name)
    {
        this.pls_office_name = pls_office_name;
    }

    public String getPls_office_desc()
    {
        return pls_office_desc;
    }

    public void setPls_office_desc(String pls_office_desc)
    {
        this.pls_office_desc = pls_office_desc;
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

    public Long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(Long modified_by)
    {
        this.modified_by = modified_by;
    }

    public LocalDateTime getCreated_date()
    {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date)
    {
        this.created_date = created_date;
    }

    public LocalDateTime getModified_date()
    {
        return modified_date;
    }

    public void setModified_date(LocalDateTime modified_date)
    {
        this.modified_date = modified_date;
    }

    public String getPls_office_code()
    {
        return pls_office_code;
    }

    public void setPls_office_code(String pls_office_code)
    {
        this.pls_office_code = pls_office_code;
    }
}
