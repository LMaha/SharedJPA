package Entities.PLS30.pls;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "approval_types", schema = "pls")
public class approval_types {
    @Id
	private Integer approval_type_id ;
	private String approval_type_name ;
	private String approval_type_desc;
	private Boolean is_active ;
	private Integer created_by;
	private Integer modified_by ;
	private LocalDateTime created_date ;
	private LocalDateTime modified_date;
	public Integer getApproval_type_id() {
		return approval_type_id;
	}
	public void setApproval_type_id(Integer approval_type_id) {
		this.approval_type_id = approval_type_id;
	}
	public String getApproval_type_name() {
		return approval_type_name;
	}
	public void setApproval_type_name(String approval_type_name) {
		this.approval_type_name = approval_type_name;
	}
	public String getApproval_type_desc() {
		return approval_type_desc;
	}
	public void setApproval_type_desc(String approval_type_desc) {
		this.approval_type_desc = approval_type_desc;
	}
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public Integer getCreated_by() {
		return created_by;
	}
	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}
	public Integer getModified_by() {
		return modified_by;
	}
	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public LocalDateTime getModified_date() {
		return modified_date;
	}
	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}
}
