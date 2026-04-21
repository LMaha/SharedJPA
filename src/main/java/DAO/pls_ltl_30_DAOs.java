package DAO;

import Entities.PLS30.pls_ltl.p44_quote_request_logs;
import Entities.PLS30.pls_ltl.p44_quote_response_logs;

import javax.persistence.*;
import java.io.IOException;

public class pls_ltl_30_DAOs extends BaseDAO
{
    public pls_ltl_30_DAOs() throws IOException
    {
        super();
    }

    public static p44_quote_request_logs GetP44QuoteRequestLogByRequestId(long request_log_id)
    {
        _p44_quote_request_logs = new p44_quote_request_logs();
        EntityManagerFactory emf30 = SetupPLS30Connection();
        EntityManager em= emf30.createEntityManager();
        String query = "Select req from p44_quote_request_logs req where req.id=:log_id";
        TypedQuery<p44_quote_request_logs> p44RequestTypedQuery = em.createQuery(query, p44_quote_request_logs.class);
        p44RequestTypedQuery.setParameter("log_id", request_log_id);

        try {
            _p44_quote_request_logs = p44RequestTypedQuery.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        finally {
            emf30.close();
            em.close();
        }
        return _p44_quote_request_logs;
    }

    public static p44_quote_response_logs GetP44QuoteResponseLogByUUID(String uuid)
    {
        _p44_quote_response_logs = new p44_quote_response_logs();
        EntityManagerFactory emf30 = SetupPLS30Connection();
        EntityManager em= emf30.createEntityManager();
        String query = "Select resp from p44_quote_response_logs resp where resp.uuid=:uuid";
        TypedQuery<p44_quote_response_logs> p44ResponseTypedQuery = em.createQuery(query, p44_quote_response_logs.class);
        p44ResponseTypedQuery.setParameter("uuid", uuid);

        try {
            _p44_quote_response_logs = p44ResponseTypedQuery.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
        }
        finally {
            emf30.close();
            em.close();
        }
        return _p44_quote_response_logs;
    }
}
