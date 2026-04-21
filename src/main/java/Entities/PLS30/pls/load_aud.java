package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_aud", schema = "pls")
public class load_aud
{
    private long load_id;
    private Long customer_id;
    private Long customer_invoice_id;
    private Long customer_contact_id;
    private Long equipment_id;
    private String special_instruction;
    private long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    @Id
    private LocalDateTime modified_date;
    private Long customer_credit_id;
    private String reference_number;
    private BigDecimal pricing_revenue_total;
    private BigDecimal pricing_cost_total;
    private BigDecimal pricing_max;
    private BigDecimal pricing_target;
    private String load_size;
    private BigDecimal load_size_value;
    private Long load_status_id;
    private short margin_approved;
    private short paperwork_approved;
    private short required_fields_approved;
    private short cost_verification_approved;
    private short verified_fields_approved;
    private short systematic_load_price_approved;
    private short load_adjustment_request;
    private short remit_to_zip_approved;
    private Boolean is_rate_confirmed;
    private Long load_status_on_cancel;
    private Boolean invoice_processed_flag;
    private Long billing_status_id;
    private Boolean invoice_adjustment_requested;
    private Boolean exception_overridden;
    private String invoice_number;
    private Long customer_bill_address_id;
    private Long customer_location_id;
    private Boolean is_sales_order_posted;
    private LocalDateTime frt_bill_received_date;
    private boolean is_batch_billing;
    private Long load_count;
    private boolean is_outbound;
    private String ax_load_id;
    private String invoice_cover;
    private long rev;
    private short revtype;
    private BigDecimal total_weight;
    private Short rates_approved;
    private Short cwt_approved;
    private BigDecimal actual_weight_copy;
    private BigDecimal actual_weight;
    private Boolean is_frieghtbill_ax_required;
    private Short scac_approved;
    private String open_market_days;
    private LocalDateTime to_date_for_open_market;
    private Long freight_approved;
    private Integer missing_pages_approved;
    private Long pickup_approved;
    private BigDecimal pricing_margin_pct;
    private BigDecimal equipment_temperature;
    private Long account_owner_id;
    private Boolean is_load_booked;
    private Short load_priority_id;
    private String shipment_no;
    private Boolean is_edi;
    private Long copy_load_id;
    private Boolean is_tracking_order_posted;
    private Boolean is_tracking_order_updated;
    private Long revision;
    private String legacy_ax_number_on_invoicing;
    private Integer require_billing_review;

    public long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(long load_id)
    {
        this.load_id = load_id;
    }

    public Long getCustomer_id()
    {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id)
    {
        this.customer_id = customer_id;
    }

    public Long getCustomer_invoice_id()
    {
        return customer_invoice_id;
    }

    public void setCustomer_invoice_id(Long customer_invoice_id)
    {
        this.customer_invoice_id = customer_invoice_id;
    }

    public Long getCustomer_contact_id()
    {
        return customer_contact_id;
    }

    public void setCustomer_contact_id(Long customer_contact_id)
    {
        this.customer_contact_id = customer_contact_id;
    }

    public Long getEquipment_id()
    {
        return equipment_id;
    }

    public void setEquipment_id(Long equipment_id)
    {
        this.equipment_id = equipment_id;
    }

    public String getSpecial_instruction()
    {
        return special_instruction;
    }

    public void setSpecial_instruction(String special_instruction)
    {
        this.special_instruction = special_instruction;
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

    public Long getCustomer_credit_id()
    {
        return customer_credit_id;
    }

    public void setCustomer_credit_id(Long customer_credit_id)
    {
        this.customer_credit_id = customer_credit_id;
    }

    public String getReference_number()
    {
        return reference_number;
    }

    public void setReference_number(String reference_number)
    {
        this.reference_number = reference_number;
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

    public BigDecimal getPricing_max()
    {
        return pricing_max;
    }

    public void setPricing_max(BigDecimal pricing_max)
    {
        this.pricing_max = pricing_max;
    }

    public BigDecimal getPricing_target()
    {
        return pricing_target;
    }

    public void setPricing_target(BigDecimal pricing_target)
    {
        this.pricing_target = pricing_target;
    }

    public String getLoad_size()
    {
        return load_size;
    }

    public void setLoad_size(String load_size)
    {
        this.load_size = load_size;
    }

    public BigDecimal getLoad_size_value()
    {
        return load_size_value;
    }

    public void setLoad_size_value(BigDecimal load_size_value)
    {
        this.load_size_value = load_size_value;
    }

    public Long getLoad_status_id()
    {
        return load_status_id;
    }

    public void setLoad_status_id(Long load_status_id)
    {
        this.load_status_id = load_status_id;
    }

    public short getMargin_approved()
    {
        return margin_approved;
    }

    public void setMargin_approved(short margin_approved)
    {
        this.margin_approved = margin_approved;
    }

    public short getPaperwork_approved()
    {
        return paperwork_approved;
    }

    public void setPaperwork_approved(short paperwork_approved)
    {
        this.paperwork_approved = paperwork_approved;
    }

    public short getRequired_fields_approved()
    {
        return required_fields_approved;
    }

    public void setRequired_fields_approved(short required_fields_approved)
    {
        this.required_fields_approved = required_fields_approved;
    }

    public short getCost_verification_approved()
    {
        return cost_verification_approved;
    }

    public void setCost_verification_approved(short cost_verification_approved)
    {
        this.cost_verification_approved = cost_verification_approved;
    }

    public short getVerified_fields_approved()
    {
        return verified_fields_approved;
    }

    public void setVerified_fields_approved(short verified_fields_approved)
    {
        this.verified_fields_approved = verified_fields_approved;
    }

    public short getSystematic_load_price_approved()
    {
        return systematic_load_price_approved;
    }

    public void setSystematic_load_price_approved(short systematic_load_price_approved)
    {
        this.systematic_load_price_approved = systematic_load_price_approved;
    }

    public short getLoad_adjustment_request()
    {
        return load_adjustment_request;
    }

    public void setLoad_adjustment_request(short load_adjustment_request)
    {
        this.load_adjustment_request = load_adjustment_request;
    }

    public short getRemit_to_zip_approved()
    {
        return remit_to_zip_approved;
    }

    public void setRemit_to_zip_approved(short remit_to_zip_approved)
    {
        this.remit_to_zip_approved = remit_to_zip_approved;
    }

    public Boolean getIs_rate_confirmed()
    {
        return is_rate_confirmed;
    }

    public void setIs_rate_confirmed(Boolean is_rate_confirmed)
    {
        this.is_rate_confirmed = is_rate_confirmed;
    }

    public Long getLoad_status_on_cancel()
    {
        return load_status_on_cancel;
    }

    public void setLoad_status_on_cancel(Long load_status_on_cancel)
    {
        this.load_status_on_cancel = load_status_on_cancel;
    }

    public Boolean getInvoice_processed_flag()
    {
        return invoice_processed_flag;
    }

    public void setInvoice_processed_flag(Boolean invoice_processed_flag)
    {
        this.invoice_processed_flag = invoice_processed_flag;
    }

    public Long getBilling_status_id()
    {
        return billing_status_id;
    }

    public void setBilling_status_id(Long billing_status_id)
    {
        this.billing_status_id = billing_status_id;
    }

    public Boolean getInvoice_adjustment_requested()
    {
        return invoice_adjustment_requested;
    }

    public void setInvoice_adjustment_requested(Boolean invoice_adjustment_requested)
    {
        this.invoice_adjustment_requested = invoice_adjustment_requested;
    }

    public Boolean getException_overridden()
    {
        return exception_overridden;
    }

    public void setException_overridden(Boolean exception_overridden)
    {
        this.exception_overridden = exception_overridden;
    }

    public String getInvoice_number()
    {
        return invoice_number;
    }

    public void setInvoice_number(String invoice_number)
    {
        this.invoice_number = invoice_number;
    }

    public Long getCustomer_bill_address_id()
    {
        return customer_bill_address_id;
    }

    public void setCustomer_bill_address_id(Long customer_bill_address_id)
    {
        this.customer_bill_address_id = customer_bill_address_id;
    }

    public Long getCustomer_location_id()
    {
        return customer_location_id;
    }

    public void setCustomer_location_id(Long customer_location_id)
    {
        this.customer_location_id = customer_location_id;
    }

    public Boolean getIs_sales_order_posted()
    {
        return is_sales_order_posted;
    }

    public void setIs_sales_order_posted(Boolean is_sales_order_posted)
    {
        this.is_sales_order_posted = is_sales_order_posted;
    }

    public LocalDateTime getFrt_bill_received_date()
    {
        return frt_bill_received_date;
    }

    public void setFrt_bill_received_date(LocalDateTime frt_bill_received_date)
    {
        this.frt_bill_received_date = frt_bill_received_date;
    }

    public boolean isIs_batch_billing()
    {
        return is_batch_billing;
    }

    public void setIs_batch_billing(boolean is_batch_billing)
    {
        this.is_batch_billing = is_batch_billing;
    }

    public Long getLoad_count()
    {
        return load_count;
    }

    public void setLoad_count(Long load_count)
    {
        this.load_count = load_count;
    }

    public boolean isIs_outbound()
    {
        return is_outbound;
    }

    public void setIs_outbound(boolean is_outbound)
    {
        this.is_outbound = is_outbound;
    }

    public String getAx_load_id()
    {
        return ax_load_id;
    }

    public void setAx_load_id(String ax_load_id)
    {
        this.ax_load_id = ax_load_id;
    }

    public String getInvoice_cover()
    {
        return invoice_cover;
    }

    public void setInvoice_cover(String invoice_cover)
    {
        this.invoice_cover = invoice_cover;
    }

    public long getRev()
    {
        return rev;
    }

    public void setRev(long rev)
    {
        this.rev = rev;
    }

    public short getRevtype()
    {
        return revtype;
    }

    public void setRevtype(short revtype)
    {
        this.revtype = revtype;
    }

    public BigDecimal getTotal_weight()
    {
        return total_weight;
    }

    public void setTotal_weight(BigDecimal total_weight)
    {
        this.total_weight = total_weight;
    }

    public Short getRates_approved()
    {
        return rates_approved;
    }

    public void setRates_approved(Short rates_approved)
    {
        this.rates_approved = rates_approved;
    }

    public Short getCwt_approved()
    {
        return cwt_approved;
    }

    public void setCwt_approved(Short cwt_approved)
    {
        this.cwt_approved = cwt_approved;
    }

    public BigDecimal getActual_weight_copy()
    {
        return actual_weight_copy;
    }

    public void setActual_weight_copy(BigDecimal actual_weight_copy)
    {
        this.actual_weight_copy = actual_weight_copy;
    }

    public BigDecimal getActual_weight()
    {
        return actual_weight;
    }

    public void setActual_weight(BigDecimal actual_weight)
    {
        this.actual_weight = actual_weight;
    }

    public Boolean getIs_frieghtbill_ax_required()
    {
        return is_frieghtbill_ax_required;
    }

    public void setIs_frieghtbill_ax_required(Boolean is_frieghtbill_ax_required)
    {
        this.is_frieghtbill_ax_required = is_frieghtbill_ax_required;
    }

    public Short getScac_approved()
    {
        return scac_approved;
    }

    public void setScac_approved(Short scac_approved)
    {
        this.scac_approved = scac_approved;
    }

    public String getOpen_market_days()
    {
        return open_market_days;
    }

    public void setOpen_market_days(String open_market_days)
    {
        this.open_market_days = open_market_days;
    }

    public LocalDateTime getTo_date_for_open_market()
    {
        return to_date_for_open_market;
    }

    public void setTo_date_for_open_market(LocalDateTime to_date_for_open_market)
    {
        this.to_date_for_open_market = to_date_for_open_market;
    }

    public Long getFreight_approved()
    {
        return freight_approved;
    }

    public void setFreight_approved(Long freight_approved)
    {
        this.freight_approved = freight_approved;
    }

    public Integer getMissing_pages_approved()
    {
        return missing_pages_approved;
    }

    public void setMissing_pages_approved(Integer missing_pages_approved)
    {
        this.missing_pages_approved = missing_pages_approved;
    }

    public Long getPickup_approved()
    {
        return pickup_approved;
    }

    public void setPickup_approved(Long pickup_approved)
    {
        this.pickup_approved = pickup_approved;
    }

    public BigDecimal getPricing_margin_pct()
    {
        return pricing_margin_pct;
    }

    public void setPricing_margin_pct(BigDecimal pricing_margin_pct)
    {
        this.pricing_margin_pct = pricing_margin_pct;
    }

    public BigDecimal getEquipment_temperature()
    {
        return equipment_temperature;
    }

    public void setEquipment_temperature(BigDecimal equipment_temperature)
    {
        this.equipment_temperature = equipment_temperature;
    }

    public Long getAccount_owner_id()
    {
        return account_owner_id;
    }

    public void setAccount_owner_id(Long account_owner_id)
    {
        this.account_owner_id = account_owner_id;
    }

    public Boolean getIs_load_booked()
    {
        return is_load_booked;
    }

    public void setIs_load_booked(Boolean is_load_booked)
    {
        this.is_load_booked = is_load_booked;
    }

    public Short getLoad_priority_id()
    {
        return load_priority_id;
    }

    public void setLoad_priority_id(Short load_priority_id)
    {
        this.load_priority_id = load_priority_id;
    }

    public String getShipment_no()
    {
        return shipment_no;
    }

    public void setShipment_no(String shipment_no)
    {
        this.shipment_no = shipment_no;
    }

    public Boolean getIs_edi()
    {
        return is_edi;
    }

    public void setIs_edi(Boolean is_edi)
    {
        this.is_edi = is_edi;
    }

    public Long getCopy_load_id()
    {
        return copy_load_id;
    }

    public void setCopy_load_id(Long copy_load_id)
    {
        this.copy_load_id = copy_load_id;
    }

    public Boolean getIs_tracking_order_posted()
    {
        return is_tracking_order_posted;
    }

    public void setIs_tracking_order_posted(Boolean is_tracking_order_posted)
    {
        this.is_tracking_order_posted = is_tracking_order_posted;
    }

    public Boolean getIs_tracking_order_updated()
    {
        return is_tracking_order_updated;
    }

    public void setIs_tracking_order_updated(Boolean is_tracking_order_updated)
    {
        this.is_tracking_order_updated = is_tracking_order_updated;
    }

    public Long getRevision()
    {
        return revision;
    }

    public void setRevision(Long revision)
    {
        this.revision = revision;
    }

    public String getLegacy_ax_number_on_invoicing()
    {
        return legacy_ax_number_on_invoicing;
    }

    public void setLegacy_ax_number_on_invoicing(String legacy_ax_number_on_invoicing)
    {
        this.legacy_ax_number_on_invoicing = legacy_ax_number_on_invoicing;
    }

    public Integer getRequire_billing_review()
    {
        return require_billing_review;
    }

    public void setRequire_billing_review(Integer require_billing_review)
    {
        this.require_billing_review = require_billing_review;
    }
}
