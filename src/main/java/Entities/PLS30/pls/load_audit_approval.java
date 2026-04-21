package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_audit_approval", schema = "pls")
public class load_audit_approval
{
    @Id
    private long load_audit_approval_id;
    private long audit_type_id;
    private Long load_subtype_id;
    private int approval_type_id;
    private long load_id;
    private long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private String value;

    public long getLoad_audit_approval_id()
    {
        return load_audit_approval_id;
    }

    public void setLoad_audit_approval_id(long load_audit_approval_id)
    {
        this.load_audit_approval_id = load_audit_approval_id;
    }

    public long getAudit_type_id()
    {
        return audit_type_id;
    }

    public void setAudit_type_id(long audit_type_id)
    {
        this.audit_type_id = audit_type_id;
    }

    public Long getLoad_subtype_id()
    {
        return load_subtype_id;
    }

    public void setLoad_subtype_id(Long load_subtype_id)
    {
        this.load_subtype_id = load_subtype_id;
    }

    public int getApproval_type_id()
    {
        return approval_type_id;
    }

    public void setApproval_type_id(int approval_type_id)
    {
        this.approval_type_id = approval_type_id;
    }

    public long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(long load_id)
    {
        this.load_id = load_id;
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

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
