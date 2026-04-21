package Entities.Custom;

import Entities.PLS30.pls.customer_bill_address;
import Entities.PLS30.pls.customer_location;

public class CustomerBillingDetails
{
    private Entities.PLS30.pls.customer customer;
    private customer_bill_address customer_bill_address;
    private customer_location customer_location;

    public CustomerBillingDetails(Entities.PLS30.pls.customer customer, Entities.PLS30.pls.customer_location customer_location, Entities.PLS30.pls.customer_bill_address customer_bill_address)
    {
        this.customer = customer;
        this.customer_location = customer_location;
        this.customer_bill_address = customer_bill_address;
    }

    public Entities.PLS30.pls.customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Entities.PLS30.pls.customer customer)
    {
        this.customer = customer;
    }

    public Entities.PLS30.pls.customer_bill_address getCustomer_bill_address()
    {
        return customer_bill_address;
    }

    public void setCustomer_bill_address(Entities.PLS30.pls.customer_bill_address customer_bill_address)
    {
        this.customer_bill_address = customer_bill_address;
    }

    public Entities.PLS30.pls.customer_location getCustomer_location()
    {
        return customer_location;
    }

    public void setCustomer_location(Entities.PLS30.pls.customer_location customer_location)
    {
        this.customer_location = customer_location;
    }
}
