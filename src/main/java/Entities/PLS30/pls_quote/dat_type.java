package Entities.PLS30.pls_quote;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dat_type", schema = "pls_quote")
public class dat_type {	
	@Id
	private BigInteger dat_type_id;
	private Integer sys_appl_id;
	private String dat_type;
	private Integer min_load_rate;
	private BigDecimal rate_multiplier;

	//private Integer parent_dat_type_id;
	@ManyToOne
	@JoinColumn(name="parent_dat_type_id")
	private dat_type parent;
	
	public dat_type getParent() {
		return parent;
	}
	public void setParent(dat_type parent) {
		this.parent = parent;
	}
	public BigInteger getDat_type_id() {
		return dat_type_id;
	}
	public void setDat_type_id(BigInteger dat_type_id) {
		this.dat_type_id = dat_type_id;
	}
	public Integer getSys_appl_id() {
		return sys_appl_id;
	}
	public void setSys_appl_id(Integer sys_appl_id) {
		this.sys_appl_id = sys_appl_id;
	}
	public String getDat_type() {
		return dat_type;
	}
	public void setDat_type(String dat_type) {
		this.dat_type = dat_type;
	}
	public Integer getMin_load_rate() {
		return min_load_rate;
	}
	public void setMin_load_rate(Integer min_load_rate) {
		this.min_load_rate = min_load_rate;
	}
	public BigDecimal getRate_multiplier() {
		return rate_multiplier;
	}
	public void setRate_multiplier(BigDecimal rate_multiplier) {
		this.rate_multiplier = rate_multiplier;
	}
//	public Integer getParent_dat_type_id() {
//		return parent_dat_type_id;
//	}
//
//	public void setParent_dat_type_id(Integer parent_dat_type_id) {
//		this.parent_dat_type_id = parent_dat_type_id;
//	}
	
	@Override
	public String toString() {
		return "dat_type [dat_type=" + dat_type + ", min_load_rate="+ min_load_rate+ ", rate_multipler="+ rate_multiplier+ ",parent="+parent+" ]";
	}
}
