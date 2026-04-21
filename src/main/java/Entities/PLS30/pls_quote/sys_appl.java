package Entities.PLS30.pls_quote;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_appl", schema = "pls_quote")
public class sys_appl {
    @Id
	private BigInteger sys_appl_id;
	private String app_name;
	private Integer global_rate_multiplier;
	private LocalDateTime created_date;
	private LocalDateTime updated_date;
	public BigInteger getSys_appl_id() {
		return sys_appl_id;
	}
	public void setSys_appl_id(BigInteger sys_appl_id) {
		this.sys_appl_id = sys_appl_id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public Integer getGlobal_rate_multiplier() {
		return global_rate_multiplier;
	}
	public void setGlobal_rate_multiplier(Integer global_rate_multiplier) {
		this.global_rate_multiplier = global_rate_multiplier;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public LocalDateTime getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "sys_appl [sys_appl_id=" +sys_appl_id + ", app_name="+ app_name+ ", global_rate_multiplier="+ global_rate_multiplier+" ]";
	}
}
