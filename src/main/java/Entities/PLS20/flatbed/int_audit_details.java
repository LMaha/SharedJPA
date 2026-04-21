package Entities.PLS20.flatbed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "int_audit_details", schema = "flatbed")
public class int_audit_details
{
    @Id
    private long audit_detail_id;
    private Long audit_id;
    private String message;

    public long getAudit_detail_id()
    {
        return audit_detail_id;
    }

    public void setAudit_detail_id(long audit_detail_id)
    {
        this.audit_detail_id = audit_detail_id;
    }

    public Long getAudit_id()
    {
        return audit_id;
    }

    public void setAudit_id(Long audit_id)
    {
        this.audit_id = audit_id;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
