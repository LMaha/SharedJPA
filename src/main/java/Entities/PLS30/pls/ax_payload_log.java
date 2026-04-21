package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "ax_payload_log", schema = "pls")
public class ax_payload_log
{
    @Id
    private long ax_payload_id;
    private String entity;
    private Long entity_id;
    private String operation;
    private String payload;
    private Short is_queue_transfer_failed;
    private long created_by;
    private LocalDateTime created_date;
    private String exception_message;
    private String status;

    public long getAx_payload_id()
    {
        return ax_payload_id;
    }

    public void setAx_payload_id(long ax_payload_id)
    {
        this.ax_payload_id = ax_payload_id;
    }

    public String getEntity()
    {
        return entity;
    }

    public void setEntity(String entity)
    {
        this.entity = entity;
    }

    public Long getEntity_id()
    {
        return entity_id;
    }

    public void setEntity_id(Long entity_id)
    {
        this.entity_id = entity_id;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getPayload()
    {
        return payload;
    }

    public void setPayload(String payload)
    {
        this.payload = payload;
    }

    public Short getIs_queue_transfer_failed()
    {
        return is_queue_transfer_failed;
    }

    public void setIs_queue_transfer_failed(Short is_queue_transfer_failed)
    {
        this.is_queue_transfer_failed = is_queue_transfer_failed;
    }

    public long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(long created_by)
    {
        this.created_by = created_by;
    }

    public LocalDateTime getCreated_date()
    {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date)
    {
        this.created_date = created_date;
    }

    public String getException_message()
    {
        return exception_message;
    }

    public void setException_message(String exception_message)
    {
        this.exception_message = exception_message;
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
