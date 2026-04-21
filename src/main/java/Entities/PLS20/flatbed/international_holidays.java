package Entities.PLS20.flatbed;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "international_holidays", schema = "flatbed")
public class international_holidays
{
    @Id
    private int holiday_id;
    private String country_code;
    private String state_code;
    private String city;
    private int holiday_year;
    private Calendar holiday_date;
    private Calendar observed_date;
    private String holiday_name;
    private boolean active;
    private boolean observed;

    public int getHoliday_id()
    {
        return holiday_id;
    }

    public void setHoliday_id(int holiday_id)
    {
        this.holiday_id = holiday_id;
    }

    public String getCountry_code()
    {
        return country_code;
    }

    public void setCountry_code(String country_code)
    {
        this.country_code = country_code;
    }

    public String getState_code()
    {
        return state_code;
    }

    public void setState_code(String state_code)
    {
        this.state_code = state_code;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getHoliday_year()
    {
        return holiday_year;
    }

    public void setHoliday_year(int holiday_year)
    {
        this.holiday_year = holiday_year;
    }

    public Calendar getHoliday_date()
    {
        return holiday_date;
    }

    public void setHoliday_date(Calendar holiday_date)
    {
        this.holiday_date = holiday_date;
    }

    public Calendar getObserved_date()
    {
        return observed_date;
    }

    public void setObserved_date(Calendar observed_date)
    {
        this.observed_date = observed_date;
    }

    public String getHoliday_name()
    {
        return holiday_name;
    }

    public void setHoliday_name(String holiday_name)
    {
        this.holiday_name = holiday_name;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
    }

    public boolean isObserved()
    {
        return observed;
    }

    public void setObserved(boolean observed)
    {
        this.observed = observed;
    }
}
