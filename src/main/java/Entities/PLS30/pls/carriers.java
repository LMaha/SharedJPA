package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "carriers", schema = "pls")
public class carriers
{
    @Id
    private long carrier_id;
    private String carrier_name;
    private String dot;
    private String mc;
    private String scac;
    private boolean is_active;
    private long created_by;
    private Long modified_by;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;
    private Boolean certification;
    private String business_name;
    private Long carrier_capability_id;
    private String rmis_id;
    private String duns;
    private String physical_address1;
    private String physical_address2;
    private String physical_city;
    private String physical_state;
    private String physical_zip;
    private String physical_country;
    private Long carrier_safety_rating_id;
    private Long carrier_w9_id;
    private Long carrier_remit_address_id;
    private String physical_phone;
    private String physical_mobile;
    private String physical_fax;
    private Long carrier_factoring_company_id;
    private BigDecimal physical_zip_latitude;
    private BigDecimal physical_zip_longitude;
    private Boolean is_post_to_ax;
    private Long legacy_id;
    private String reason_change_note;

    public long getCarrier_id()
    {
        return carrier_id;
    }

    public void setCarrier_id(long carrier_id)
    {
        this.carrier_id = carrier_id;
    }

    public String getCarrier_name()
    {
        return carrier_name;
    }

    public void setCarrier_name(String carrier_name)
    {
        this.carrier_name = carrier_name;
    }

    public String getDot()
    {
        return dot;
    }

    public void setDot(String dot)
    {
        this.dot = dot;
    }

    public String getMc()
    {
        return mc;
    }

    public void setMc(String mc)
    {
        this.mc = mc;
    }

    public String getScac()
    {
        return scac;
    }

    public void setScac(String scac)
    {
        this.scac = scac;
    }

    public boolean isIs_active()
    {
        return is_active;
    }

    public void setIs_active(boolean is_active)
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

    public Boolean getCertification()
    {
        return certification;
    }

    public void setCertification(Boolean certification)
    {
        this.certification = certification;
    }

    public String getBusiness_name()
    {
        return business_name;
    }

    public void setBusiness_name(String business_name)
    {
        this.business_name = business_name;
    }

    public Long getCarrier_capability_id()
    {
        return carrier_capability_id;
    }

    public void setCarrier_capability_id(Long carrier_capability_id)
    {
        this.carrier_capability_id = carrier_capability_id;
    }

    public String getRmis_id()
    {
        return rmis_id;
    }

    public void setRmis_id(String rmis_id)
    {
        this.rmis_id = rmis_id;
    }

    public String getDuns()
    {
        return duns;
    }

    public void setDuns(String duns)
    {
        this.duns = duns;
    }

    public String getPhysical_address1()
    {
        return physical_address1;
    }

    public void setPhysical_address1(String physical_address1)
    {
        this.physical_address1 = physical_address1;
    }

    public String getPhysical_address2()
    {
        return physical_address2;
    }

    public void setPhysical_address2(String physical_address2)
    {
        this.physical_address2 = physical_address2;
    }

    public String getPhysical_city()
    {
        return physical_city;
    }

    public void setPhysical_city(String physical_city)
    {
        this.physical_city = physical_city;
    }

    public String getPhysical_state()
    {
        return physical_state;
    }

    public void setPhysical_state(String physical_state)
    {
        this.physical_state = physical_state;
    }

    public String getPhysical_zip()
    {
        return physical_zip;
    }

    public void setPhysical_zip(String physical_zip)
    {
        this.physical_zip = physical_zip;
    }

    public String getPhysical_country()
    {
        return physical_country;
    }

    public void setPhysical_country(String physical_country)
    {
        this.physical_country = physical_country;
    }

    public Long getCarrier_safety_rating_id()
    {
        return carrier_safety_rating_id;
    }

    public void setCarrier_safety_rating_id(Long carrier_safety_rating_id)
    {
        this.carrier_safety_rating_id = carrier_safety_rating_id;
    }

    public Long getCarrier_w9_id()
    {
        return carrier_w9_id;
    }

    public void setCarrier_w9_id(Long carrier_w9_id)
    {
        this.carrier_w9_id = carrier_w9_id;
    }

    public Long getCarrier_remit_address_id()
    {
        return carrier_remit_address_id;
    }

    public void setCarrier_remit_address_id(Long carrier_remit_address_id)
    {
        this.carrier_remit_address_id = carrier_remit_address_id;
    }

    public String getPhysical_phone()
    {
        return physical_phone;
    }

    public void setPhysical_phone(String physical_phone)
    {
        this.physical_phone = physical_phone;
    }

    public String getPhysical_mobile()
    {
        return physical_mobile;
    }

    public void setPhysical_mobile(String physical_mobile)
    {
        this.physical_mobile = physical_mobile;
    }

    public String getPhysical_fax()
    {
        return physical_fax;
    }

    public void setPhysical_fax(String physical_fax)
    {
        this.physical_fax = physical_fax;
    }

    public Long getCarrier_factoring_company_id()
    {
        return carrier_factoring_company_id;
    }

    public void setCarrier_factoring_company_id(Long carrier_factoring_company_id)
    {
        this.carrier_factoring_company_id = carrier_factoring_company_id;
    }

    public BigDecimal getPhysical_zip_latitude()
    {
        return physical_zip_latitude;
    }

    public void setPhysical_zip_latitude(BigDecimal physical_zip_latitude)
    {
        this.physical_zip_latitude = physical_zip_latitude;
    }

    public BigDecimal getPhysical_zip_longitude()
    {
        return physical_zip_longitude;
    }

    public void setPhysical_zip_longitude(BigDecimal physical_zip_longitude)
    {
        this.physical_zip_longitude = physical_zip_longitude;
    }

    public Boolean getIs_post_to_ax()
    {
        return is_post_to_ax;
    }

    public void setIs_post_to_ax(Boolean is_post_to_ax)
    {
        this.is_post_to_ax = is_post_to_ax;
    }

    public Long getLegacy_id()
    {
        return legacy_id;
    }

    public void setLegacy_id(Long legacy_id)
    {
        this.legacy_id = legacy_id;
    }

    public String getReason_change_note()
    {
        return reason_change_note;
    }

    public void setReason_change_note(String reason_change_note)
    {
        this.reason_change_note = reason_change_note;
    }
}
