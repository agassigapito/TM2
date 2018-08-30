package my.com.tm.portal.asset.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import my.com.tm.portal.asset.auditing.Modifiable;

@Entity
@Table(name = "PROCUREMENT_MESSAGE_HISTORY")
public class ProcurementMessageHistory extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = -2026360136543172320L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="procurement_req_id")
	private Integer id;
	
	@NotNull
	@Column(name = "ref_no",length=16)
	private String refNo;
	
	@NotNull
	@Column(name = "message",length=200)
	private String message;
	
	@Column(name = "is_marked_read",columnDefinition = "TINYINT", length=4)
	private Boolean isMarkedRead;
	
	
	public ProcurementMessageHistory() {
	}
	
	public ProcurementMessageHistory(String refNo, String message, Boolean isMarkedRead) {
		this.refNo = refNo;
		this.message = message;
		this.isMarkedRead = isMarkedRead;
	}

	public Boolean getIsMarkedRead() {
		return isMarkedRead;
	}

	public void setIsMarkedRead(Boolean isMarkedRead) {
		this.isMarkedRead = isMarkedRead;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
