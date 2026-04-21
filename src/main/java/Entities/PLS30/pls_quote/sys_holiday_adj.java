package Entities.PLS30.pls_quote;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sys_holiday_adj", schema = "pls_quote")
public class sys_holiday_adj {
	@Id
	private BigInteger sys_rate_adj_id;
	private Integer sys_appl_id;
	private Integer mos;
	private Integer day;
	private Integer lastdow;
	private Integer firstdow;
	private BigDecimal rate_adjustment;
	private String holiday_name;
	private LocalDateTime created_date;
	private LocalDateTime updated_date;
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
	public Integer getMos() {
		return mos;
	}
	public void setMos(Integer mos) {
		this.mos = mos;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getLastdow() {
		return lastdow;
	}
	public void setLastdow(Integer lastdow) {
		this.lastdow = lastdow;
	}
	public Integer getFirstdow() {
		return firstdow;
	}
	public void setFirstdow(Integer firstdow) {
		this.firstdow = firstdow;
	}
	public BigDecimal getRate_adjustment() {
		return rate_adjustment;
	}
	public void setRate_adjustment(BigDecimal rate_adjustment) {
		this.rate_adjustment = rate_adjustment;
	}
	public String getHoliday_name() {
		return holiday_name;
	}
	public void setHoliday_name(String holiday_name) {
		this.holiday_name = holiday_name;
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
		return "sys_holiday_adj [sys_rate_adj_id=" +sys_rate_adj_id + ", sys_appl_id="+ sys_appl_id+ ", sys_appl_id="+ sys_appl_id+ ", mos="+ mos+", day="+day+",rate_adjustment="+rate_adjustment+",holiday_name="+holiday_name+" ]";
	}
}

