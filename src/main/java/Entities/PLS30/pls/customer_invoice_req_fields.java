package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_invoice_req_fields", schema = "pls")
public class customer_invoice_req_fields
{
    @Id
    private int customer_invoice_req_fields_id;
    private Long customer_id;
    private Long inv_req_field_id;
    private Boolean is_active;
    private Long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private Long customer_bill_address_id;

    public int getCustomer_invoice_req_fields_id()
    {
        return customer_invoice_req_fields_id;
    }

    public void setCustomer_invoice_req_fields_id(int customer_invoice_req_fields_id)
    {
        this.customer_invoice_req_fields_id = customer_invoice_req_fields_id;
    }

    public Long getCustomer_id()
    {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id)
    {
        this.customer_id = customer_id;
    }

    public Long getInv_req_field_id()
    {
        return inv_req_field_id;
    }

    public void setInv_req_field_id(Long inv_req_field_id)
    {
        this.inv_req_field_id = inv_req_field_id;
    }

    public Boolean getIs_active()
    {
        return is_active;
    }

    public void setIs_active(Boolean is_active)
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

    public Long getCustomer_bill_address_id()
    {
        return customer_bill_address_id;
    }

    public void setCustomer_bill_address_id(Long customer_bill_address_id)
    {
        this.customer_bill_address_id = customer_bill_address_id;
    }
}
