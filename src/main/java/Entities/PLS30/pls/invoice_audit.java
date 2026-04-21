package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "invoice_audit", schema = "pls")
public class invoice_audit
{
    @Id
    private long invoice_id;
    private Long load_id;
    private String invoice_number;
    private String file_name;
    private String mail_status;
    private String mail_receipents;
    private String mail_content;
    private String mail_subject;
    private long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private boolean is_active;
    private String adjustment_info;
    private BigDecimal previous_revenue_total;
    private BigDecimal previous_cost_total;
    private BigDecimal adjusted_revenue_total;
    private BigDecimal adjusted_cost_total;
    private Long carrier_id;
    private Long customer_bill_address_id;
    private String invoice_info;
    private Long adjustment_id;

    public long getInvoice_id()
    {
        return invoice_id;
    }

    public void setInvoice_id(long invoice_id)
    {
        this.invoice_id = invoice_id;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
    }

    public String getInvoice_number()
    {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number)
    {
        this.invoice_number = invoice_number;
    }

    public String getFile_name()
    {
        return file_name;
    }

    public void setFile_name(String file_name)
    {
        this.file_name = file_name;
    }

    public String getMail_status()
    {
        return mail_status;
    }

    public void setMail_status(String mail_status)
    {
        this.mail_status = mail_status;
    }

    public String getMail_receipents()
    {
        return mail_receipents;
    }

    public void setMail_receipents(String mail_receipents)
    {
        this.mail_receipents = mail_receipents;
    }

    public String getMail_content()
    {
        return mail_content;
    }

    public void setMail_content(String mail_content)
    {
        this.mail_content = mail_content;
    }

    public String getMail_subject()
    {
        return mail_subject;
    }

    public void setMail_subject(String mail_subject)
    {
        this.mail_subject = mail_subject;
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

    public boolean isIs_active()
    {
        return is_active;
    }

    public void setIs_active(boolean is_active)
    {
        this.is_active = is_active;
    }

    public String getAdjustment_info()
    {
        return adjustment_info;
    }

    public void setAdjustment_info(String adjustment_info)
    {
        this.adjustment_info = adjustment_info;
    }

    public BigDecimal getPrevious_revenue_total()
    {
        return previous_revenue_total;
    }

    public void setPrevious_revenue_total(BigDecimal previous_revenue_total)
    {
        this.previous_revenue_total = previous_revenue_total;
    }

    public BigDecimal getPrevious_cost_total()
    {
        return previous_cost_total;
    }

    public void setPrevious_cost_total(BigDecimal previous_cost_total)
    {
        this.previous_cost_total = previous_cost_total;
    }

    public BigDecimal getAdjusted_revenue_total()
    {
        return adjusted_revenue_total;
    }

    public void setAdjusted_revenue_total(BigDecimal adjusted_revenue_total)
    {
        this.adjusted_revenue_total = adjusted_revenue_total;
    }

    public BigDecimal getAdjusted_cost_total()
    {
        return adjusted_cost_total;
    }

    public void setAdjusted_cost_total(BigDecimal adjusted_cost_total)
    {
        this.adjusted_cost_total = adjusted_cost_total;
    }

    public Long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(Long carrier_id)
    {
        this.carrier_id = carrier_id;
    }

    public Long getCustomer_bill_address_id()
    {
        return customer_bill_address_id;
    }

    public void setCustomer_bill_address_id(Long customer_bill_address_id)
    {
        this.customer_bill_address_id = customer_bill_address_id;
    }

    public String getInvoice_info()
    {
        return invoice_info;
    }

    public void setInvoice_info(String invoice_info)
    {
        this.invoice_info = invoice_info;
    }

    public Long getAdjustment_id()
    {
        return adjustment_id;
    }

    public void setAdjustment_id(Long adjustment_id)
    {
        this.adjustment_id = adjustment_id;
    }
}
