package DAO;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import Entities.PLS30.pls_quote.dat_rates;
import Entities.PLS30.pls_quote.dat_regions;
import Entities.PLS30.pls_quote.dat_type;
import Entities.PLS30.pls_quote.sys_holiday_adj;
import Entities.PLS30.pls_quote.sys_rate_adj;

public class pls_quote_30_DAOs extends BaseDAO {

	public pls_quote_30_DAOs() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * database:3.0, schema:pls_quote, table:name dat_type
	 * Method expects dat_type column value as equipment parameter, it will return single row.
	 * table name dat_type
	 */
	public static List<dat_type> Get_Dat_Type_BasedOnEquipment(String equipment)
	{	
		_Dat_type = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select r from dat_type r where r.dat_type=:equipType";
		TypedQuery<dat_type> dtQuery = em.createQuery(query,dat_type.class);	
		dtQuery.setParameter("equipType", equipment);	
		try {
			_Dat_type = dtQuery.getResultList();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return _Dat_type;
	}
	

	
	/**
	 * database:3.0, schema:pls_quote, table:name sys_holiday_adj
	 * Method expects mos, day column value as mm and dd, it will return single row.
	 * table name sys_holiday_adj
	 */
	public static sys_holiday_adj Get_sys_holiday_adj(int mn, int d)
	{
		_Sys_holiday_adj = new sys_holiday_adj();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select h from sys_holiday_adj h where h.mos =:mm and h.day=:dd";
		TypedQuery<sys_holiday_adj> dtQuery = em.createQuery(query,sys_holiday_adj.class);	
		dtQuery.setParameter("mm", mn);
		dtQuery.setParameter("dd", d);
		try {
			_Sys_holiday_adj = dtQuery.getSingleResult();
			
		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}	
		return _Sys_holiday_adj;
	}
	
	/**
	 * database:3.0, schema:pls_quote, table:name sys_holiday_adj
	 * Method expects mos column value as mm, it will return single row.
	 * table name sys_holiday_adj
	 */
	public static sys_holiday_adj Get_sys_holiday_adj(int mn)
	{
		_Sys_holiday_adj = new sys_holiday_adj();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select h from sys_holiday_adj h where h.mos =:mm";
		TypedQuery<sys_holiday_adj> dtQuery = em.createQuery(query,sys_holiday_adj.class);	
		dtQuery.setParameter("mm", mn);
		try {
			_Sys_holiday_adj = dtQuery.getSingleResult();
			
		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}	
		return _Sys_holiday_adj;
	}
	
	/**
	 * database:3.0, schema:pls_quote, table:name sys_rate_adj
	 * Method expects dow column value as dw, it will return single row.
	 * table name sys_rate_adj
	 */
	public static sys_rate_adj Get_sys_rate_adj(int dw)
	{
		_Sys_rate_adj = new sys_rate_adj();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select sr from sys_rate_adj sr where sr.dow=:_dw";
		TypedQuery<sys_rate_adj> dtQuery = em.createQuery(query,sys_rate_adj.class);	
		dtQuery.setParameter("_dw", dw);
		try {
			_Sys_rate_adj = dtQuery.getSingleResult();
			
		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}	
		return _Sys_rate_adj;
	}
	
	/**
	 * database:3.0, schema:pls_quote, table:name dat_regions
	 * Method expects region_zip column value as regionzip, it will return single row.
	 * table name dat_regions
	 */
	public static dat_regions Get_dat_regions(int regionzip)
	{
		_Dat_regions = new dat_regions();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select dr from dat_regions dr where dr.region_zip>=:rz order by region_zip asc";
		TypedQuery<dat_regions> dtQuery = em.createQuery(query,dat_regions.class);	
		dtQuery.setParameter("rz", regionzip);
		dtQuery.setMaxResults(1);
		try {
			_Dat_regions = dtQuery.getSingleResult();
			
		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}	
		return _Dat_regions;
	}
	
	/**
	 * database:3.0, schema:pls_quote, table:name dat_rates
	 * Method expects origin_region, dest_region column values as origin, dest it will return single row.
	 * table name _dat_rates 
	 */
	public static dat_rates Get_dat_rates(String origin, String dest)
	{
		_Dat_rates = new dat_rates();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select dr from dat_rates dr where dr.origin_region=:ori and dr.dest_region=:des";
		TypedQuery<dat_rates> dtQuery = em.createQuery(query,dat_rates.class);	
		dtQuery.setParameter("ori", origin);
		dtQuery.setParameter("des", dest);
		try {
			_Dat_rates  = dtQuery.getSingleResult();
			
		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}	
		return _Dat_rates;
	}

}
