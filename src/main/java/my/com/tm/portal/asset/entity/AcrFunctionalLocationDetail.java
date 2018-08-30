package my.com.tm.portal.asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * @author ariel.bisnar
 *
 */
@Entity
@Table(name = "ACR_FUNCTIONAL_LOCATION_DETAIL", uniqueConstraints = @UniqueConstraint(columnNames = "acr_functional_location_detail_id"))
public class AcrFunctionalLocationDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acr_functional_location_detail_id")
	private Integer acrFunctionalLocationDetailId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "acr_schedule_id")
	@NotNull
	private AcrSchedule acrSchedule;

	@Column(name = "functional_location")
	@NotNull
	private String functionalLocation;

	@Column(name = "ibms_reference_number")
	private String ibmsReferenceNumber;

	@Column(name = "ibms_response_status")
	private String ibmsResponseStatus;

	public Integer getAcrFunctionalLocationDetailId() {
		return acrFunctionalLocationDetailId;
	}

	public AcrSchedule getAcrSchedule() {
		return acrSchedule;
	}

	public void setAcrSchedule(final AcrSchedule acrSchedule) {
		this.acrSchedule = acrSchedule;
	}

	public void setAcrFunctionalLocationDetailId(final Integer acrFunctionalLocationDetailId) {
		this.acrFunctionalLocationDetailId = acrFunctionalLocationDetailId;
	}

	public String getFunctionalLocation() {
		return functionalLocation;
	}

	public void setFunctionalLocation(final String functionalLocation) {
		this.functionalLocation = functionalLocation;
	}

	public String getIbmsReferenceNumber() {
		return ibmsReferenceNumber;
	}

	public void setIbmsReferenceNumber(final String ibmsReferenceNumber) {
		this.ibmsReferenceNumber = ibmsReferenceNumber;
	}

	public String getIbmsResponseStatus() {
		return ibmsResponseStatus;
	}

	public void setIbmsResponseStatus(final String ibmsResponseStatus) {
		this.ibmsResponseStatus = ibmsResponseStatus;
	}
}
