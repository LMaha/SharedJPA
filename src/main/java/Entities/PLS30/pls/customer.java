package Entities.PLS30.pls;
import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "customer", schema = "pls")
public class customer
{
	@Id
	public long customer_id;
	private String company_name;
	private String dba;
	private String company_site;
	private Long industry_id;
	private Long ein;
	private String sic;
	private Long created_by;
	private Long modified_by;
	private LocalDateTime created_date;
	private LocalDateTime modified_date;
	private boolean is_active;
	private Long gl_coding_id;
	private Long invoice_settings_id;
	private String bol_signature;
	private String pod_signature;
	private String company_code;
	private String cost_center;
	private Long legacy_id;
	private Long network_id;
	private Boolean ships_frequently;
	private Boolean outbound_messages;
	private Boolean is_edi_customer;
	private boolean tracking_enabled;
	private boolean auto_pickup_delivery_confirm_enabled;
	private boolean food_beverage;

	public long getCustomer_id()
	{
		return customer_id;
	}

	public void setCustomer_id(long customer_id)
	{
		this.customer_id = customer_id;
	}

	public String getCompany_name()
	{
		return company_name;
	}

	public void setCompany_name(String company_name)
	{
		this.company_name = company_name;
	}

	public String getDba()
	{
		return dba;
	}

	public void setDba(String dba)
	{
		this.dba = dba;
	}

	public String getCompany_site()
	{
		return company_site;
	}

	public void setCompany_site(String company_site)
	{
		this.company_site = company_site;
	}

	public Long getIndustry_id()
	{
		return industry_id;
	}

	public void setIndustry_id(Long industry_id)
	{
		this.industry_id = industry_id;
	}

	public Long getEin()
	{
		return ein;
	}

	public void setEin(Long ein)
	{
		this.ein = ein;
	}

	public String getSic()
	{
		return sic;
	}

	public void setSic(String sic)
	{
		this.sic = sic;
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

	public boolean isIs_active()
	{
		return is_active;
	}

	public void setIs_active(boolean is_active)
	{
		this.is_active = is_active;
	}

	public Long getGl_coding_id()
	{
		return gl_coding_id;
	}

	public void setGl_coding_id(Long gl_coding_id)
	{
		this.gl_coding_id = gl_coding_id;
	}

	public Long getInvoice_settings_id()
	{
		return invoice_settings_id;
	}

	public void setInvoice_settings_id(Long invoice_settings_id)
	{
		this.invoice_settings_id = invoice_settings_id;
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

	public String getCompany_code()
	{
		return company_code;
	}

	public void setCompany_code(String company_code)
	{
		this.company_code = company_code;
	}

	public String getCost_center()
	{
		return cost_center;
	}

	public void setCost_center(String cost_center)
	{
		this.cost_center = cost_center;
	}

	public Long getLegacy_id()
	{
		return legacy_id;
	}

	public void setLegacy_id(Long legacy_id)
	{
		this.legacy_id = legacy_id;
	}

	public Long getNetwork_id()
	{
		return network_id;
	}

	public void setNetwork_id(Long network_id)
	{
		this.network_id = network_id;
	}

	public Boolean getShips_frequently()
	{
		return ships_frequently;
	}

	public void setShips_frequently(Boolean ships_frequently)
	{
		this.ships_frequently = ships_frequently;
	}

	public Boolean getOutbound_messages()
	{
		return outbound_messages;
	}

	public void setOutbound_messages(Boolean outbound_messages)
	{
		this.outbound_messages = outbound_messages;
	}

	public Boolean getIs_edi_customer()
	{
		return is_edi_customer;
	}

	public void setIs_edi_customer(Boolean is_edi_customer)
	{
		this.is_edi_customer = is_edi_customer;
	}

	public boolean isTracking_enabled()
	{
		return tracking_enabled;
	}

	public void setTracking_enabled(boolean tracking_enabled)
	{
		this.tracking_enabled = tracking_enabled;
	}

	public boolean isAuto_pickup_delivery_confirm_enabled()
	{
		return auto_pickup_delivery_confirm_enabled;
	}

	public void setAuto_pickup_delivery_confirm_enabled(boolean auto_pickup_delivery_confirm_enabled)
	{
		this.auto_pickup_delivery_confirm_enabled = auto_pickup_delivery_confirm_enabled;
	}

	public boolean isFood_beverage()
	{
		return food_beverage;
	}

	public void setFood_beverage(boolean food_beverage)
	{
		this.food_beverage = food_beverage;
	}

	@Override
	public String toString()
	{
		return "<br>customer{" + "<br>&emsp; customer_id=" + customer_id + ",<br>&emsp; company_name='" + company_name + '\'' + ",<br>&emsp; dba='" + dba + '\'' + ",<br>&emsp; company_site='" + company_site + '\'' + ",<br>&emsp; industry_id=" + industry_id + ",<br>&emsp; ein=" + ein + ",<br>&emsp; sic='" + sic + '\'' + ",<br>&emsp; created_by=" + created_by + ",<br>&emsp; modified_by=" + modified_by + ",<br>&emsp; created_date=" + created_date + ",<br>&emsp; modified_date=" + modified_date + ",<br>&emsp; is_active=" + is_active + ",<br>&emsp; gl_coding_id=" + gl_coding_id + ",<br>&emsp; invoice_settings_id=" + invoice_settings_id + ",<br>&emsp; bol_signature='" + bol_signature + '\'' + ",<br>&emsp; pod_signature='" + pod_signature + '\'' + ",<br>&emsp; company_code='" + company_code + '\'' + ",<br>&emsp; cost_center='" + cost_center + '\'' + ",<br>&emsp; legacy_id=" + legacy_id + ",<br>&emsp; network_id=" + network_id + ",<br>&emsp; ships_frequently=" + ships_frequently + ",<br>&emsp; outbound_messages=" + outbound_messages + ",<br>&emsp; is_edi_customer=" + is_edi_customer + ",<br>&emsp; tracking_enabled=" + tracking_enabled + ",<br>&emsp; auto_pickup_delivery_confirm_enabled=" + auto_pickup_delivery_confirm_enabled + ",<br>&emsp; food_beverage=" + food_beverage + "<br>}";
	}
}
