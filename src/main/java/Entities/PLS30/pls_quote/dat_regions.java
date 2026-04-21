package Entities.PLS30.pls_quote;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dat_regions", schema = "pls_quote")
public class dat_regions {
	@Id
	private Integer region_zip;
	private String region;
	private String region_city;
	private String region_state;
	private Integer population;
	private String population_rank;
	private Date created_date;
	private Date updated_date;
	private BigInteger dat_region_id;
	public Integer getRegion_zip() {
		return region_zip;
	}
	public void setRegion_zip(Integer region_zip) {
		this.region_zip = region_zip;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_city() {
		return region_city;
	}
	public void setRegion_city(String region_city) {
		this.region_city = region_city;
	}
	public String getRegion_state() {
		return region_state;
	}
	public void setRegion_state(String region_state) {
		this.region_state = region_state;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public String getPopulation_rank() {
		return population_rank;
	}
	public void setPopulation_rank(String population_rank) {
		this.population_rank = population_rank;
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
	public BigInteger getDat_region_id() {
		return dat_region_id;
	}
	public void setDat_region_id(BigInteger dat_region_id) {
		this.dat_region_id = dat_region_id;
	}

	@Override
	public String toString() {
		return "dat_regions [region_zip=" + region_zip + ", region="+ region+ ", region_city="+ region_city+ ", region_state"+ region_state+" ]";
	}

}
