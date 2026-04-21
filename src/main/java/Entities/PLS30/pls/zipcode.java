package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "zipcode", schema = "pls")
public class zipcode {
	@Id
	private Integer detail_id ;
	private String zip_code;
	private String country_code;
	private String county_name;
	private String city;
	private String warning_flag;
	private String pref_last_line_name;
	private String latitude;
	private String longitude;
	private String  time_zone;
	private String day_light_saving;
	private String state_code;
	private Integer created_by;
	private LocalDateTime created_date;
	private Integer modified_by;
	private LocalDateTime modified_date;
	public Integer getDetail_id() {
		return detail_id;
	}
	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	

	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCounty_name() {
		return county_name;
	}
	public void setCounty_name(String county_name) {
		this.county_name = county_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWarning_flag() {
		return warning_flag;
	}
	public void setWarning_flag(String warning_flag) {
		this.warning_flag = warning_flag;
	}
	public String getPref_last_line_name() {
		return pref_last_line_name;
	}
	public void setPref_last_line_name(String pref_last_line_name) {
		this.pref_last_line_name = pref_last_line_name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public String getDay_light_saving() {
		return day_light_saving;
	}
	public void setDay_light_saving(String day_light_saving) {
		this.day_light_saving = day_light_saving;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
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

	@Override
	public String toString() {
		return "zipcode [detail_id=" +detail_id +", country_code="+country_code+", county_name="+county_name+ ", zip_code="+ zip_code+ ",city="+city+",state_code="+state_code+" ]";
	}
}
