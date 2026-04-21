package Entities.PLS20.flatbed;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "int_audit", schema = "flatbed")
public class int_audit
{
    @Id
    private long audit_id;
    private String bol;
    private String inb_otb;
    private Long load_id;
    private String message_type;
    private String scac;
    private String shipment_num;
    private Long shipper_org_id;
    private Long viewed_by;
    private LocalDateTime viewed_date;
    private long created_by;
    private LocalDateTime date_created;
    private Long modified_by;
    private LocalDateTime date_modified;
    private int version;
    private String status;

    public long getAudit_id()
    {
        return audit_id;
    }

    public void setAudit_id(long audit_id)
    {
        this.audit_id = audit_id;
    }

    public String getBol()
    {
        return bol;
    }

    public void setBol(String bol)
    {
        this.bol = bol;
    }

    public String getInb_otb()
    {
        return inb_otb;
    }

    public void setInb_otb(String inb_otb)
    {
        this.inb_otb = inb_otb;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
    }

    public String getMessage_type()
    {
        return message_type;
    }

    public void setMessage_type(String message_type)
    {
        this.message_type = message_type;
    }

    public String getScac()
    {
        return scac;
    }

    public void setScac(String scac)
    {
        this.scac = scac;
    }

    public String getShipment_num()
    {
        return shipment_num;
    }

    public void setShipment_num(String shipment_num)
    {
        this.shipment_num = shipment_num;
    }

    public Long getShipper_org_id()
    {
        return shipper_org_id;
    }

    public void setShipper_org_id(Long shipper_org_id)
    {
        this.shipper_org_id = shipper_org_id;
    }

    public Long getViewed_by()
    {
        return viewed_by;
    }

    public void setViewed_by(Long viewed_by)
    {
        this.viewed_by = viewed_by;
    }

    public LocalDateTime getViewed_date()
    {
        return viewed_date;
    }

    public void setViewed_date(LocalDateTime viewed_date)
    {
        this.viewed_date = viewed_date;
    }

    public long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(long created_by)
    {
        this.created_by = created_by;
    }

    public LocalDateTime getDate_created()
    {
        return date_created;
    }

    public void setDate_created(LocalDateTime date_created)
    {
        this.date_created = date_created;
    }

    public Long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(Long modified_by)
    {
        this.modified_by = modified_by;
    }

    public LocalDateTime getDate_modified()
    {
        return date_modified;
    }

    public void setDate_modified(LocalDateTime date_modified)
    {
        this.date_modified = date_modified;
    }

    public int getVersion()
    {
        return version;
    }

    public void setVersion(int version)
    {
        this.version = version;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
