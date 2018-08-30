package my.com.tm.portal.asset.constant;

public final class ErrorMessage {

	private ErrorMessage() {}

	public static final String NO_RECORDS_FOUND = "No Records Found";
	public static final String ALREADY_EXISTS = "Already exist";
	public static final String JSON_FILE_IS_EMPTY = "JSON file is empty";
	public static final String EMPTY_UTILITY_TREND_DURATION = "Utility Trend Duration cannot be empty";
	public static final String WSO2_COMPLETE_ACTION_FAILED = "Task Status update failed.";
	public static final String WSO2_PROCESS_INSTANCE_ID_MISSING = "Process Instance ID is missing.";
	public static final String PROCUREMENT_SUBMIT_MESSAGE = "Your procurement status must be in Draft mode before submitting.";
	public static final String PROCUREMENT_ERROR_SAVE_MESSAGE = "Your procurement status must be in Draft / Tenant Rejected mode before saving.";
	public static final String PROCUREMENT_ERROR_PR_CREATION_MESSAGE = "Your procurement status must be in RFA Approved / Tenant Approved mode before PR creation.";
	public static final String PROCUREMENT_ERROR_NEGOTIATE_MESSAGE = "Your procurement status must be in RFA Approved / Tenant Rejected mode before negotiating.";
	public static final String PROCUREMENT_DRAFT_ONLY = "Your procurement status must be in Draft mode.";
	public static final String CATEGORY_FIELD_REQUIRED = "Category field is required";
	public static final String PURCHASING_GROUP_FIELD_REQUIRED = "Purchasing Group field is required";
	public static final String PROCUREMENT_ERROR_REOPEN_MESSAGE = "Your procurement status must be in Tenant Rejected mode before reopening.";
	public static final String PROCUREMENT_ERROR_LOCKED = "Your Procurement Request is currently in locked mode.";
	public static final String PROCUREMENT_ERROR_PR_CATEGORY = "Your procurement categroy must be in New Stock / Non-Stocked / Services";
	public static final String LINE_ITEM_SAVE_ERROR = "Line item save error.";
	public static final String LINE_ITEM_DELETE_ERROR = "Line item delete error.";
	public static final String LINE_ITEM_DELETE_NOT_EXISITING = "Line item to be deleted does not exist";
	public static final String PROCUREMENT_LINE_ITEM_REQUIRED = "Provide the required line item";
	public static final String LINE_ITEM_VENDOR_REQUIRED = "Provide the required vendor";
	public static final String NO_DOCUMENT_FOUND = "No matching documents found";
}
