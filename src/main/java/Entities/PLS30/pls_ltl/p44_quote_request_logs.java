package Entities.PLS30.pls_ltl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p44_quote_request_logs", schema = "pls_ltl")
public class p44_quote_request_logs
{
    @Id
    private long id;
    private String uuid;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
