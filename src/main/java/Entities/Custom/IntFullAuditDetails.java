package Entities.Custom;

import Entities.PLS20.flatbed.int_audit;
import Entities.PLS20.flatbed.int_audit_details;

public class IntFullAuditDetails
{
    private int_audit int_audit;
    private int_audit_details int_audit_details;

    public IntFullAuditDetails(Entities.PLS20.flatbed.int_audit int_audit, Entities.PLS20.flatbed.int_audit_details int_audit_details)
    {
        this.int_audit = int_audit;
        this.int_audit_details = int_audit_details;
    }

    public Entities.PLS20.flatbed.int_audit getInt_audit()
    {
        return int_audit;
    }

    public void setInt_audit(Entities.PLS20.flatbed.int_audit int_audit)
    {
        this.int_audit = int_audit;
    }

    public Entities.PLS20.flatbed.int_audit_details getInt_audit_details()
    {
        return int_audit_details;
    }

    public void setInt_audit_details(Entities.PLS20.flatbed.int_audit_details int_audit_details)
    {
        this.int_audit_details = int_audit_details;
    }
}
