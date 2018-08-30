package my.com.tm.portal.asset.constant;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class SoaConstants {

	private SoaConstants() {}

	public static final String CONTRACT_TYPE_TENANCY = "Z002,Z008,Z009";
	public static final String CONTRACT_TYPE_INDIVIDUAL_CP = "Z005";
	public static final String CONTRACT_TYPE_CORPORATE_CP = "Z004";
	public static final String SOA_DATE_FORMAT = "yyyy-MM-dd";
	public static final String CARPARK_COMPANY_CODE = "1060";
	public static final String CARPARK_INFO_BAY_TYPE_NRB = "NRB";
	public static final String QUERY_DATE = ZonedDateTime.now().format(DateTimeFormatter.ofPattern(SOA_DATE_FORMAT));
	public static final String START_DATE = ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

	public static final String CARPARK_INFO_BAY_TYPE_RB = "RB";
	public static final String CARPARK_INFO_BAY_TYPE_SRB = "SRB";
	public static final String USAGE_TYPE_OFFICE = "1";
	public static final String USAGE_TYPE_CARPARK = "5";

	public static final String CARDHOLDER_ID_TYPE_BPNO = "BPNo";
	public static final String CARDHOLDER_ID_TYPE_NRIC = "NRIC";
	public static final String CARDHOLDER_ID_TYPE_PASSPORT = "Passport";

	public static final String CARDHOLDER_REQUEST_ID = "S007";

	public static final String BP_CATEGORY_ORGANIZATION = "2";

	public static final String BAR = "Bar";

	public static final String ID_TPYE = "IDType";
	public static final String ID_NO = "IDNo";
	public static final String BP_NO = "BPNo";


}
