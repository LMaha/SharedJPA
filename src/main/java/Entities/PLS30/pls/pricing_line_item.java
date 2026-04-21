package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "pricing_line_item", schema = "pls")
public class pricing_line_item
{
    @Id
    private long pricing_line_item_id;
    private String pricing_line_item_name;
    private String pricing_line_item_desc;
    private boolean is_active;
    private Long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private String pricing_line_item_code;

    public long getPricing_line_item_id()
    {
        return pricing_line_item_id;
    }

    public void setPricing_line_item_id(long pricing_line_item_id)
    {
        this.pricing_line_item_id = pricing_line_item_id;
    }

    public String getPricing_line_item_name()
    {
        return pricing_line_item_name;
    }

    public void setPricing_line_item_name(String pricing_line_item_name)
    {
        this.pricing_line_item_name = pricing_line_item_name;
    }

    public String getPricing_line_item_desc()
    {
        return pricing_line_item_desc;
    }

    public void setPricing_line_item_desc(String pricing_line_item_desc)
    {
        this.pricing_line_item_desc = pricing_line_item_desc;
    }

    public boolean isIs_active()
    {
        return is_active;
    }

    public void setIs_active(boolean is_active)
    {
        this.is_active = is_active;
    }

    public Long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(Long created_by)
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

    public String getPricing_line_item_code()
    {
        return pricing_line_item_code;
    }

    public void setPricing_line_item_code(String pricing_line_item_code)
    {
        this.pricing_line_item_code = pricing_line_item_code;
    }
}
