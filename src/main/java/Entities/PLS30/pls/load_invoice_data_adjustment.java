package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_invoice_data_adjustment", schema = "pls")
public class load_invoice_data_adjustment
{
    @Id
    private long load_invoice_data_adjustment_id;
    private long inv_req_field_id;
    private String value;
    private long load_request_adjustment_id;
    private String previous_vale;
    private Long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;

    public long getLoad_invoice_data_adjustment_id()
    {
        return load_invoice_data_adjustment_id;
    }

    public void setLoad_invoice_data_adjustment_id(long load_invoice_data_adjustment_id)
    {
        this.load_invoice_data_adjustment_id = load_invoice_data_adjustment_id;
    }

    public long getInv_req_field_id()
    {
        return inv_req_field_id;
    }

    public void setInv_req_field_id(long inv_req_field_id)
    {
        this.inv_req_field_id = inv_req_field_id;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public long getLoad_request_adjustment_id()
    {
        return load_request_adjustment_id;
    }

    public void setLoad_request_adjustment_id(long load_request_adjustment_id)
    {
        this.load_request_adjustment_id = load_request_adjustment_id;
    }

    public String getPrevious_vale()
    {
        return previous_vale;
    }

    public void setPrevious_vale(String previous_vale)
    {
        this.previous_vale = previous_vale;
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
