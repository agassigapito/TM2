/**
 * 
 */
package my.com.tm.portal.asset.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import my.com.tm.portal.asset.auditing.Modifiable;

/**
 * @author ariel.bisnar
 *
 */
@Entity
@Table(name = "SERVICE_RATING")
public class ServiceRating extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = -5193319392472825394L;

	@Id
	@Column(name = "service_rating_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serviceRatingId;

	@NotNull
	@ManyToOne(targetEntity = ServiceRequest.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "service_request_id")
	private ServiceRequest serviceRequest;

	@NotNull
	@Column(name="speedy_response_rating", length=4)
	private byte speedyResponseRating;

	@NotNull
	@Column(name="quality_of_work_rating", length=4)
	private byte qualityOfWorkRating;

	@NotNull
	@Column(name="staffs_attitude_rating", length=4)
	private byte staffsAttitudeRating;

	@NotNull
	@Column(name="communication_skills_rating", length=4)
	private byte communicationSkillsRating;

	@NotNull
	@Column(name="acknowledged_by", length=30)
	private String acknowledgedBy;

	@NotNull
	@Column(name="id_number", length=15)
	private String idNumber;

	public Integer getServiceRatingId() {
		return serviceRatingId;
	}

	public void setServiceRatingId(final Integer serviceRatingId) {
		this.serviceRatingId = serviceRatingId;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(final ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public byte getSpeedyResponseRating() {
		return speedyResponseRating;
	}

	public void setSpeedyResponseRating(final byte speedyResponseRating) {
		this.speedyResponseRating = speedyResponseRating;
	}

	public byte getQualityOfWorkRating() {
		return qualityOfWorkRating;
	}

	public void setQualityOfWorkRating(final byte qualityOfWorkRating) {
		this.qualityOfWorkRating = qualityOfWorkRating;
	}

	public byte getStaffsAttitudeRating() {
		return staffsAttitudeRating;
	}

	public void setStaffsAttitudeRating(final byte staffsAttitudeRating) {
		this.staffsAttitudeRating = staffsAttitudeRating;
	}

	public byte getCommunicationSkillsRating() {
		return communicationSkillsRating;
	}

	public void setCommunicationSkillsRating(final byte communicationSkillsRating) {
		this.communicationSkillsRating = communicationSkillsRating;
	}

	public String getAcknowledgedBy() {
		return acknowledgedBy;
	}

	public void setAcknowledgedBy(final String acknowledgedBy) {
		this.acknowledgedBy = acknowledgedBy;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(final String idNumber) {
		this.idNumber = idNumber;
	}
}
