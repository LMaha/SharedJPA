package Entities.PLS20.flatbed;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "holidays", schema = "flatbed")
public class holidays
{
    @Id
    private int holiday_id;
    private String country_code;
    private String holiday_year;
    private Calendar holiday_date;
    private String holiday_name;
    private Boolean active;
    private Boolean floating;

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

    public String getHoliday_year()
    {
        return holiday_year;
    }

    public void setHoliday_year(String holiday_year)
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

    public String getHoliday_name()
    {
        return holiday_name;
    }

    public void setHoliday_name(String holiday_name)
    {
        this.holiday_name = holiday_name;
    }

    public Boolean getActive()
    {
        return active;
    }

    public void setActive(Boolean active)
    {
        this.active = active;
    }

    public Boolean getFloating()
    {
        return floating;
    }

    public void setFloating(Boolean floating)
    {
        this.floating = floating;
    }
}
