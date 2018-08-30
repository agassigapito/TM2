package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "QUOTATION_FEEDBACK")
public class QuotationFeedback implements Serializable {

	private static final long serialVersionUID = 7608140183728738711L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "quotation_feedback_id")
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_request_id")
	@NotNull
	private ServiceRequest serviceRequest;
	
	@Column(name = "quotation_feedback_value", length = 300)
	@NotNull
	private String value;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.NONE)
	@Column(name = "created_datetime")
	@NotNull
	private LocalDateTime createdDateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	
	
	
}
