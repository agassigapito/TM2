package my.com.tm.portal.asset.constant;

import org.springframework.http.HttpStatus;

import my.com.tm.portal.asset.model.ResponseStatus;

public final class Constants {

	private Constants() {
	}

	public static final int DEFAULT_PAGE_SIZE = 10;
	public static final int DEFAULT_PAGE_NO = 1;
	public static final Object COLON = ":";
	public static final String HYPHEN = "-";
	public static final String HYPHEN_WITH_SPACES = " - ";
	public static final String SPACE = " ";
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DEFAULT_ENCODING = "UTF-8";
	public static final String IMAGE_TYPE = "jpg";
	public static final String USER = "USER";
	public static final String ADMIN = "ADMIN";
	public static final String APP_PDF = "application/pdf";
	public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";
	public static final String SYSTEM = "SYSTEM";
	public static final String AUTHORITIES_KEY = "auth";
	public static final String AUTHORIZATION_HEADER = "Authorization";
	public static final String ACCEPT = "Accept";
	public static final String[] COOKIES = { "JSESSIONID", "XSRF-TOKEN", AUTHORIZATION_HEADER };
	public static final String MOCK_ON = "ON";
	public static final String MOCK_OFF = "OFF";
	public static final String SOA_DATE_FORMAT = "yyyy-MM-dd";
	public static final String REQUEST_ID = "RequestID";
	public static final String CORPORATE = "Corporate";
	public static final String CONTENT_TYPE = "Content-Type";
	// CONTRACT
	public static final String CONTRACT_TYPE_CORPORATE = "Z004";
	public static final String TENANCY_AGREEMENT = "Z002";
	public static final String LICENCE_AGREEMENT = "Z003";
	public static final String FOOD_HALL_LICENCE_AGREEMENT = "Z009";

	// TENANCIES
	public static final String TENANCIES_BP_NO = "BPNo";
	public static final String TENANCIES_COMPANY_CODE = "CompanyCode";
	public static final String TENANCIES_CONTRACT_NO = "ContractNo";
	public static final String TENANCIES_VALID_TO = "ValidTo";
	public static final String TENANCIES_BUILDING_ACCESS_CODE = "BuildingAccessCode";
	public static final String TENANCIES_BUILDING_NAME = "BuildingName";
	public static final String TENANCIES_VALID_FROM = "ValidFrom";
	public static final String TENANCIES_BUILDING_STATUS = "BuildingStatus";
	public static final String TENANCIES_COMPANY_BP_NO = "CompanyBPNo";
	public static final String TENANCIES_START_DATE = "StartDate";
	// REQUEST and RESPONSE
	public static final String REQUEST_URL = "Request URL: ";
	public static final String RESPONSE_HEADER = "Response Header: ";
	public static final String RESPONSE_STATUS = "Response Status: ";
	public static final String REQUEST_PAYLOAD = "Request Payload: ";
	public static final String RESPONSE_PAYLOAD = "Response Payload: ";
	public static final String ENTRY_METHOD = "Entry Method: ";
	public static final String EXIT_METHOD = "Exit Method: ";
	// URL CONFIGURATION
	public static final String SECRET = "12345678abcdefghijklmn";
	public static final long EXPIRATION_TIME = 6000000; // 100 minutes
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String SWAGGER = "/swagger-ui.html#*";
	// UTILITIES TREND
	public static final String MONTHLY = "monthly";
	public static final String DAILY = "daily";
	public static final String UTILITY_TYPE = "Utility Type";
	public static final String ACR_MEASUREMENT_TYPE = "ACR Measurement Type";
	// LANDING PAGE VALID CONTRACT TYPE
	public static final String LANDING_PAGE_CONTRACT_TYPES = "Z002,Z003,Z004,Z005";
	// LANDING PAGE - METER TYPE CODES
	public static final String CHILLED_WATER_METER_TYPE = "Z210";
	public static final String ELECTRICITY_METER_TYPE = "Z170";
	public static final String WATER_METER_TYPE = "Z180";
	public static final String GAS_METER_TYPE = "Z220";
	public static final String FLAG_Y = "Y";
	public static final String FLAG_N = "N";
	public static final String LANDING_PAGE_METER_CONTRACT_TYPES = "Z002,Z003,Z009";
	public static final String SOA_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String INVOICE_ITEM_STATUS_OUTSTANDING = "OUTSTANDING";
	public static final String INVOICE_ITEM_STATUS_OVERDUE = "OVERDUE";
	// PREPAID INDICATOR FLAG
	public static final String PREPAID_INDICATOR = "1";
	public static final String POSTPAID_INDICATOR = "2";
	public static final String NON_PREPAID = "3";
	public static final String BILLING_DATE_FORMAT = "yyyy-MM-dd";
	public static final String PENDING = "Pending";
	// PAYMENT MERCHANT
	public static final String IPAY_MERCHANT_CODE = "M05437";
	public static final String MYR = "MYR";
	// INVOICE LEVY
	public static final String POSTING_ACTIVITY_ZSHC40 = "ZSHC40";
	public static final String TAX_GROUP_S6 = "S6";
	// ACR
	public static final String NEW_STATUS = "New";
	public static final String RUNNING_STATUS = "Running";
	public static final String PARTIALLY_COMPLETED_STATUS = "Partially Completed";
	public static final String CANCELLED_STATUS = "Cancelled";
	public static final String SCHEDULE_INFO_RECURRING = "Recurring";
	public static final String SCHEDULE_INFO_NEW = "New";
	public static final String AD_HOC_SCHEDULE = "Ad-hoc";
	public static final String RECURRING_SCHEDULE = "Recurring";

	// UNIT OF MEASUREMENT
	public static final String HOUR = "HR";
	public static final String KILOWATT_HOUR = "KWH";
	// PROCUREMENT
	public static final String EPC = "EPC";
	public static final String EPC_DATEFORMAT = "yyyyMMdd";
	public static final String REJECT_TASK = "reject";
	public static final String ACCEPT_TASK = "accept";
	public static final String REVISE_TASK = "revise";
	public static final String RFA_APPROVED = "RFA Approved";
	public static final String RFA = "RFA";
	public static final String DRAFT = "Draft";
	public static final String RFA_REJECTED = "RFA Rejected";
	public static final String TENANT_REJECTED = "Tenant Rejected";
	public static final String TENANT_APPROVED = "Tenant Approved";
	public static final String PROCUREMENT_CATEGORY = "Procurement Category";
	public static final String PURCHASING_GROUP = "Purchasing Group";
	public static final String PROCUREMENT_DEPARTMENT = "Procurement Department";
	public static final String PENDING_APPROVAL = "Pending Approval";
	public static final String NEGOTIATE_IN_PROGRESS = "Negotiation In Progress";
	// ERROR RESPONSE
	public static final String NOT_FOUND = "Data not found";
	public static final String DATABASE_ERROR = "Error occured while saving";
	public static final String PROCUREMENT_COMPANY = "Procurement Company";
	public static final String PROCUREMENT_STATUS = "Procurement Status";
	public static final String UOM = "UOM";

	public static final String TYPE = "type";
	public static final String TASK_NAME = "taskname";
	public static final String REQUESTED_BY = "requested_by";
	public static final String REFERENCE_NO = "reference_no";

	public static final String TASK_PENDING = "Pending";
	public static final String APPLICATION_CSV_VALUE = "text/csv";
	public static final String SERVICE_CONTRACT = "Service Contract";

	public static final String DEFAULT_PR_TYPE = "ZRFA";
	public static final String RENTAL_LEASING_LANDLORD = "Rental Leasing Landlord";
	public static final String NOT_APPLICABLE = "N/A";
	public static final String DELETE_MESSAGE = "Deleted Successfully";
	public static final String CANCELLED = "Cancelled";
	public static final String LINE_ITEM_DELETE_SUCCESSFUL = "Successful deletion of line item.";
	public static final String LINE_ITEM_SAVE_SUCCESSFUL = "Successful save of line item.";
	public static final String PROCUREMENT_STATUS_UPDATE_SUCCESSFUL = "Successful update of procurement status.";
	public static final String LINE_ITEM_NO_APPROVAL_HISTORY_FOUND = "No approval history found for process instance id ";
	public static final String SAVE_NOW = "SAVE NOW";
	public static final String PORTAL_PROCUREMENT_QUEUE = "portal.procurement.queue";
	public static final String PROCUREMENT_PR_CREATE_SUCCESSFUL = "Procurement Request successfully created.";
	public static final String PR_CREATED = "PR Created";
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILED = "FAILED";
	public static final String EMPTY = "EMPTY RECORDS";

	public static final String APPROVED = "Approved";
	public static final String AMENDMENT_REQUIRED = "Amendment Required";
	public static final String REJECTED = "Rejected";

	/**
	 * START: Service Request / Work Order Constants
	 */
	public static final String AREA = "Area";
	public static final String LOCATION = "Location";
	public static final String SERVICE_CAT = "Service Category";
	public static final String SERVICE_DESC = "Service Description";
	public static final String SR_STATUS_NEW = "New";
	public static final String SR_STATUS_CLOSED = "Closed";
	public static final String SERVICE_REQUEST_NUMBER_PREFIX = "SR";
	public static final String DOCUMENT_TYPE_SR = "SR";

	public static final String PRIORITY = "Priority";
	public static final String DURATION_DAY = "Duration Day";
	public static final String DURATION_TIME = "Duration Time";
	public static final String DURATION_MINUTE = "Duration Minute";
	public static final String MATERIAL_CAT = "Material Category";
	public static final String RFA_CAT = "RFA Category";

	public static final String ZSRV = "ZSRV";

	/**
	 * END: Service Request / Work Order Constants
	 */

	/**
	 * START: Service Request / Technician Assignment
	 */
	public static final int HIGH_PRIORITY = 1;
	public static final int MEDIUM_PRIORITY = 2;
	public static final int LOW_PRIORITY = 3;
	public static final int EXTERNAL = 4;
	/**
	 * END: Service Request / Technician Assignment
	 */

	public static final ResponseStatus SUCCESSFUL_RESPONSE = new ResponseStatus(HttpStatus.OK, SUCCESS);
}
