package my.com.tm.portal.asset.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * @author ariel.bisnar
 *
 */
@Entity
@Table(name = "ACR_SCHEDULE", uniqueConstraints = @UniqueConstraint(columnNames = "acr_schedule_id"))
public class AcrSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acr_schedule_id")
	private Integer acrScheduleId;

	@Column(name = "bp_number")
	@NotNull
	private String bpNumber;

	@Column(name = "acr_no")
	@NotNull
	private String acrNo;

	@Column(name = "acr_recurring_id")
	private String acrRecurringId;

	@Column(name = "status")
	@NotNull
	private String status;

	@Column(name = "scheduled_start")
	@NotNull
	private Date scheduledStart;

	@Column(name = "scheduled_end")
	@NotNull
	private Date scheduledEnd;

	@Column(name = "schedule_info")
	@NotNull
	private String scheduleInfo;

	@Column(name = "day")
	private String day;

	@Column(name = "is_holiday")
	private boolean isHoliday;

	@Column(name = "estimated_total_amt")
	@NotNull
	private BigDecimal estimatedTotalAmt;

	@Column(name = "last_modified_date")
	@NotNull
	private Date lastModifiedDate;

	@Column(name = "rental_unit")
	@NotNull
	private String rentalUnit;

	@Column(name = "agreement_number")
	@NotNull
	private String agreementNumber;

	@Column(name = "company_code")
	@NotNull
	private String companyCode;

	@Column(name = "acr_rate")
	@NotNull
	private BigDecimal acrRate;

	@Column(name = "acr_rate_unit")
	@NotNull
	private String acrRateUnit;

	@Column(name = "duration_hours")
	@NotNull
	private Integer durationHours;

	@Column(name = "cancellation_request_date")
	private Date cancellationRequestDate;

	@Column(name = "cancel_provisioning_date")
	private Date cancelProvisioningDate;

	@Column(name = "last_modified_by")
	@NotNull
	private String lastModifiedBy;

	@OneToMany(mappedBy = "acrSchedule", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AcrFunctionalLocationDetail> functionalLocationList = new ArrayList<AcrFunctionalLocationDetail>();

	public Integer getAcrScheduleId() {
		return acrScheduleId;
	}

	public void setAcrScheduleId(final Integer acrScheduleId) {
		this.acrScheduleId = acrScheduleId;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(final String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getAcrNo() {
		return acrNo;
	}

	public void setAcrNo(final String acrNo) {
		this.acrNo = acrNo;
	}

	/**
	 * @return the acrRecurringId
	 */
	public String getAcrRecurringId() {
		return acrRecurringId;
	}

	/**
	 * @param acrRecurringId the acrRecurringId to set
	 */
	public void setAcrRecurringId(String acrRecurringId) {
		this.acrRecurringId = acrRecurringId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public Date getScheduledStart() {
		return scheduledStart;
	}

	public void setScheduledStart(final Date scheduledStart) {
		this.scheduledStart = scheduledStart;
	}

	public Date getScheduledEnd() {
		return scheduledEnd;
	}

	public void setScheduledEnd(final Date scheduledEnd) {
		this.scheduledEnd = scheduledEnd;
	}

	public String getScheduleInfo() {
		return scheduleInfo;
	}

	public void setScheduleInfo(final String scheduleInfo) {
		this.scheduleInfo = scheduleInfo;
	}

	public String getDay() {
		return day;
	}

	public void setDay(final String day) {
		this.day = day;
	}

	public boolean isHoliday() {
		return isHoliday;
	}

	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}

	public BigDecimal getEstimatedTotalAmt() {
		return estimatedTotalAmt;
	}

	public void setEstimatedTotalAmt(final BigDecimal estimatedTotalAmt) {
		this.estimatedTotalAmt = estimatedTotalAmt;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(final Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getRentalUnit() {
		return rentalUnit;
	}

	public void setRentalUnit(final String rentalUnit) {
		this.rentalUnit = rentalUnit;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(final String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(final String companyCode) {
		this.companyCode = companyCode;
	}

	public BigDecimal getAcrRate() {
		return acrRate;
	}

	public void setAcrRate(final BigDecimal acrRate) {
		this.acrRate = acrRate;
	}

	public String getAcrRateUnit() {
		return acrRateUnit;
	}

	public void setAcrRateUnit(final String acrRateUnit) {
		this.acrRateUnit = acrRateUnit;
	}

	public Integer getDurationHours() {
		return durationHours;
	}

	public void setDurationHours(final Integer durationHours) {
		this.durationHours = durationHours;
	}

	public Date getCancellationRequestDate() {
		return cancellationRequestDate;
	}

	public void setCancellationRequestDate(final Date cancellationRequestDate) {
		this.cancellationRequestDate = cancellationRequestDate;
	}

	public Date getCancelProvisioningDate() {
		return cancelProvisioningDate;
	}

	public void setCancelProvisioningDate(final Date cancelProvisioningDate) {
		this.cancelProvisioningDate = cancelProvisioningDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(final String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public List<AcrFunctionalLocationDetail> getFunctionalLocationList() {
		return functionalLocationList;
	}

	public void setFunctionalLocationList(final List<AcrFunctionalLocationDetail> functionalLocationList) {
		this.functionalLocationList = functionalLocationList;
	}
}
