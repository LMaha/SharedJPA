package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_pricing_adjustment", schema = "pls")
public class load_pricing_adjustment
{
    @Id
    private long load_pricing_adjustment_id;
    private long pricing_type_id;
    private long pricing_line_item_id;
    private long pricing_line_item_type_id;
    private BigDecimal pricing_line_item_value;
    private BigDecimal pricing_line_item_subtotal;
    private Integer minimum_weight;
    private Long accessorial_types_id;
    private BigDecimal lh_percent_calc_value;
    private long load_request_adjustment_id;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;

    public long getLoad_pricing_adjustment_id()
    {
        return load_pricing_adjustment_id;
    }

    public void setLoad_pricing_adjustment_id(long load_pricing_adjustment_id)
    {
        this.load_pricing_adjustment_id = load_pricing_adjustment_id;
    }

    public long getPricing_type_id()
    {
        return pricing_type_id;
    }

    public void setPricing_type_id(long pricing_type_id)
    {
        this.pricing_type_id = pricing_type_id;
    }

    public long getPricing_line_item_id()
    {
        return pricing_line_item_id;
    }

    public void setPricing_line_item_id(long pricing_line_item_id)
    {
        this.pricing_line_item_id = pricing_line_item_id;
    }

    public long getPricing_line_item_type_id()
    {
        return pricing_line_item_type_id;
    }

    public void setPricing_line_item_type_id(long pricing_line_item_type_id)
    {
        this.pricing_line_item_type_id = pricing_line_item_type_id;
    }

    public BigDecimal getPricing_line_item_value()
    {
        return pricing_line_item_value;
    }

    public void setPricing_line_item_value(BigDecimal pricing_line_item_value)
    {
        this.pricing_line_item_value = pricing_line_item_value;
    }

    public BigDecimal getPricing_line_item_subtotal()
    {
        return pricing_line_item_subtotal;
    }

    public void setPricing_line_item_subtotal(BigDecimal pricing_line_item_subtotal)
    {
        this.pricing_line_item_subtotal = pricing_line_item_subtotal;
    }

    public Integer getMinimum_weight()
    {
        return minimum_weight;
    }

    public void setMinimum_weight(Integer minimum_weight)
    {
        this.minimum_weight = minimum_weight;
    }

    public Long getAccessorial_types_id()
    {
        return accessorial_types_id;
    }

    public void setAccessorial_types_id(Long accessorial_types_id)
    {
        this.accessorial_types_id = accessorial_types_id;
    }

    public BigDecimal getLh_percent_calc_value()
    {
        return lh_percent_calc_value;
    }

    public void setLh_percent_calc_value(BigDecimal lh_percent_calc_value)
    {
        this.lh_percent_calc_value = lh_percent_calc_value;
    }

    public long getLoad_request_adjustment_id()
    {
        return load_request_adjustment_id;
    }

    public void setLoad_request_adjustment_id(long load_request_adjustment_id)
    {
        this.load_request_adjustment_id = load_request_adjustment_id;
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
