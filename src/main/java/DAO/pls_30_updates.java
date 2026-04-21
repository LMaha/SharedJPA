package DAO;
import Entities.PLS30.pls_tracking.tracking_orders;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.io.IOException;
import java.util.UUID;


public class pls_30_updates extends BaseDAO {
    public pls_30_updates() throws IOException
    {
                super();
            }
    public static int UpdateTrackingOdersMPids(int loadID)
    {
        _tracking_orders = new tracking_orders();
        int rowsUpdated=0;
        UUID uuid = UUID.randomUUID();
        String _mp_order_id = uuid.toString();
        uuid = UUID.randomUUID();
        String _mp_tracking_request_id = uuid.toString();

                EntityManagerFactory emf30 = SetupPLS30Connection();
        EntityManager em= emf30.createEntityManager();

                String queryString= "update tracking_orders td set td.mp_order_id =:mp_order_id, td.mp_tracking_request_id =:mp_track_req_id where td.load_id=:ldID";
        em.getTransaction().begin();
        Query ldQuery = em.createQuery(queryString );
        ldQuery.setParameter("mp_order_id",_mp_order_id);
        ldQuery.setParameter("mp_track_req_id",_mp_tracking_request_id);
        ldQuery.setParameter("ldID",loadID);
        try {
                rowsUpdated= ldQuery.executeUpdate();
                em.getTransaction().commit();
                em.close();

                    } catch (Exception e) {
                e.printStackTrace();
            }
        finally {
                emf30.close();
            }
       return rowsUpdated;
    }
}