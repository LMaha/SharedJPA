package Entities.PLS30.pls;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "pls")
public class users
{
	@Id
	private long user_id;
	private String first_name;
	private String last_name;
	private String email_id;
	private Long desk_number;
	private Long mobile_number;
	private boolean is_active;
	private LocalDateTime created_date;
	private LocalDateTime modified_date;
	private long created_by;
	private Long modified_by;
	private boolean is_sales_person;
	private boolean is_manager;
	private Long manager_id;
	private Long team_id;
	private Long pls_office_id;
	private Long legacy_id;
	private String payroll_id;
	private Date pls_hire_date;
	private Date sales_start_date;

	public long getUser_id()
	{
		return user_id;
	}

	public void setUser_id(long user_id)
	{
		this.user_id = user_id;
	}

	public String getFirst_name()
	{
		return first_name;
	}

	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}

	public String getLast_name()
	{
		return last_name;
	}

	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}

	public String getEmail_id()
	{
		return email_id;
	}

	public void setEmail_id(String email_id)
	{
		this.email_id = email_id;
	}

	public Long getDesk_number()
	{
		return desk_number;
	}

	public void setDesk_number(Long desk_number)
	{
		this.desk_number = desk_number;
	}

	public Long getMobile_number()
	{
		return mobile_number;
	}

	public void setMobile_number(Long mobile_number)
	{
		this.mobile_number = mobile_number;
	}

	public boolean isIs_active()
	{
		return is_active;
	}

	public void setIs_active(boolean is_active)
	{
		this.is_active = is_active;
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

	public long getCreated_by()
	{
		return created_by;
	}

	public void setCreated_by(long created_by)
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

	public boolean isIs_sales_person()
	{
		return is_sales_person;
	}

	public void setIs_sales_person(boolean is_sales_person)
	{
		this.is_sales_person = is_sales_person;
	}

	public boolean isIs_manager()
	{
		return is_manager;
	}

	public void setIs_manager(boolean is_manager)
	{
		this.is_manager = is_manager;
	}

	public Long getManager_id()
	{
		return manager_id;
	}

	public void setManager_id(Long manager_id)
	{
		this.manager_id = manager_id;
	}

	public Long getTeam_id()
	{
		return team_id;
	}

	public void setTeam_id(Long team_id)
	{
		this.team_id = team_id;
	}

	public Long getPls_office_id()
	{
		return pls_office_id;
	}

	public void setPls_office_id(Long pls_office_id)
	{
		this.pls_office_id = pls_office_id;
	}

	public Long getLegacy_id()
	{
		return legacy_id;
	}

	public void setLegacy_id(Long legacy_id)
	{
		this.legacy_id = legacy_id;
	}

	public String getPayroll_id()
	{
		return payroll_id;
	}

	public void setPayroll_id(String payroll_id)
	{
		this.payroll_id = payroll_id;
	}

	public Date getPls_hire_date()
	{
		return pls_hire_date;
	}

	public void setPls_hire_date(Date pls_hire_date)
	{
		this.pls_hire_date = pls_hire_date;
	}

	public Date getSales_start_date()
	{
		return sales_start_date;
	}

	public void setSales_start_date(Date sales_start_date)
	{
		this.sales_start_date = sales_start_date;
	}

	@Override
	public String toString()
	{
		return "<br>users{" + "<br>&emsp; user_id=" + user_id + ",<br>&emsp; first_name='" + first_name + '\'' + ",<br>&emsp; last_name='" + last_name + '\'' + ",<br>&emsp; email_id='" + email_id + '\'' + ",<br>&emsp; desk_number=" + desk_number + ",<br>&emsp; mobile_number=" + mobile_number + ",<br>&emsp; is_active=" + is_active + ",<br>&emsp; created_date=" + created_date + ",<br>&emsp; modified_date=" + modified_date + ",<br>&emsp; created_by=" + created_by + ",<br>&emsp; modified_by=" + modified_by + ",<br>&emsp; is_sales_person=" + is_sales_person + ",<br>&emsp; is_manager=" + is_manager + ",<br>&emsp; manager_id=" + manager_id + ",<br>&emsp; team_id=" + team_id + ",<br>&emsp; pls_office_id=" + pls_office_id + ",<br>&emsp; legacy_id=" + legacy_id + ",<br>&emsp; payroll_id='" + payroll_id + '\'' + ",<br>&emsp; pls_hire_date=" + pls_hire_date + ",<br>&emsp; sales_start_date=" + sales_start_date + "<br>}";
	}

	public String displayBasicUserInfo()
	{
		return String.format("%s %s [%s, %s]", first_name, last_name, email_id, user_id);
	}
}

