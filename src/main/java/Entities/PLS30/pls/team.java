package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "team", schema = "pls")
public class team
{
    @Id
    private long team_id;
    private String name;
    private String its_login;
    private String its_password;
    private String phone_number;
    private String its_email;
    private Boolean is_active;
    private long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private Long branch_id;
    private Boolean use_for_ratecon;

    public long getTeam_id()
    {
        return team_id;
    }

    public void setTeam_id(long team_id)
    {
        this.team_id = team_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIts_login()
    {
        return its_login;
    }

    public void setIts_login(String its_login)
    {
        this.its_login = its_login;
    }

    public String getIts_password()
    {
        return its_password;
    }

    public void setIts_password(String its_password)
    {
        this.its_password = its_password;
    }

    public String getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number = phone_number;
    }

    public String getIts_email()
    {
        return its_email;
    }

    public void setIts_email(String its_email)
    {
        this.its_email = its_email;
    }

    public Boolean getIs_active()
    {
        return is_active;
    }

    public void setIs_active(Boolean is_active)
    {
        this.is_active = is_active;
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

    public Long getBranch_id()
    {
        return branch_id;
    }

    public void setBranch_id(Long branch_id)
    {
        this.branch_id = branch_id;
    }

    public Boolean getUse_for_ratecon()
    {
        return use_for_ratecon;
    }

    public void setUse_for_ratecon(Boolean use_for_ratecon)
    {
        this.use_for_ratecon = use_for_ratecon;
    }
}
