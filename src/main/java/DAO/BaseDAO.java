package DAO;

import Entities.PLS20.flatbed.holidays;
import Entities.PLS20.flatbed.international_holidays;
import Entities.PLS30.pls.load;
import Entities.PLS30.pls.zipcode;
import Entities.PLS30.pls_ltl.p44_quote_request_logs;
import Entities.PLS30.pls_ltl.p44_quote_response_logs;
import Entities.PLS30.pls_quote.*;
import Entities.PLS30.pls_tracking.order_stops;
import Entities.PLS30.pls_tracking.tracking_orders;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.List;

public class BaseDAO {
	
	public static load _load;
	public static List<dat_type> _Dat_type;
	public static sys_holiday_adj _Sys_holiday_adj;
	public static sys_rate_adj _Sys_rate_adj;
	public static dat_regions _Dat_regions;
	public static List<zipcode> _ZipcodeList;
	public static zipcode _Zipcode;
	public static dat_rates _Dat_rates;
	public static p44_quote_request_logs _p44_quote_request_logs;
	public static p44_quote_response_logs _p44_quote_response_logs;
	public static tracking_orders _tracking_orders;
	public static order_stops _order_stops;
	public static List<holidays> _holidays;
	public static List<international_holidays> _international_holidays;
	public static String _env30;
	public static String _env20;

	public BaseDAO() throws IOException
	{
		//SetUpPersistence();
	}
	public static void SetEnv(String env)
	{
		env = env.toLowerCase();
		switch (env)
		{
			case "uat":
				_env30 = "PLS30UAT";
				_env20 = "PLS20UAT";
				break;
			case "qa":
				_env30 = "PLS30QA";
				_env20 = "PLS20QA";
				break;
			case "prod":
				_env30 = "PLS30PROD";
				_env20 = "PLS20PROD";
				break;
		}
	}

	public static EntityManagerFactory SetupPLS30Connection()
	{
		//To test locally in desired environment
		//_env30 = "PLS30QA";
		return Persistence.createEntityManagerFactory(_env30);
	}

	public static EntityManagerFactory SetupPLS20Connection()
	{
		return Persistence.createEntityManagerFactory(_env20);
	}
}
