package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_credit_history", schema = "pls")
public class customer_credit_history
{
    @Id
    private long customer_credit_history_id;
    private long customer_id;
    private long customer_bill_address_id;
    private String detail;
    private BigDecimal credit;
    private BigDecimal debit;
    private BigDecimal balance;
    private LocalDateTime created_date;
    private Long created_by;
    private Long load_id;

    public long getCustomer_credit_history_id()
    {
        return customer_credit_history_id;
    }

    public void setCustomer_credit_history_id(long customer_credit_history_id)
    {
        this.customer_credit_history_id = customer_credit_history_id;
    }

    public long getCustomer_id()
    {
        return customer_id;
    }

    public void setCustomer_id(long customer_id)
    {
        this.customer_id = customer_id;
    }

    public long getCustomer_bill_address_id()
    {
        return customer_bill_address_id;
    }

    public void setCustomer_bill_address_id(long customer_bill_address_id)
    {
        this.customer_bill_address_id = customer_bill_address_id;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public BigDecimal getCredit()
    {
        return credit;
    }

    public void setCredit(BigDecimal credit)
    {
        this.credit = credit;
    }

    public BigDecimal getDebit()
    {
        return debit;
    }

    public void setDebit(BigDecimal debit)
    {
        this.debit = debit;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public void setBalance(BigDecimal balance)
    {
        this.balance = balance;
    }

    public LocalDateTime getCreated_date()
    {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date)
    {
        this.created_date = created_date;
    }

    public Long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(Long created_by)
    {
        this.created_by = created_by;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
    }
}
