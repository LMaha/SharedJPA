package Entities.PLS30.pls;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "load_aux", schema = "pls")
public class load_aux
{
    @Id
    private long load_aux_id;
    private Long load_id;
    private String special;
    private String container;
    private String coil;
    private String release;
    private String shipment;
    private String order_no;
    private String shipper;
    private String trailer;
    private String general_ledger;
    private String key_rec;
    private String model;
    private String serial;
    private String asset;
    private String dsm;
    private String fpo;
    private String fr;
    private String job_name;
    private String tracking;
    private String unit;
    private String vessel_name;
    private String vm;
    private String work;
    private String bpo;
    private String cpo;
    private String carrier_invoice;
    private Boolean is_active;
    private Long created_by;
    private LocalDateTime created_date;
    private Long modified_by;
    private LocalDateTime modified_date;
    private String invoice_price;
    private String apt;
    private String carrier_total_cost;
    private String other_required;
    private String part;
    private String purchase_order;
    private String ticket;
    private String customer_load;
    private String batch_number;

    public long getLoad_aux_id()
    {
        return load_aux_id;
    }

    public void setLoad_aux_id(long load_aux_id)
    {
        this.load_aux_id = load_aux_id;
    }

    public Long getLoad_id()
    {
        return load_id;
    }

    public void setLoad_id(Long load_id)
    {
        this.load_id = load_id;
    }

    public String getSpecial()
    {
        return special;
    }

    public void setSpecial(String special)
    {
        this.special = special;
    }

    public String getContainer()
    {
        return container;
    }

    public void setContainer(String container)
    {
        this.container = container;
    }

    public String getCoil()
    {
        return coil;
    }

    public void setCoil(String coil)
    {
        this.coil = coil;
    }

    public String getRelease()
    {
        return release;
    }

    public void setRelease(String release)
    {
        this.release = release;
    }

    public String getShipment()
    {
        return shipment;
    }

    public void setShipment(String shipment)
    {
        this.shipment = shipment;
    }

    public String getOrder_no()
    {
        return order_no;
    }

    public void setOrder_no(String order_no)
    {
        this.order_no = order_no;
    }

    public String getShipper()
    {
        return shipper;
    }

    public void setShipper(String shipper)
    {
        this.shipper = shipper;
    }

    public String getTrailer()
    {
        return trailer;
    }

    public void setTrailer(String trailer)
    {
        this.trailer = trailer;
    }

    public String getGeneral_ledger()
    {
        return general_ledger;
    }

    public void setGeneral_ledger(String general_ledger)
    {
        this.general_ledger = general_ledger;
    }

    public String getKey_rec()
    {
        return key_rec;
    }

    public void setKey_rec(String key_rec)
    {
        this.key_rec = key_rec;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getSerial()
    {
        return serial;
    }

    public void setSerial(String serial)
    {
        this.serial = serial;
    }

    public String getAsset()
    {
        return asset;
    }

    public void setAsset(String asset)
    {
        this.asset = asset;
    }

    public String getDsm()
    {
        return dsm;
    }

    public void setDsm(String dsm)
    {
        this.dsm = dsm;
    }

    public String getFpo()
    {
        return fpo;
    }

    public void setFpo(String fpo)
    {
        this.fpo = fpo;
    }

    public String getFr()
    {
        return fr;
    }

    public void setFr(String fr)
    {
        this.fr = fr;
    }

    public String getJob_name()
    {
        return job_name;
    }

    public void setJob_name(String job_name)
    {
        this.job_name = job_name;
    }

    public String getTracking()
    {
        return tracking;
    }

    public void setTracking(String tracking)
    {
        this.tracking = tracking;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getVessel_name()
    {
        return vessel_name;
    }

    public void setVessel_name(String vessel_name)
    {
        this.vessel_name = vessel_name;
    }

    public String getVm()
    {
        return vm;
    }

    public void setVm(String vm)
    {
        this.vm = vm;
    }

    public String getWork()
    {
        return work;
    }

    public void setWork(String work)
    {
        this.work = work;
    }

    public String getBpo()
    {
        return bpo;
    }

    public void setBpo(String bpo)
    {
        this.bpo = bpo;
    }

    public String getCpo()
    {
        return cpo;
    }

    public void setCpo(String cpo)
    {
        this.cpo = cpo;
    }

    public String getCarrier_invoice()
    {
        return carrier_invoice;
    }

    public void setCarrier_invoice(String carrier_invoice)
    {
        this.carrier_invoice = carrier_invoice;
    }

    public Boolean getIs_active()
    {
        return is_active;
    }

    public void setIs_active(Boolean is_active)
    {
        this.is_active = is_active;
    }

    public Long getCreated_by()
    {
        return created_by;
    }

    public void setCreated_by(Long created_by)
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

    public Long getModified_by()
    {
        return modified_by;
    }

    public void setModified_by(Long modified_by)
    {
        this.modified_by = modified_by;
    }

    public LocalDateTime getModified_date()
    {
        return modified_date;
    }

    public void setModified_date(LocalDateTime modified_date)
    {
        this.modified_date = modified_date;
    }

    public String getInvoice_price()
    {
        return invoice_price;
    }

    public void setInvoice_price(String invoice_price)
    {
        this.invoice_price = invoice_price;
    }

    public String getApt()
    {
        return apt;
    }

    public void setApt(String apt)
    {
        this.apt = apt;
    }

    public String getCarrier_total_cost()
    {
        return carrier_total_cost;
    }

    public void setCarrier_total_cost(String carrier_total_cost)
    {
        this.carrier_total_cost = carrier_total_cost;
    }

    public String getOther_required()
    {
        return other_required;
    }

    public void setOther_required(String other_required)
    {
        this.other_required = other_required;
    }

    public String getPart()
    {
        return part;
    }

    public void setPart(String part)
    {
        this.part = part;
    }

    public String getPurchase_order()
    {
        return purchase_order;
    }

    public void setPurchase_order(String purchase_order)
    {
        this.purchase_order = purchase_order;
    }

    public String getTicket()
    {
        return ticket;
    }

    public void setTicket(String ticket)
    {
        this.ticket = ticket;
    }

    public String getCustomer_load()
    {
        return customer_load;
    }

    public void setCustomer_load(String customer_load)
    {
        this.customer_load = customer_load;
    }

    public String getBatch_number()
    {
        return batch_number;
    }

    public void setBatch_number(String batch_number)
    {
        this.batch_number = batch_number;
    }
}
