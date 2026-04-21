package Entities.PLS30.pls_quote;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dat_rates", schema = "pls_quote")
public class dat_rates {
	@Id
	private String origin_region;
	private String dest_region;
	private BigDecimal van_rate;
	private BigDecimal reefer_rate;
	private BigDecimal flatbed_rate;
	private Date created_date;
	private Date updated_date;
	public String getOrigin_region() {
		return origin_region;
	}
	public void setOrigin_region(String origin_region) {
		this.origin_region = origin_region;
	}
	public String getDest_region() {
		return dest_region;
	}
	public void setDest_region(String dest_region) {
		this.dest_region = dest_region;
	}
	public BigDecimal getVan_rate() {
		return van_rate;
	}
	public void setVan_rate(BigDecimal van_rate) {
		this.van_rate = van_rate;
	}
	public BigDecimal getReefer_rate() {
		return reefer_rate;
	}
	public void setReefer_rate(BigDecimal reefer_rate) {
		this.reefer_rate = reefer_rate;
	}
	public BigDecimal getFlatbed_rate() {
		return flatbed_rate;
	}
	public void setFlatbed_rate(BigDecimal flatbed_rate) {
		this.flatbed_rate = flatbed_rate;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "dat_rates  [origin_region=" + origin_region + ", dest_region="+ dest_region+ ", van_rate="+ van_rate+ ", reefer_rate"+ reefer_rate+", flatbed_rate="+flatbed_rate+" ]";
	}
}
