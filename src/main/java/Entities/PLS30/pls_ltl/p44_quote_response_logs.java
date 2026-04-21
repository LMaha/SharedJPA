package Entities.PLS30.pls_ltl;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p44_quote_response_logs", schema = "pls_ltl")
public class p44_quote_response_logs
{
    @Id
    private long id;
    private Long p44_quote_request_log_id;
    private String uuid;
    private String account_group;
    private String account_code;
    private String carrier_code;
    private String quote_number;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public Long getP44_quote_request_log_id()
    {
        return p44_quote_request_log_id;
    }

    public void setP44_quote_request_log_id(Long p44_quote_request_log_id)
    {
        this.p44_quote_request_log_id = p44_quote_request_log_id;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    public String getAccount_group()
    {
        return account_group;
    }

    public void setAccount_group(String account_group)
    {
        this.account_group = account_group;
    }

    public String getAccount_code()
    {
        return account_code;
    }

    public void setAccount_code(String account_code)
    {
        this.account_code = account_code;
    }

    public String getCarrier_code()
    {
        return carrier_code;
    }

    public void setCarrier_code(String carrier_code)
    {
        this.carrier_code = carrier_code;
    }

    public String getQuote_number()
    {
        return quote_number;
    }

    public void setQuote_number(String quote_number)
    {
        this.quote_number = quote_number;
    }
}
