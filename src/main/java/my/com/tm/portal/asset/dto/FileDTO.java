package my.com.tm.portal.asset.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class FileDTO implements Serializable {

	private static final long serialVersionUID = -6101425877429473364L;

	private String remarks;
	private String companyCode;
	private String documentDate;
	private BigDecimal documentNumber;
	private String documentType;
	private String attachmentFileName;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(String documentDate) {
		this.documentDate = documentDate;
	}

	public BigDecimal getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(BigDecimal documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getAttachmentFileName() {
		return attachmentFileName;
	}

	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

}
