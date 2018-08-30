package my.com.tm.portal.asset.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import my.com.tm.portal.asset.model.ResponseStatus;

public class RfaRequestInfoDTO implements Serializable {

	private static final long serialVersionUID = 7692658615550520203L;

	private ResponseStatus responseStatus;
	private String referenceNo;
	private String rfaCategory;
	private String status;
	private String description;
	private List<FileDTO> files = new ArrayList<>();

	public ResponseStatus getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(ResponseStatus responseStatus) {
		this.responseStatus = responseStatus;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getRfaCategory() {
		return rfaCategory;
	}

	public void setRfaCategory(String rfaCategory) {
		this.rfaCategory = rfaCategory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<FileDTO> files) {
		this.files = files;
	}

}
