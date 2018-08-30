package my.com.tm.portal.asset.constant;

public enum ProcurementStage {
	
	RFA("RFA"), TENANT("Tenant Quotation"), PR("PR");
	
	private String value;
	
	ProcurementStage(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
