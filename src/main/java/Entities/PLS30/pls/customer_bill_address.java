package Entities.PLS30.pls;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "customer_bill_address", schema = "pls")
public class customer_bill_address {
	@Id
	private long customer_bill_address_id;
	private String company_name;
	private String address_line1;
	private String address_line2;
	private String zip_code;
	private String country_name;
	private String state_name;
	private String city;
	private String contact_first_name;
	private String contact_last_name;
	private String contact_email;
	private String invoice_style;
	private String invoice_after;
	private String invoice_currency;
	private Boolean invoice_batch_billing;
	private Long frequency_type_id;
	private long customer_id;
	private Long date_of_invoice_id;
	private Long delivery_method_id;
	private String dnb;
	private Integer year_established;
	private Long payment_term_id;
	private String prepay_email_id;
	private Long prepay_phone;
	private Boolean is_credit_override;
	private BigDecimal credit_amount;
	private Boolean is_active;
	private long created_by;
	private LocalDateTime created_date;
	private Long modified_by;
	private LocalDateTime modified_date;
	private BigDecimal available_credit;
	private Long phone_number;
	private BigDecimal audit_margin_below_pct;
	private BigDecimal audit_margin_above_pct;
	private BigDecimal audit_margin_above_amt;
	private Boolean verify_cost_before_invoice;
	private String bol_signature;
	private String pod_signature;
	private Long portal_id;
	private Long legacy_bill_to_id;
	private String legacy_ax_account_number;
	private LocalDateTime credit_override_date;
	private BigDecimal increased_credit_amount;
	private String secondary_contact_email;
	private Boolean is_individual_email;
	private String ax_account_number;
	private String invoice_format;
	private String state_code;
	private String country_code;

	public long getCustomer_bill_address_id()
	{
		return customer_bill_address_id;
	}

	public void setCustomer_bill_address_id(long customer_bill_address_id)
	{
		this.customer_bill_address_id = customer_bill_address_id;
	}

	public String getCompany_name()
	{
		return company_name;
	}

	public void setCompany_name(String company_name)
	{
		this.company_name = company_name;
	}

	public String getAddress_line1()
	{
		return address_line1;
	}

	public void setAddress_line1(String address_line1)
	{
		this.address_line1 = address_line1;
	}

	public String getAddress_line2()
	{
		return address_line2;
	}

	public void setAddress_line2(String address_line2)
	{
		this.address_line2 = address_line2;
	}

	public String getZip_code()
	{
		return zip_code;
	}

	public void setZip_code(String zip_code)
	{
		this.zip_code = zip_code;
	}

	public String getCountry_name()
	{
		return country_name;
	}

	public void setCountry_name(String country_name)
	{
		this.country_name = country_name;
	}

	public String getState_name()
	{
		return state_name;
	}

	public void setState_name(String state_name)
	{
		this.state_name = state_name;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getContact_first_name()
	{
		return contact_first_name;
	}

	public void setContact_first_name(String contact_first_name)
	{
		this.contact_first_name = contact_first_name;
	}

	public String getContact_last_name()
	{
		return contact_last_name;
	}

	public void setContact_last_name(String contact_last_name)
	{
		this.contact_last_name = contact_last_name;
	}

	public String getContact_email()
	{
		return contact_email;
	}

	public void setContact_email(String contact_email)
	{
		this.contact_email = contact_email;
	}

	public String getInvoice_style()
	{
		return invoice_style;
	}

	public void setInvoice_style(String invoice_style)
	{
		this.invoice_style = invoice_style;
	}

	public String getInvoice_after()
	{
		return invoice_after;
	}

	public void setInvoice_after(String invoice_after)
	{
		this.invoice_after = invoice_after;
	}

	public String getInvoice_currency()
	{
		return invoice_currency;
	}

	public void setInvoice_currency(String invoice_currency)
	{
		this.invoice_currency = invoice_currency;
	}

	public Boolean getInvoice_batch_billing()
	{
		return invoice_batch_billing;
	}

	public void setInvoice_batch_billing(Boolean invoice_batch_billing)
	{
		this.invoice_batch_billing = invoice_batch_billing;
	}

	public Long getFrequency_type_id()
	{
		return frequency_type_id;
	}

	public void setFrequency_type_id(Long frequency_type_id)
	{
		this.frequency_type_id = frequency_type_id;
	}

	public long getCustomer_id()
	{
		return customer_id;
	}

	public void setCustomer_id(long customer_id)
	{
		this.customer_id = customer_id;
	}

	public Long getDate_of_invoice_id()
	{
		return date_of_invoice_id;
	}

	public void setDate_of_invoice_id(Long date_of_invoice_id)
	{
		this.date_of_invoice_id = date_of_invoice_id;
	}

	public Long getDelivery_method_id()
	{
		return delivery_method_id;
	}

	public void setDelivery_method_id(Long delivery_method_id)
	{
		this.delivery_method_id = delivery_method_id;
	}

	public String getDnb()
	{
		return dnb;
	}

	public void setDnb(String dnb)
	{
		this.dnb = dnb;
	}

	public Integer getYear_established()
	{
		return year_established;
	}

	public void setYear_established(Integer year_established)
	{
		this.year_established = year_established;
	}

	public Long getPayment_term_id()
	{
		return payment_term_id;
	}

	public void setPayment_term_id(Long payment_term_id)
	{
		this.payment_term_id = payment_term_id;
	}

	public String getPrepay_email_id()
	{
		return prepay_email_id;
	}

	public void setPrepay_email_id(String prepay_email_id)
	{
		this.prepay_email_id = prepay_email_id;
	}

	public Long getPrepay_phone()
	{
		return prepay_phone;
	}

	public void setPrepay_phone(Long prepay_phone)
	{
		this.prepay_phone = prepay_phone;
	}

	public Boolean getIs_credit_override()
	{
		return is_credit_override;
	}

	public void setIs_credit_override(Boolean is_credit_override)
	{
		this.is_credit_override = is_credit_override;
	}

	public BigDecimal getCredit_amount()
	{
		return credit_amount;
	}

	public void setCredit_amount(BigDecimal credit_amount)
	{
		this.credit_amount = credit_amount;
	}

	public Boolean getIs_active()
	{
		return is_active;
	}

	public void setIs_active(Boolean is_active)
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

	public BigDecimal getAvailable_credit()
	{
		return available_credit;
	}

	public void setAvailable_credit(BigDecimal available_credit)
	{
		this.available_credit = available_credit;
	}

	public Long getPhone_number()
	{
		return phone_number;
	}

	public void setPhone_number(Long phone_number)
	{
		this.phone_number = phone_number;
	}

	public BigDecimal getAudit_margin_below_pct()
	{
		return audit_margin_below_pct;
	}

	public void setAudit_margin_below_pct(BigDecimal audit_margin_below_pct)
	{
		this.audit_margin_below_pct = audit_margin_below_pct;
	}

	public BigDecimal getAudit_margin_above_pct()
	{
		return audit_margin_above_pct;
	}

	public void setAudit_margin_above_pct(BigDecimal audit_margin_above_pct)
	{
		this.audit_margin_above_pct = audit_margin_above_pct;
	}

	public BigDecimal getAudit_margin_above_amt()
	{
		return audit_margin_above_amt;
	}

	public void setAudit_margin_above_amt(BigDecimal audit_margin_above_amt)
	{
		this.audit_margin_above_amt = audit_margin_above_amt;
	}

	public Boolean getVerify_cost_before_invoice()
	{
		return verify_cost_before_invoice;
	}

	public void setVerify_cost_before_invoice(Boolean verify_cost_before_invoice)
	{
		this.verify_cost_before_invoice = verify_cost_before_invoice;
	}

	public String getBol_signature()
	{
		return bol_signature;
	}

	public void setBol_signature(String bol_signature)
	{
		this.bol_signature = bol_signature;
	}

	public String getPod_signature()
	{
		return pod_signature;
	}

	public void setPod_signature(String pod_signature)
	{
		this.pod_signature = pod_signature;
	}

	public Long getPortal_id()
	{
		return portal_id;
	}

	public void setPortal_id(Long portal_id)
	{
		this.portal_id = portal_id;
	}

	public Long getLegacy_bill_to_id()
	{
		return legacy_bill_to_id;
	}

	public void setLegacy_bill_to_id(Long legacy_bill_to_id)
	{
		this.legacy_bill_to_id = legacy_bill_to_id;
	}

	public String getLegacy_ax_account_number()
	{
		return legacy_ax_account_number;
	}

	public void setLegacy_ax_account_number(String legacy_ax_account_number)
	{
		this.legacy_ax_account_number = legacy_ax_account_number;
	}

	public LocalDateTime getCredit_override_date()
	{
		return credit_override_date;
	}

	public void setCredit_override_date(LocalDateTime credit_override_date)
	{
		this.credit_override_date = credit_override_date;
	}

	public BigDecimal getIncreased_credit_amount()
	{
		return increased_credit_amount;
	}

	public void setIncreased_credit_amount(BigDecimal increased_credit_amount)
	{
		this.increased_credit_amount = increased_credit_amount;
	}

	public String getSecondary_contact_email()
	{
		return secondary_contact_email;
	}

	public void setSecondary_contact_email(String secondary_contact_email)
	{
		this.secondary_contact_email = secondary_contact_email;
	}

	public Boolean getIs_individual_email()
	{
		return is_individual_email;
	}

	public void setIs_individual_email(Boolean is_individual_email)
	{
		this.is_individual_email = is_individual_email;
	}

	public String getAx_account_number()
	{
		return ax_account_number;
	}

	public void setAx_account_number(String ax_account_number)
	{
		this.ax_account_number = ax_account_number;
	}

	public String getInvoice_format()
	{
		return invoice_format;
	}

	public void setInvoice_format(String invoice_format)
	{
		this.invoice_format = invoice_format;
	}

	public String getState_code()
	{
		return state_code;
	}

	public void setState_code(String state_code)
	{
		this.state_code = state_code;
	}

	public String getCountry_code()
	{
		return country_code;
	}

	public void setCountry_code(String country_code)
	{
		this.country_code = country_code;
	}
}
