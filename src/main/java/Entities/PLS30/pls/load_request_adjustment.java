package Entities.PLS30.pls;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_request_adjustment", schema = "pls")
public class load_request_adjustment
{
    @Id
    private long load_request_adjustment_id;
    private long load_id;
    private Boolean is_pricing;
    private Boolean is_data;
    private Boolean is_carrier;
    private Boolean is_customer;
    private BigDecimal pricing_revenue_total;
    private BigDecimal pricing_cost_total;
    private Long customer_id;
    private Long customer_location_id;
    private Long customer_bill_address_id;
    private Long carrier_id;
    private Long carrier_contact_id;
    private boolean can_send_new_invoice;
    private boolean can_send_rate_agreement;
    private String comments_on_invoice;
    private String comments_to_approvers;
    private boolean is_active;
    private boolean is_approved;
    private BigDecimal actual_weight;
    private BigDecimal original_margin;
    private BigDecimal adjusted_margin;
    private BigDecimal margin_difference;
    private Boolean is_revenue_changed;
    private Boolean is_cost_changed;
    private Boolean is_revenue_zero;
    private Boolean is_cost_zero;
    private Long primary_adjustment_id;
    private Long secondary_adjustment_id;
    private LocalDateTime created_date;
    private long created_by;
    private long modified_by;
    private LocalDateTime modified_date;
    private Boolean is_cust_location_changed;
    private Boolean is_cust_billto_changed;
    private Boolean is_customer_changed;

    public long getLoad_request_adjustment_id()
    {
        return load_request_adjustment_id;
    }

    public void setLoad_request_adjustment_id(long load_request_adjustment_id)
    {
        this.load_request_adjustment_id = load_request_adjustment_id;
    }

    public long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(long load_id)
    {
        this.load_id = load_id;
    }

    public Boolean getIs_pricing()
    {
        return is_pricing;
    }

    public void setIs_pricing(Boolean is_pricing)
    {
        this.is_pricing = is_pricing;
    }

    public Boolean getIs_data()
    {
        return is_data;
    }

    public void setIs_data(Boolean is_data)
    {
        this.is_data = is_data;
    }

    public Boolean getIs_carrier()
    {
        return is_carrier;
    }

    public void setIs_carrier(Boolean is_carrier)
    {
        this.is_carrier = is_carrier;
    }

    public Boolean getIs_customer()
    {
        return is_customer;
    }

    public void setIs_customer(Boolean is_customer)
    {
        this.is_customer = is_customer;
    }

    public BigDecimal getPricing_revenue_total()
    {
        return pricing_revenue_total;
    }

    public void setPricing_revenue_total(BigDecimal pricing_revenue_total)
    {
        this.pricing_revenue_total = pricing_revenue_total;
    }

    public BigDecimal getPricing_cost_total()
    {
        return pricing_cost_total;
    }

    public void setPricing_cost_total(BigDecimal pricing_cost_total)
    {
        this.pricing_cost_total = pricing_cost_total;
    }

    public Long getCustomer_id()
    {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id)
    {
        this.customer_id = customer_id;
    }

    public Long getCustomer_location_id()
    {
        return customer_location_id;
    }

    public void setCustomer_location_id(Long customer_location_id)
    {
        this.customer_location_id = customer_location_id;
    }

    public Long getCustomer_bill_address_id()
    {
        return customer_bill_address_id;
    }

    public void setCustomer_bill_address_id(Long customer_bill_address_id)
    {
        this.customer_bill_address_id = customer_bill_address_id;
    }

    public Long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(Long carrier_id)
    {
        this.carrier_id = carrier_id;
    }

    public Long getCarrier_contact_id()
    {
        return carrier_contact_id;
    }

    public void setCarrier_contact_id(Long carrier_contact_id)
    {
        this.carrier_contact_id = carrier_contact_id;
    }

    public boolean isCan_send_new_invoice()
    {
        return can_send_new_invoice;
    }

    public void setCan_send_new_invoice(boolean can_send_new_invoice)
    {
        this.can_send_new_invoice = can_send_new_invoice;
    }

    public boolean isCan_send_rate_agreement()
    {
        return can_send_rate_agreement;
    }

    public void setCan_send_rate_agreement(boolean can_send_rate_agreement)
    {
        this.can_send_rate_agreement = can_send_rate_agreement;
    }

    public String getComments_on_invoice()
    {
        return comments_on_invoice;
    }

    public void setComments_on_invoice(String comments_on_invoice)
    {
        this.comments_on_invoice = comments_on_invoice;
    }

    public String getComments_to_approvers()
    {
        return comments_to_approvers;
    }

    public void setComments_to_approvers(String comments_to_approvers)
    {
        this.comments_to_approvers = comments_to_approvers;
    }

    public boolean isIs_active()
    {
        return is_active;
    }

    public void setIs_active(boolean is_active)
    {
        this.is_active = is_active;
    }

    public boolean isIs_approved()
    {
        return is_approved;
    }

    public void setIs_approved(boolean is_approved)
    {
        this.is_approved = is_approved;
    }

    public BigDecimal getActual_weight()
    {
        return actual_weight;
    }

    public void setActual_weight(BigDecimal actual_weight)
    {
        this.actual_weight = actual_weight;
    }

    public BigDecimal getOriginal_margin()
    {
        return original_margin;
    }

    public void setOriginal_margin(BigDecimal original_margin)
    {
        this.original_margin = original_margin;
    }

    public BigDecimal getAdjusted_margin()
    {
        return adjusted_margin;
    }

    public void setAdjusted_margin(BigDecimal adjusted_margin)
    {
        this.adjusted_margin = adjusted_margin;
    }

    public BigDecimal getMargin_difference()
    {
        return margin_difference;
    }

    public void setMargin_difference(BigDecimal margin_difference)
    {
        this.margin_difference = margin_difference;
    }

    public Boolean getIs_revenue_changed()
    {
        return is_revenue_changed;
    }

    public void setIs_revenue_changed(Boolean is_revenue_changed)
    {
        this.is_revenue_changed = is_revenue_changed;
    }

    public Boolean getIs_cost_changed()
    {
        return is_cost_changed;
    }

    public void setIs_cost_changed(Boolean is_cost_changed)
    {
        this.is_cost_changed = is_cost_changed;
    }

    public Boolean getIs_revenue_zero()
    {
        return is_revenue_zero;
    }

    public void setIs_revenue_zero(Boolean is_revenue_zero)
    {
        this.is_revenue_zero = is_revenue_zero;
    }

    public Boolean getIs_cost_zero()
    {
        return is_cost_zero;
    }

    public void setIs_cost_zero(Boolean is_cost_zero)
    {
        this.is_cost_zero = is_cost_zero;
    }

    public Long getPrimary_adjustment_id()
    {
        return primary_adjustment_id;
    }

    public void setPrimary_adjustment_id(Long primary_adjustment_id)
    {
        this.primary_adjustment_id = primary_adjustment_id;
    }

    public Long getSecondary_adjustment_id()
    {
        return secondary_adjustment_id;
    }

    public void setSecondary_adjustment_id(Long secondary_adjustment_id)
    {
        this.secondary_adjustment_id = secondary_adjustment_id;
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

    public Boolean getIs_cust_location_changed()
    {
        return is_cust_location_changed;
    }

    public void setIs_cust_location_changed(Boolean is_cust_location_changed)
    {
        this.is_cust_location_changed = is_cust_location_changed;
    }

    public Boolean getIs_cust_billto_changed()
    {
        return is_cust_billto_changed;
    }

    public void setIs_cust_billto_changed(Boolean is_cust_billto_changed)
    {
        this.is_cust_billto_changed = is_cust_billto_changed;
    }

    public Boolean getIs_customer_changed()
    {
        return is_customer_changed;
    }

    public void setIs_customer_changed(Boolean is_customer_changed)
    {
        this.is_customer_changed = is_customer_changed;
    }
}
