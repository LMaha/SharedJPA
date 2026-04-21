package Entities.PLS30.pls_quote;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sys_rate_adj", schema = "pls_quote")
public class sys_rate_adj {
	@Id
	private BigInteger sys_rate_adj_id;
	private Integer sys_appl_id;
	private Integer dow;
	private BigDecimal rate_adjustment;
	private LocalDateTime created_date;
	private LocalDateTime updated_date ;
	public BigInteger getSys_rate_adj_id() {
		return sys_rate_adj_id;
	}
	public void setSys_rate_adj_id(BigInteger sys_rate_adj_id) {
		this.sys_rate_adj_id = sys_rate_adj_id;
	}
	public Integer getSys_appl_id() {
		return sys_appl_id;
	}
	public void setSys_appl_id(Integer sys_appl_id) {
		this.sys_appl_id = sys_appl_id;
	}
	public Integer getDow() {
		return dow;
	}
	public void setDow(Integer dow) {
		this.dow = dow;
	}
	public BigDecimal getRate_adjustment() {
		return rate_adjustment;
	}
	public void setRate_adjustment(BigDecimal rate_adjustment) {
		this.rate_adjustment = rate_adjustment;
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
		return "sys_rate_adj [sys_rate_adj_id=" +sys_rate_adj_id + ", sys_appl_id="+ sys_appl_id+ ", dow="+ sys_appl_id+ ", dow="+dow+", rate_adjustment="+rate_adjustment+" ]";
	}
}
