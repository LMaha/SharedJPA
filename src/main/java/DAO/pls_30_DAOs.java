package DAO;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import Entities.Custom.CustomerBillingDetails;
import Entities.PLS30.pls.*;
import Entities.PLS30.pls_tracking.order_stops;
import Entities.PLS30.pls_tracking.tracking_orders;

public class pls_30_DAOs extends BaseDAO  {

	public pls_30_DAOs() throws IOException {
		super();
	}

	/**
	 * database:3.0, schema:pls, table:customer
	 * Return customer details for a load id
	 */
	public static customer GetCustomerwithLoadId(long loadId)
	{
		customer c = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select c from customer c join load l on c.customer_id = l.customer_id where l.load_id =:loadId";
		TypedQuery<customer> ldQuery = em.createQuery(queryString, customer.class);
		ldQuery.setParameter("loadId", loadId);

		try {
			c = ldQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return c;
	}
	/**
	 * database:3.0, schema:pls_tracking, table:tracking_orders
	 * Get tracking order details for load id
	 */
	public static tracking_orders GettrackingOrder(int loadID)
	{

		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select tl from tracking_orders tl where tl.load_id=:loadId";
		TypedQuery<tracking_orders> ltrQuery = em.createQuery(query,tracking_orders.class);
		ltrQuery.setParameter("loadId", loadID);
		try {
			_tracking_orders = ltrQuery.getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}

		return _tracking_orders ;
	}

	/**
	 * database:3.0, schema:pls, table:load
	 * Get load details for a load id
	 */
	public static load GetLoadwithLoadId(long loadId)
	{
		_load= new load();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select l from load l where l.load_id=:loadId";
		TypedQuery<load> ldQuery = em.createQuery(query,load.class);
		ldQuery.setParameter("loadId", loadId);
		try {
			_load = ldQuery.getSingleResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return _load;
	}

	/**
	 * database: 3.0, schema: pls, table: customer
	 * @param customerId
	 * 		Customer id, may also be referred to as org id for customer
	 * @return
	 * 		List of loads for a specific customer
	 */
	public static List<load> GetLoadsWithCustomerId(long customerId)
	{
		return GetLoads(customerId, null, null, null, null, null);
	}


	/**
	 * database:3.0, schema:pls, table:name zipcode
	 * Method expects state_code column value as stateCode, it will return rows.
	 * table name zipcode
	 */
	public static List<zipcode> Get_zipcodes(String stateCode)
	{
		_ZipcodeList = new ArrayList<>();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select zs from zipcode zs where zs.country_code='USA' and zs.state_code=:st ";
		TypedQuery<zipcode> dtQuery = em.createQuery(query,zipcode.class);
		dtQuery.setParameter("st", stateCode);
		try {
			_ZipcodeList  = dtQuery.getResultList();

		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return _ZipcodeList ;
	}

	/**
	 * database:3.0, schema:pls, table:name zipcode
	 * Method expects state_code column value as stateCode, it will return rows.
	 * table name zipcode
	 */
	public static zipcode Get_zipcode(String country,String stateCode, String zipcode)
	{
		_Zipcode = new zipcode();
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em= emf30.createEntityManager();
		String query = "Select zs from zipcode zs where zs.country_code=:crt and zs.state_code=:st and zs.zip_code=:zp order by zs.zip_code, zs.pref_last_line_name, zs.state_code, zs.county_name ";
		TypedQuery<zipcode> dtQuery = em.createQuery(query,zipcode.class);
		dtQuery.setParameter("st", stateCode);
		dtQuery.setParameter("zp", zipcode);
		dtQuery.setParameter("crt", country);
		dtQuery.setMaxResults(1);
		try {
			_Zipcode  = dtQuery.getSingleResult();

		} catch (NoResultException  e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return _Zipcode ;
	}

	/**
	 * database:3.0, schema:pls, table:user
	 * Lookup user account information using email address
	 */
	public static users GetUserByEmail(String email)
	{
		users u = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select u from users u where lower(u.email_id) = lower(:email)";
		TypedQuery<users> ldQuery = em.createQuery(queryString, users.class);
		ldQuery.setParameter("email", email);

		try {
			u = ldQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return u;
	}

	/**
	 * database:3.0, schema:pls, table:user
	 * Get user accounts using list of email addresses
	 */
	public static List<users> GetUsersByEmail(List<String> emailList)
	{
		List<users> userList = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		emailList.replaceAll(String::toLowerCase);

		String queryString = "select u from users u where lower(u.email_id) in :emailList";
		TypedQuery<users> query = em.createQuery(queryString, users.class);
		query.setParameter("emailList", emailList);

		try {
			userList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return userList;
	}

	/**
	 * database:3.0, schema:pls, table:user, load
	 * Lookup user account information that created a specific load id
	 */
	public static users GetCreatedByUserByLoadId(long loadId)
	{
		users u = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select u from users u " +
				"join load l on l.created_by = u.user_id " +
				"where l.load_id = :loadId";
		TypedQuery<users> ldQuery = em.createQuery(queryString, users.class);
		ldQuery.setParameter("loadId", loadId);

		try {
			u = ldQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return u;
	}

	/**
	 * database:3.0, schema:pls, table:load_request_adjustment
	 * Look up previous adjustment requests made for a load
	 */
	public static List<load_request_adjustment> GetLoadRequestAdjustmentsByLoadId(long loadId)
	{
		List<load_request_adjustment> lra = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lra from load_request_adjustment lra where lra.load_id = :loadId";
		TypedQuery<load_request_adjustment> query = em.createQuery(queryString, load_request_adjustment.class);
		query.setParameter("loadId", loadId);

		try {
			lra = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return lra;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment
	 * Return list of adjustable load ids
	 * wasPrevAdjusted - If load was previously adjusted or never adjusted
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 */
	public static List<Long> GetAdjustableLoads(boolean wasPrevAdjusted, long minLoadId, List<Long> personIdList)
	{
		List<Long> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l.load_id from load l " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = :wasPrevAdjusted and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = :wasPrevAdjusted and l.load_id > :minLoadId and l.created_by in :personIdList";
		TypedQuery<Long> query = em.createQuery(queryString, Long.class);
		query.setParameter("wasPrevAdjusted", wasPrevAdjusted);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment
	 * Return list of adjustable load ids
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 * isPricingAdj - Whether load has had a pricing adjustment
	 * isCarrierAdj - Whether load has had a carrier adjustment
	 * isDataAdj - Whether load has had a data adjustment
	 * isCustomerAdj - Whether load has had a customer adjustment
	 * If multiple adjustment types are selected, searches whether load has had a combo adjustment with those set to true
	 */
	public static List<Long> GetAdjustedLoads(long minLoadId, List<Long> personIdList, boolean isPricingAdj, boolean isCarrierAdj, boolean isDataAdj, boolean isCustomerAdj)
	{
		List<Long> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l.load_id from load l " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = true and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = true and l.load_id > :minLoadId and l.created_by in :personIdList " +
				"and lra.is_pricing = :isPricingAdj and lra.is_carrier = :isCarrierAdj and lra.is_data = :isDataAdj and lra.is_customer = :isCustomerAdj";
		TypedQuery<Long> query = em.createQuery(queryString, Long.class);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);
		query.setParameter("isPricingAdj", isPricingAdj);
		query.setParameter("isCarrierAdj", isCarrierAdj);
		query.setParameter("isDataAdj", isDataAdj);
		query.setParameter("isCustomerAdj", isCustomerAdj);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment, load_pricing
	 * Return list of load pricing details for adjustable load ids
	 * wasPrevAdjusted - If load was previously adjusted or never adjusted
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 */
	public static List<load_pricing> GetAdjustableLoadsPricing(boolean wasPrevAdjusted, long minLoadId, List<Long> personIdList)
	{
		List<load_pricing> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lp from load l " +
				"join load_pricing lp on l.load_id = lp.load_id " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = :wasPrevAdjusted and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = :wasPrevAdjusted and l.load_id > :minLoadId and l.created_by in :personIdList";
		TypedQuery<load_pricing> query = em.createQuery(queryString, load_pricing.class);
		query.setParameter("wasPrevAdjusted", wasPrevAdjusted);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment, load_pricing
	 * Return list of load pricing details for adjustable load ids
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 * isPricingAdj - Whether load has had a pricing adjustment
	 * isCarrierAdj - Whether load has had a carrier adjustment
	 * isDataAdj - Whether load has had a data adjustment
	 * isCustomerAdj - Whether load has had a customer adjustment
	 * If multiple adjustment types are selected, searches whether load has had a combo adjustment with those set to true
	 */
	public static List<load_pricing> GetAdjustedLoadsPricing(long minLoadId, List<Long> personIdList, boolean isPricingAdj, boolean isCarrierAdj, boolean isDataAdj, boolean isCustomerAdj)
	{
		List<load_pricing> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lp from load l " +
				"join load_pricing lp on l.load_id = lp.load_id " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = true and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = true and l.load_id > :minLoadId and l.created_by in :personIdList " +
				"and lra.is_pricing = :isPricingAdj and lra.is_carrier = :isCarrierAdj and lra.is_data = :isDataAdj and lra.is_customer = :isCustomerAdj";
		TypedQuery<load_pricing> query = em.createQuery(queryString, load_pricing.class);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);
		query.setParameter("isPricingAdj", isPricingAdj);
		query.setParameter("isCarrierAdj", isCarrierAdj);
		query.setParameter("isDataAdj", isDataAdj);
		query.setParameter("isCustomerAdj", isCustomerAdj);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment, load_carrier
	 * Return list of adjustable load ids
	 * wasPrevAdjusted - If load was previously adjusted or never adjusted
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 * carrierId - Adjustable load ids that have a specific carrier assigned
	 * matchCarrier - Look for adjustable loads that have carrierId assigned or all other loads that don't have that carrierId assigned
	 * isPricingAdj - Whether load has had a pricing adjustment
	 * isCarrierAdj - Whether load has had a carrier adjustment
	 * isDataAdj - Whether load has had a data adjustment
	 * isCustomerAdj - Whether load has had a customer adjustment
	 * If multiple adjustment types are selected, searches whether load has had a combo adjustment with those set to true
	 */
	public static List<Long> GetAdjustableLoadsCarrier(boolean wasPrevAdjusted, long minLoadId, List<Long> personIdList, long carrierId, boolean matchCarrier, Boolean isPricingAdj, Boolean isCarrierAdj, Boolean isDataAdj, Boolean isCustomerAdj)
	{
		List<Long> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lc.load_id from load l " +
				"join load_carrier lc on lc.load_id = l.load_id " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = :wasPrevAdjusted and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = :wasPrevAdjusted and l.load_id > :minLoadId and l.created_by in :personIdList";

		if (matchCarrier)
		{
			queryString += " and lc.carrier_id = :carrierId";
		}
		else
		{
			queryString += " and lc.carrier_id != :carrierId";
		}

		if (isPricingAdj != null || isCarrierAdj != null || isDataAdj != null || isCustomerAdj != null)
		{
			queryString += " and lra.is_pricing = :isPricingAdj and lra.is_carrier = :isCarrierAdj and lra.is_data = :isDataAdj and lra.is_customer = :isCustomerAdj";
		}

		queryString += " group by lc.load_id, lc.load_carrier_id order by lc.created_date desc";

		TypedQuery<Long> query = em.createQuery(queryString, Long.class);
		query.setParameter("wasPrevAdjusted", wasPrevAdjusted);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);
		query.setParameter("carrierId", carrierId);

		if (isPricingAdj != null || isCarrierAdj != null || isDataAdj != null || isCustomerAdj != null)
		{
			query.setParameter("isPricingAdj", isPricingAdj);
			query.setParameter("isCarrierAdj", isCarrierAdj);
			query.setParameter("isDataAdj", isDataAdj);
			query.setParameter("isCustomerAdj", isCustomerAdj);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load, load_request_adjustment
	 * Return list of adjustable load ids
	 * wasPrevAdjusted - If load was previously adjusted or never adjusted
	 * minLoadId - minimum matching load id that will be returned
	 * personIdList - List of user ids that created the adjustable loads
	 * customerId - Search for adjustable loads for a specific customer
	 * customerLocationId - Search for adjustable loads with a specific customer location saved to the load
	 * customerBillToId - Search for adjustable loads with a specific bill to saved to the load
	 * matchCustomer - Look for adjustable loads are for a specific customerId or loads not created for that customer
	 * isPricingAdj - Whether load has had a pricing adjustment
	 * isCarrierAdj - Whether load has had a carrier adjustment
	 * isDataAdj - Whether load has had a data adjustment
	 * isCustomerAdj - Whether load has had a customer adjustment
	 * If multiple adjustment types are selected, searches whether load has had a combo adjustment with those set to true
	 */
	public static List<Long> GetAdjustableLoadsCustomer(boolean wasPrevAdjusted, long minLoadId, List<Long> personIdList, long customerId, Long customerLocationId, Long customerBillToId, boolean matchCustomer, Boolean isPricingAdj, Boolean isCarrierAdj, Boolean isDataAdj, Boolean isCustomerAdj)
	{
		List<Long> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l.load_id from load l " +
				"left outer join load_request_adjustment lra on lra.load_id = l.load_id " +
				"where (lra.load_request_adjustment_id is null or (lra.is_approved = :wasPrevAdjusted and lra.is_active = false)) " +
				"and l.ax_load_id is not null and l.invoice_number is not null and l.invoice_processed_flag = true and l.load_status_id > 70 " +
				"and l.invoice_adjustment_requested = :wasPrevAdjusted and l.load_id > :minLoadId and l.created_by in :personIdList";
		if (matchCustomer)
		{
			queryString += " and l.customer_id = :customerId";
		}
		else
		{
			queryString += " and l.customer_id != :customerId";
		}

		if (customerLocationId != null && matchCustomer)
		{
			queryString += " and l.customer_location_id = :customerLocationId";
		}

		if (customerBillToId != null && matchCustomer)
		{
			queryString += " and l.customer_bill_address_id = :customerBillToId";
		}

		if (isPricingAdj != null || isCarrierAdj != null || isDataAdj != null || isCustomerAdj != null)
		{
			queryString += " and lra.is_pricing = :isPricingAdj and lra.is_carrier = :isCarrierAdj and lra.is_data = :isDataAdj and lra.is_customer = :isCustomerAdj";
		}

		TypedQuery<Long> query = em.createQuery(queryString, Long.class);
		query.setParameter("wasPrevAdjusted", wasPrevAdjusted);
		query.setParameter("minLoadId", minLoadId);
		query.setParameter("personIdList", personIdList);
		query.setParameter("customerId", customerId);

		if (customerLocationId != null && matchCustomer)
		{
			query.setParameter("customerLocationId", customerLocationId);
		}

		if (customerBillToId != null && matchCustomer)
		{
			query.setParameter("customerBillToId", customerBillToId);
		}

		if (isPricingAdj != null || isCarrierAdj != null || isDataAdj != null || isCustomerAdj != null)
		{
			query.setParameter("isPricingAdj", isPricingAdj);
			query.setParameter("isCarrierAdj", isCarrierAdj);
			query.setParameter("isDataAdj", isDataAdj);
			query.setParameter("isCustomerAdj", isCustomerAdj);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:customer, customer_bill_address, customer_location
	 * Return customer, customer billing address and customer location details based on the name provided for each
	 */
	public static CustomerBillingDetails GetCustomerBillingDetails(String customerName, String customerLocationName, String customerBillToName)
	{
		CustomerBillingDetails queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select new Entities.Custom.CustomerBillingDetails(c, cl, cba) from customer c " +
				"join customer_bill_address cba on cba.customer_id = c.customer_id " +
				"join customer_location cl on cl.customer_bill_address_id = cba.customer_bill_address_id " +
				"where upper(c.company_name) = upper(:customerName) and upper(cl.location_name) = upper(:customerLocationName)";
		if (customerBillToName != null)
		{
			queryString += " and upper(cba.company_name) = upper(:customerBillToName)";
		}
		TypedQuery<CustomerBillingDetails> query = em.createQuery(queryString, CustomerBillingDetails.class);
		query.setParameter("customerName", customerName);
		query.setParameter("customerLocationName", customerLocationName);
		if (customerBillToName != null)
		{
			query.setParameter("customerBillToName", customerBillToName);
		}

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:customer, customer_bill_address, customer_location
	 * Return customer, customer billing address and customer location details based on the ids provided for each
	 */
	public static CustomerBillingDetails GetCustomerBillingDetails(long customerId, long customerLocationId, long customerBillToId)
	{
		CustomerBillingDetails queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select new Entities.Custom.CustomerBillingDetails(c, cl, cba) from customer c " +
				"join customer_bill_address cba on cba.customer_id = c.customer_id " +
				"join customer_location cl on cl.customer_bill_address_id = cba.customer_bill_address_id " +
				"where c.customer_id = :customerId and cl.customer_location_id = :customerLocationId and cba.customer_bill_address_id = :customerBillToId";
		TypedQuery<CustomerBillingDetails> query = em.createQuery(queryString, CustomerBillingDetails.class);
		query.setParameter("customerId", customerId);
		query.setParameter("customerLocationId", customerLocationId);
		query.setParameter("customerBillToId", customerBillToId);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:carriers
	 * Return carrier details using carrier name
	 */
	public static carriers GetCarrierByName(String carrierName)
	{
		carriers queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select c from carriers c where upper(c.carrier_name) = upper(:carrierName)";
		TypedQuery<carriers> query = em.createQuery(queryString, carriers.class);
		query.setParameter("carrierName", carrierName);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:carriers
	 * Return carrier details using carrier id
	 */
	public static carriers GetCarrierById(long carrierId)
	{
		carriers queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select c from carriers c where c.carrier_id = :carrierId";
		TypedQuery<carriers> query = em.createQuery(queryString, carriers.class);
		query.setParameter("carrierId", carrierId);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:required_field_audit_history
	 * Return list of required field changes after a specific datetime
	 */
	public static List<required_field_audit_history> GetRequiredFieldAuditHistory(long loadId, LocalDateTime startDateTime)
	{
		List<required_field_audit_history> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select rf from required_field_audit_history rf where rf.load_id = :loadId and rf.created_date >= :startDateTime";
		TypedQuery<required_field_audit_history> query = em.createQuery(queryString, required_field_audit_history.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_origin_destination
	 * Return origin/destination information for a load
	 */
	public static load_origin_destination GetLoadOriginDestination(long loadId)
	{
		load_origin_destination queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lod from load_origin_destination lod where lod.load_id = :loadId";
		TypedQuery<load_origin_destination> query = em.createQuery(queryString, load_origin_destination.class);
		query.setParameter("loadId", loadId);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_origin_destination
	 * Return origin/destination information for a specific origin/destination city, state, zip, country
	 */
	public static List<load_origin_destination> GetLoadOriginDestination(String originCity, String originState, String originZip, String originCountry, String destinationCity, String destinationState, String destinationZip, String destinationCountry)
	{
		List<load_origin_destination> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();
		List<String> queryParameters = new ArrayList<>();
		Map<String, Object> queryParameterMap = new HashMap<>();

		String queryString = "select lod from load_origin_destination lod";
		if (originCity != null)
		{
			queryParameters.add("upper(lod.origin_city) = :originCity");
			queryParameterMap.put("originCity", originCity.toUpperCase());
		}
		if (originState != null)
		{
			queryParameters.add("upper(lod.origin_state) = :originState");
			queryParameterMap.put("originState", originState.toUpperCase());
		}
		if (originZip != null)
		{
			queryParameters.add("upper(lod.origin_zipcode) = :originZip");
			queryParameterMap.put("originZip", originZip.toUpperCase());
		}
		if (originCountry != null)
		{
			queryParameters.add("upper(lod.origin_country) = :originCountry");
			queryParameterMap.put("originCountry", originCountry.toUpperCase());
		}
		if (destinationCity != null)
		{
			queryParameters.add("upper(lod.destination_city) = :destinationCity");
			queryParameterMap.put("destinationCity", destinationCity.toUpperCase());
		}
		if (destinationState != null)
		{
			queryParameters.add("upper(lod.destination_state) = :destinationState");
			queryParameterMap.put("destinationState", destinationState.toUpperCase());
		}
		if (destinationZip != null)
		{
			queryParameters.add("upper(lod.destination_zipcode) = :destinationZip");
			queryParameterMap.put("destinationZip", destinationZip.toUpperCase());
		}
		if (destinationCountry != null)
		{
			queryParameters.add("upper(lod.destination_country) = :destinationCountry");
			queryParameterMap.put("destinationCountry", destinationCountry.toUpperCase());
		}

		if (!queryParameters.isEmpty())
		{
			queryString += " where " + String.join(" and ", queryParameters);
		}

		TypedQuery<load_origin_destination> query = em.createQuery(queryString, load_origin_destination.class);

		for (String key : queryParameterMap.keySet())
		{
			query.setParameter(key, queryParameterMap.get(key));
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_aux
	 * Return auxiliary information saved for load
	 */
	public static load_aux GetLoadAux(long loadId)
	{
		load_aux queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select la from load_aux la where la.load_id = :loadId";
		TypedQuery<load_aux> query = em.createQuery(queryString, load_aux.class);
		query.setParameter("loadId", loadId);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_invoice_data_adjustment, load_request_adjustment
	 * Return list of data field adjustments after a specific datetime
	 */
	public static List<load_invoice_data_adjustment> GetLoadInvoiceDataAdjustment(long loadId, LocalDateTime startDateTime)
	{
		List<load_invoice_data_adjustment> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lida from load_invoice_data_adjustment lida " +
				"join load_request_adjustment lra on lra.load_request_adjustment_id = lida.load_request_adjustment_id " +
				"where lra.load_id = :loadId and lida.created_date >= :startDateTime";
		TypedQuery<load_invoice_data_adjustment> query = em.createQuery(queryString, load_invoice_data_adjustment.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_carrier, carriers
	 * Return carrier assigned to load after a specific datetime
	 */
	public static carriers GetCarrier(long loadId, LocalDateTime startDateTime)
	{
		carriers queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select c from load_carrier lc " +
				"join carriers c on c.carrier_id = lc.carrier_id " +
				"where lc.load_id = :loadId and lc.created_date >= :startDateTime " +
				"order by lc.created_date desc";
		TypedQuery<carriers> query = em.createQuery(queryString, carriers.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:ax_payload_log
	 * Return list of ax payload details after a specific datetime
	 */
	public static List<ax_payload_log> GetAXPayloadLog(long loadId, LocalDateTime startDateTime)
	{
		List<ax_payload_log> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select ax from ax_payload_log ax where ax.entity_id = :loadId and ax.created_date >= :startDateTime order by ax.created_date desc";
		TypedQuery<ax_payload_log> query = em.createQuery(queryString, ax_payload_log.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:ax_payload_log
	 * Return list of ax payload details for a specific invoice type (AP (Vendor Invoice)/AR (Sales Invoice) for a list of load ids
	 */
	public static List<ax_payload_log> GetAXPayloadLogs(List<Long> loadIds, String invoiceType)
	{
		List<ax_payload_log> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select ax from ax_payload_log ax where ax.entity_id in :loadIds and upper(ax.entity) like upper(:invoiceType)";
		TypedQuery<ax_payload_log> query = em.createQuery(queryString, ax_payload_log.class);
		query.setParameter("loadIds", loadIds);
		query.setParameter("invoiceType", invoiceType);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load
	 * Return which load id the load was copied from after a specific datetime
	 */
	public static load GetLoadByCopyLoadId(long copyLoadId, LocalDateTime startDateTime)
	{
		load queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l from load l where l.copy_load_id = :copyLoadId and l.created_date >= :startDateTime order by l.created_date desc";
		TypedQuery<load> query = em.createQuery(queryString, load.class);
		query.setParameter("copyLoadId", copyLoadId);
		query.setParameter("startDateTime", startDateTime);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_pricing
	 * Return list of load pricing details after a specific datetime
	 */
	public static List<load_pricing> GetLoadPricing(long loadId, LocalDateTime startDateTime)
	{
		List<load_pricing> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lp from load_pricing lp where lp.load_id = :loadId and lp.created_date >= :startDateTime order by lp.pricing_id desc";
		TypedQuery<load_pricing> query = em.createQuery(queryString, load_pricing.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:invoice_audit
	 * Return list of invoice changes after a specific datetime
	 */
	public static List<invoice_audit> GetInvoiceAudit(long loadId, LocalDateTime startDateTime)
	{
		List<invoice_audit> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select ia from invoice_audit ia where ia.load_id = :loadId and ia.created_date >= :startDateTime order by ia.created_date desc";
		TypedQuery<invoice_audit> query = em.createQuery(queryString, invoice_audit.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:customer_bill_address
	 * Return customer bill to details for a specific customerBillAddressId
	 */
	public static customer_bill_address GetCustomerBillAddress(long customerBillAddressId)
	{
		customer_bill_address queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select cba from customer_bill_address cba where cba.customer_bill_address_id = :customerBillAddressId";
		TypedQuery<customer_bill_address> query = em.createQuery(queryString, customer_bill_address.class);
		query.setParameter("customerBillAddressId", customerBillAddressId);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_audit_approval
	 * Return adjustment approval status details for a load after a specific datetime
	 */
	public static load_audit_approval GetLoadAuditApproval(long loadId, LocalDateTime startDateTime)
	{
		load_audit_approval queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select laa from load_audit_approval laa where laa.load_id = :loadId and laa.modified_date >= :startDateTime  order by laa.modified_date desc";
		TypedQuery<load_audit_approval> query = em.createQuery(queryString, load_audit_approval.class);
		query.setParameter("loadId", loadId);
		query.setParameter("startDateTime", startDateTime);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:approval_types
	 * Return approval type for a specific approvalTypeId
	 */
	public static approval_types GetApprovalType(int approvalTypeId)
	{
		approval_types queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select at from approval_types at where at.approval_type_id = :approvalTypeId";
		TypedQuery<approval_types> query = em.createQuery(queryString, approval_types.class);
		query.setParameter("approvalTypeId", approvalTypeId);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_stopoff
	 * Return list of stops saved on a load
	 */
	public static List<load_stopoff> GetLoadStopoff(long loadId)
	{
		List<load_stopoff> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select ls from load_stopoff ls where ls.load_id = :loadId order by ls.load_stopoff_id asc";
		TypedQuery<load_stopoff> query = em.createQuery(queryString, load_stopoff.class);
		query.setParameter("loadId", loadId);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load
	 * Return the last load a userId created
	 */
	public static load GetLatestLoadFromUser(long userId)
	{
		load queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l from load l where l.created_by = :userId order by l.created_date desc";
		TypedQuery<load> query = em.createQuery(queryString, load.class);
		query.setParameter("userId", userId);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load
	 * Return the last load a userId created after a specific datetime
	 */
	public static load GetLatestLoadFromUser(long userId, LocalDateTime startDateTime)
	{
		load queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select l from load l where l.created_by = :userId and l.created_date >= :startDateTime order by l.created_date desc";
		TypedQuery<load> query = em.createQuery(queryString, load.class);
		query.setParameter("userId", userId);
		query.setParameter("startDateTime", startDateTime);
		query.setMaxResults(1);

		try {
			queryResults = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database: 3.0, schema: pls, table: load
	 * @param operator
	 * 		Comparison operator used for load status ids
	 * @param loadStatusId
	 * 		Load status id based on pls.load_status table
	 * @return
	 * 		list of loads by load status id
	 */
	public static List<load> GetLoadsByLoadStatus(String operator, Long loadStatusId)
	{
		return GetLoads(null, operator, loadStatusId, null, null, null);
	}

	/**
	 * database: 3.0, schema: pls, table: load
	 * @param customerId
	 * 		Customer id, may also be referred to as org id for customer
	 * @param loadStatusOperator
	 * 		Comparison operator used for load status ids
	 * @param loadStatusId
	 * 		Load status id based on pls.load_status table
	 * @param isEDI
	 *		Flag to filter by EDI/non-EDI loads
	 * @param stopoffCountOperator
	 * 		Comparison operator used for stop count
	 * @param stopoffCount
	 * 		Number of stops set for the load
	 * @return
	 * 		list of loads that match search parameters
	 */
	public static List<load> GetLoads(Long customerId, String loadStatusOperator, Long loadStatusId, Boolean isEDI, String stopoffCountOperator, Long stopoffCount)
	{
		List<load> loadList = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		List<String> queryParameters = new ArrayList<>();
		Map<String, Object> queryParameterMap = new HashMap<>();

		boolean filterByStopoffCount = stopoffCountOperator != null && stopoffCount != null;

		String queryString = "select l from load l";

		if (filterByStopoffCount)
		{
			queryString += " left join load_stopoff ls on ls.load_id = l.load_id";
		}

		if (customerId != null)
		{
			queryParameters.add("customer_id = :customerId");
			queryParameterMap.put("customerId", customerId);
		}
		if (loadStatusOperator != null && loadStatusId != null)
		{
			queryParameters.add("load_status_id " + loadStatusOperator + " :loadStatusId");
			queryParameterMap.put("loadStatusId", loadStatusId);
		}
		if (isEDI != null)
		{
			queryParameters.add("is_edi = :isEDI");
			queryParameterMap.put("isEDI", isEDI);
		}

		if (!queryParameters.isEmpty())
		{
			queryString += " where " + String.join(" and ", queryParameters);
		}

		if (filterByStopoffCount)
		{
			queryString += " group by l.load_id having count(ls.load_stopoff_id) " + stopoffCountOperator + " :stopoffCount";
		}

		TypedQuery<load> query = em.createQuery(queryString, load.class);

		for (String key : queryParameterMap.keySet())
		{
			query.setParameter(key, queryParameterMap.get(key));
		}

		if (filterByStopoffCount)
		{
			query.setParameter("stopoffCount", stopoffCount);
		}

		try {
			loadList = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return loadList;
	}

	/**
	 * database:3.0, schema:pls, table:load_aud
	 * Return list of loads audits for a load id
	 */
	public static List<load_aud> GetLoadAudByLoadId(long loadId)
	{
		List<load_aud> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select la from load_aud la where la.load_id = :loadId order by la.load_status_id desc";
		TypedQuery<load_aud> query = em.createQuery(queryString, load_aud.class);
		query.setParameter("loadId", loadId);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:load_status
	 * Return load status id by load status name
	 */
	public static load_status GetLoadStatusByLoadStatusName(String loadStatusName)
	{
		load_status queryResult = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select ls from load_status ls where lower(ls.load_status_name) = lower(:loadStatusName)";
		TypedQuery<load_status> query = em.createQuery(queryString, load_status.class);
		query.setParameter("loadStatusName", loadStatusName);
		query.setMaxResults(1);

		try {
			queryResult = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResult;
	}

	/**
	 * database:3.0, schema:pls, table:load_change_history_result
	 * Return list of load change audit records for a load id, before/after a certain date and time or for a specific event
	 */
	public static List<load_change_history_result> GetLoadChangeHistoryAudit(long loadId, String event, String operator, LocalDateTime dateTime)
	{
		List<load_change_history_result> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select lchr from load_change_history_result lchr where lchr.load_id = :loadId";
		if (event != null)
		{
			queryString += " and lower(lchr.event) like lower(:event)";
		}
		if (operator != null && dateTime != null)
		{
			queryString += " and lchr.created_date " + operator + " :dateTime";
		}
		queryString += " order by lchr.created_date desc";
		TypedQuery<load_change_history_result> query = em.createQuery(queryString, load_change_history_result.class);
		query.setParameter("loadId", loadId);
		if (event != null)
		{
			query.setParameter("event", "%"+event+"%");
		}
		if (operator != null && dateTime != null)
		{
			query.setParameter("dateTime", dateTime);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:customer_change_history_result
	 * Return list of customer change audit records for a customer id, before/after a certain date and time or for a specific event
	 */
	public static List<customer_change_history_result> GetCustomerChangeHistoryAudit(long customerId, String event, String operator, LocalDateTime dateTime)
	{
		List<customer_change_history_result> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select cchr from customer_change_history_result cchr where cchr.customer_id = :customerId";
		if (event != null)
		{
			queryString += " and lower(cchr.event) like lower(:event)";
		}
		if (operator != null && dateTime != null)
		{
			queryString += " and cchr.created_date " + operator + " :dateTime";
		}
		queryString += " order by lchr.created_date desc";
		TypedQuery<customer_change_history_result> query = em.createQuery(queryString, customer_change_history_result.class);
		query.setParameter("customerId", customerId);
		if (event != null)
		{
			query.setParameter("event", "%"+event+"%");
		}
		if (operator != null && dateTime != null)
		{
			query.setParameter("dateTime", dateTime);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:customer_credit_history
	 * Return list of customer credit change audit records for a customer id, before/after a certain date and time or for a specific event
	 */
	public static List<customer_credit_history> GetCustomerCreditChangeHistoryAudit(long customerId, String detail, Long loadId, String operator, LocalDateTime dateTime)
	{
		List<customer_credit_history> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select cch from customer_credit_history cch where cch.customer_id = :customerId";
		if (detail != null)
		{
			queryString += " and lower(cch.detail) like lower(:detail)";
		}
		if (loadId != null)
		{
			queryString += " and cch.load_id = :loadId";
		}
		if (operator != null && dateTime != null)
		{
			queryString += " and cch.created_date " + operator + " :dateTime";
		}
		queryString += " order by lchr.created_date desc";
		TypedQuery<customer_credit_history> query = em.createQuery(queryString, customer_credit_history.class);
		query.setParameter("customerId", customerId);
		if (detail != null)
		{
			query.setParameter("event", "%"+detail+"%");
		}
		if (loadId != null)
		{
			query.setParameter("loadId", loadId);
		}
		if (operator != null && dateTime != null)
		{
			query.setParameter("dateTime", dateTime);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database:3.0, schema:pls, table:carrier_change_history_result
	 * Return list of carrier change audit records for a carrier id, before/after a certain date and time or for a specific event
	 */
	public static List<carrier_change_history_result> GetCarrierChangeHistoryAudit(long carrierId, String event, String operator, LocalDateTime dateTime)
	{
		List<carrier_change_history_result> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select cchr from carrier_change_history_result cchr where cchr.carrier_id = :carrierId";
		if (event != null)
		{
			queryString += " and lower(cchr.event) like lower(:event)";
		}
		if (operator != null && dateTime != null)
		{
			queryString += " and cchr.created_date " + operator + " :dateTime";
		}
		queryString += " order by lchr.created_date desc";
		TypedQuery<carrier_change_history_result> query = em.createQuery(queryString, carrier_change_history_result.class);
		query.setParameter("carrierId", carrierId);
		if (event != null)
		{
			query.setParameter("event", "%"+event+"%");
		}
		if (operator != null && dateTime != null)
		{
			query.setParameter("dateTime", dateTime);
		}

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}

	/**
	 * database: 3.0, schema: pls, table: customer_invoice_req_fields
	 * @param customerBillToId
	 * 		Customer bill to address id
	 * @param isActive
	 * 		If required field is enabled for the bill to
	 * @return
	 * 		List of required field for a bill to
	 */
	public static List<customer_invoice_req_fields> GetCustomerRequiredFields(long customerBillToId, boolean isActive)
	{
		List<customer_invoice_req_fields> queryResults = null;
		EntityManagerFactory emf30 = SetupPLS30Connection();
		EntityManager em = emf30.createEntityManager();

		String queryString = "select rf from customer_invoice_req_fields rf where rf.customer_bill_address_id = :customerBillToId and rf.is_active = :isActive";
		TypedQuery<customer_invoice_req_fields> query = em.createQuery(queryString, customer_invoice_req_fields.class);
		query.setParameter("customerBillToId", customerBillToId);
		query.setParameter("isActive", isActive);

		try {
			queryResults = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			emf30.close();
			em.close();
		}
		return queryResults;
	}
	/**
	 * database:3.0, schema:pls_tracking, table:order_stops
	 * Get stop id with tracking order id
	 */
	public static List<order_stops> GetStopId(int _trackId)
	{
			EntityManagerFactory emf30 = SetupPLS30Connection();
			EntityManager em= emf30.createEntityManager();
			List<order_stops> osLst =null;
			String query = "Select os from order_stops os where os.tracking_order_id=:trackId";
			TypedQuery<order_stops> osQuery = em.createQuery(query,order_stops.class);
			osQuery.setParameter("trackId", _trackId);
			try {
				osLst = osQuery.getResultList();
			} catch (NoResultException e) {
				e.printStackTrace();
			}
			finally {
				emf30.close();
				em.close();
			}

			return osLst ;

	}
}
