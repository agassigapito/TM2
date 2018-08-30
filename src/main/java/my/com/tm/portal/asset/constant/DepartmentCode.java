package my.com.tm.portal.asset.constant;

public enum DepartmentCode {
	
	CP("C&P"), OPERATION("OPERATION");
	
	private String value;
	
	private DepartmentCode(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
