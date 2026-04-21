package DAO;

import Entities.Custom.IntFullAuditDetails;
import Entities.PLS20.flatbed.holidays;
import Entities.PLS20.flatbed.international_holidays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class flatbed_20_DAOs extends BaseDAO
{
    public flatbed_20_DAOs() throws IOException
    {
        super();
    }

    public static List<holidays> GetHolidaysByYear(int year, int futureYear)
    {
        _holidays = new ArrayList<>();
        EntityManagerFactory emf20 = SetupPLS20Connection();
        EntityManager em = emf20.createEntityManager();
        String query = "Select hl from holidays hl where (hl.holiday_year=:futureYear and hl.floating=:isFloating) or hl.holiday_year=:year";
        TypedQuery<holidays> holidayTypedQuery = em.createQuery(query, holidays.class);
        holidayTypedQuery.setParameter("futureYear", String.valueOf(futureYear));
        holidayTypedQuery.setParameter("year", String.valueOf(year));
        holidayTypedQuery.setParameter("isFloating", false);
        try {
            _holidays = holidayTypedQuery.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        finally {
            emf20.close();
            em.close();
        }
        return _holidays;
    }

    public static List<international_holidays> GetInternationalHolidaysByYear(int year, int futureYear)
    {
        _international_holidays= new ArrayList<>();
        EntityManagerFactory emf20 = SetupPLS20Connection();
        EntityManager em= emf20.createEntityManager();
        String query = "Select hl from international_holidays hl where (hl.holiday_year=:futureYear and hl.country_code=:countryCode) or hl.holiday_year=:year";
        TypedQuery<international_holidays> holidayTypedQuery = em.createQuery(query,international_holidays.class);
        holidayTypedQuery.setParameter("futureYear", futureYear);
        holidayTypedQuery.setParameter("year", year);
        holidayTypedQuery.setParameter("countryCode", "CAN");
        try {
            _international_holidays = holidayTypedQuery.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        finally {
            emf20.close();
            em.close();
        }
        return _international_holidays;
    }

    /**
     * database:2.0, schema:flatbed, table:int_audit, int_audit_details
     * Return list of AP or AR audit details for a list of load ids
     */
    public static List<IntFullAuditDetails> GetIntFullAuditDetails(List<Long> loadIds, String messageType)
    {
        List<IntFullAuditDetails> queryResults = null;
        EntityManagerFactory emf20 = SetupPLS20Connection();
        EntityManager em = emf20.createEntityManager();

        String queryString = "select new Entities.Custom.IntFullAuditDetails(ia, iad) from int_audit_details iad " +
                             "join int_audit ia on ia.audit_id = iad.audit_id " +
                             "where ia.message_type = :messageType and ia.load_id in :loadIds";
        TypedQuery<IntFullAuditDetails> query = em.createQuery(queryString, IntFullAuditDetails.class);
        query.setParameter("messageType", messageType);
        query.setParameter("loadIds", loadIds);

        try {
            queryResults = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            emf20.close();
            em.close();
        }
        return queryResults;
    }
}
