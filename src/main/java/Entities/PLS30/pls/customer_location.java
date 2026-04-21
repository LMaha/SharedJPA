package Entities.PLS30.pls;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_location", schema = "pls")
public class customer_location {
	@Id
	private long customer_location_id ;
	private String location_name ;
	private Integer customer_bill_address_id ;
	private Integer prim_sales_rep_id ;
	private LocalDateTime prim_start_date ;
	private LocalDateTime prim_end_date;
	private Integer sec_sales_rep_id;
	private LocalDateTime sec_start_date;
	private LocalDateTime sec_end_date;
	private Integer logs_coord1_id;
	private LocalDateTime logs_coord1_start_date;
	private LocalDateTime logs_coord1_end_date;
	private Integer logs_coord2_id;
	private LocalDateTime logs_coord2_start_date;
	private LocalDateTime logs_coord2_end_date ;
	private Integer logs_coord3_id;
	private LocalDateTime logs_coord3_start_date;
	private LocalDateTime logs_coord3_end_date;
	private Boolean is_active;
	private Integer customer_id;
	private Integer created_by ;
	private LocalDateTime created_date;
	private Integer modified_by;
	private LocalDateTime modified_date ;
	private Integer customer_glcoding_id;
	private Boolean is_primary;
	private String company_code;
	private String cost_center;
	private Integer cust_sales_rep_id;
	private LocalDateTime cust_start_date;
	private LocalDateTime cust_end_date;
	private Boolean is_commissionable;
	private Integer legacy_id;

	public long getCustomer_location_id() {
		return customer_location_id;
	}
	public void setCustomer_location_id(long customer_location_id) {
		this.customer_location_id = customer_location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public Integer getCustomer_bill_address_id() {
		return customer_bill_address_id;
	}
	public void setCustomer_bill_address_id(Integer customer_bill_address_id) {
		this.customer_bill_address_id = customer_bill_address_id;
	}
	public Integer getPrim_sales_rep_id() {
		return prim_sales_rep_id;
	}
	public void setPrim_sales_rep_id(Integer prim_sales_rep_id) {
		this.prim_sales_rep_id = prim_sales_rep_id;
	}
	public LocalDateTime getPrim_start_date() {
		return prim_start_date;
	}
	public void setPrim_start_date(LocalDateTime prim_start_date) {
		this.prim_start_date = prim_start_date;
	}
	public LocalDateTime getPrim_end_date() {
		return prim_end_date;
	}
	public void setPrim_end_date(LocalDateTime prim_end_date) {
		this.prim_end_date = prim_end_date;
	}
	public Integer getSec_sales_rep_id() {
		return sec_sales_rep_id;
	}
	public void setSec_sales_rep_id(Integer sec_sales_rep_id) {
		this.sec_sales_rep_id = sec_sales_rep_id;
	}
	public LocalDateTime getSec_start_date() {
		return sec_start_date;
	}
	public void setSec_start_date(LocalDateTime sec_start_date) {
		this.sec_start_date = sec_start_date;
	}
	public LocalDateTime getSec_end_date() {
		return sec_end_date;
	}
	public void setSec_end_date(LocalDateTime sec_end_date) {
		this.sec_end_date = sec_end_date;
	}
	public Integer getLogs_coord1_id() {
		return logs_coord1_id;
	}
	public void setLogs_coord1_id(Integer logs_coord1_id) {
		this.logs_coord1_id = logs_coord1_id;
	}
	public LocalDateTime getLogs_coord1_start_date() {
		return logs_coord1_start_date;
	}
	public void setLogs_coord1_start_date(LocalDateTime logs_coord1_start_date) {
		this.logs_coord1_start_date = logs_coord1_start_date;
	}
	public LocalDateTime getLogs_coord1_end_date() {
		return logs_coord1_end_date;
	}
	public void setLogs_coord1_end_date(LocalDateTime logs_coord1_end_date) {
		this.logs_coord1_end_date = logs_coord1_end_date;
	}
	public Integer getLogs_coord2_id() {
		return logs_coord2_id;
	}
	public void setLogs_coord2_id(Integer logs_coord2_id) {
		this.logs_coord2_id = logs_coord2_id;
	}
	public LocalDateTime getLogs_coord2_start_date() {
		return logs_coord2_start_date;
	}
	public void setLogs_coord2_start_date(LocalDateTime logs_coord2_start_date) {
		this.logs_coord2_start_date = logs_coord2_start_date;
	}
	public LocalDateTime getLogs_coord2_end_date() {
		return logs_coord2_end_date;
	}
	public void setLogs_coord2_end_date(LocalDateTime logs_coord2_end_date) {
		this.logs_coord2_end_date = logs_coord2_end_date;
	}
	public Integer getLogs_coord3_id() {
		return logs_coord3_id;
	}
	public void setLogs_coord3_id(Integer logs_coord3_id) {
		this.logs_coord3_id = logs_coord3_id;
	}
	public LocalDateTime getLogs_coord3_start_date() {
		return logs_coord3_start_date;
	}
	public void setLogs_coord3_start_date(LocalDateTime logs_coord3_start_date) {
		this.logs_coord3_start_date = logs_coord3_start_date;
	}
	public LocalDateTime getLogs_coord3_end_date() {
		return logs_coord3_end_date;
	}
	public void setLogs_coord3_end_date(LocalDateTime logs_coord3_end_date) {
		this.logs_coord3_end_date = logs_coord3_end_date;
	}
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	public Integer getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public Integer getModified_by() {
		return modified_by;
	}
	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}
	public LocalDateTime getModified_date() {
		return modified_date;
	}
	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}
	public Integer getCustomer_glcoding_id() {
		return customer_glcoding_id;
	}
	public void setCustomer_glcoding_id(Integer customer_glcoding_id) {
		this.customer_glcoding_id = customer_glcoding_id;
	}
	public Boolean getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(Boolean is_primary) {
		this.is_primary = is_primary;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getCost_center() {
		return cost_center;
	}
	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}
	public Integer getCust_sales_rep_id() {
		return cust_sales_rep_id;
	}
	public void setCust_sales_rep_id(Integer cust_sales_rep_id) {
		this.cust_sales_rep_id = cust_sales_rep_id;
	}
	public LocalDateTime getCust_start_date() {
		return cust_start_date;
	}
	public void setCust_start_date(LocalDateTime cust_start_date) {
		this.cust_start_date = cust_start_date;
	}
	public LocalDateTime getCust_end_date() {
		return cust_end_date;
	}
	public void setCust_end_date(LocalDateTime cust_end_date) {
		this.cust_end_date = cust_end_date;
	}
	public Boolean getIs_commissionable() {
		return is_commissionable;
	}
	public void setIs_commissionable(Boolean is_commissionable) {
		this.is_commissionable = is_commissionable;
	}
	public Integer getLegacy_id() {
		return legacy_id;
	}
	public void setLegacy_id(Integer legacy_id) {
		this.legacy_id = legacy_id;
	}

	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", location_name=" + location_name +" ]";
	}
}
