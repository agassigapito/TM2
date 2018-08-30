package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import my.com.tm.portal.asset.auditing.Auditable;

@Entity
@Table(name = "PROCUREMENT_REQ_LINE_ITEM", uniqueConstraints = @UniqueConstraint(columnNames = "procurement_req_line_item_id"))
public class ProcurementReqLineItem extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = -2309675326046731830L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="procurement_req_line_item_id")
	private Integer id;

	@ManyToOne(targetEntity = ProcurementReq.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "procurement_req_id")
	@NotNull
	private ProcurementReq procurementReq;

	@NotNull
	@Column(name = "ref_no",length=16)
	private String refNo;

	@NotNull
	@Column(name = "line_item_no",length=20,unique=true)
	private String lineItemNo;

	@NotNull
	@Column(name = "line_item_name",length=40)
	private String lineItemName;

	@NotNull
	@Column(name = "total_amount", precision=15, scale=2)
	private BigDecimal totalAmount;

	@Column(name = "is_billable_to_tenant",columnDefinition = "TINYINT", length=4)
	private Boolean isBillableToTenant;

	@Column(name = "remarks",length=300)
	private String remarks;

	@Column(name = "approval_status",length=20)
	private String approvalStatus;

	@Column(name = "approval_date",length=10)
	private String approvalDate;

	@Column(name = "material_code",length=18)
	private String materialCode;

	@Column(name = "material_name",length=30)
	private String materialName;

	@Column(name = "material_description",length=100)
	private String materialDesc;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "delivery_date")
	private Date deliveryDate;

	@Column(name = "is_has_energy_specification",columnDefinition = "TINYINT", length=4)
	private Boolean isHasEnergySpec;

	@Column(name = "specification",length=300)
	private String specification;

	@Column(name = "lead_time",length=300)
	private String leadTime;

	@Column(name = "life_span",length=300)
	private String lifeSpan;

	@Column(name = "energy_efficiency",length=300)
	private String energyEfficiency;

	@Column(name = "energy_rating",length=4)
	private byte energyRating;

	@Column(name = "operating_lifetime_saving_kwh",length=300)
	private String operatinLifetimeSavingKwh;

	@Column(name = "operating_lifetime_saving_myr",precision=15,scale=2)
	private BigDecimal operatinLifetimeSavingMyr;

	@Column(name = "operating_lifetime_saving_roi",length=300)
	private String operatinLifetimeSavingMyRoi;

	@Column(name = "service_contract_start_date")
	private Date serviceContractStartDate;

	@Column(name = "service_contract_end_date")
	private Date serviceContractEndDate;

	@Column(name = "building",length=8)
	private String building;

	@Column(name = "type_of_service",length=300)
	private String typeOfService;

	@Column(name = "number_of_vendor",length=11)
	private Integer numberOfVendor;
	
	@Column(name = "recommended_vendor_code",length=10)
	private String recommendedVendorCode;

	@Column(name = "is_deleted", columnDefinition = "TINYINT", length=4)
	private Boolean isDeleted = false;

	@OneToMany(mappedBy = "procurementReqLineItem", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProcurementReqLineItemVendor> procurementReqLineItemVendorList = new ArrayList<>();

	
	public String getRecommendedVendorCode() {
		return recommendedVendorCode;
	}

	public void setRecommendedVendorCode(String recommendedVendorCode) {
		this.recommendedVendorCode = recommendedVendorCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getNumberOfVendor() {
		return numberOfVendor;
	}

	public void setNumberOfVendor(Integer numberOfVendor) {
		this.numberOfVendor = numberOfVendor;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialDesc() {
		return materialDesc;
	}

	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Boolean getIsHasEnergySpec() {
		return isHasEnergySpec;
	}

	public void setIsHasEnergySpec(Boolean isHasEnergySpec) {
		this.isHasEnergySpec = isHasEnergySpec;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}

	public String getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(String lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getEnergyEfficiency() {
		return energyEfficiency;
	}

	public void setEnergyEfficiency(String energyEfficiency) {
		this.energyEfficiency = energyEfficiency;
	}

	public byte getEnergyRating() {
		return energyRating;
	}

	public void setEnergyRating(byte energyRating) {
		this.energyRating = energyRating;
	}

	public String getOperatinLifetimeSavingKwh() {
		return operatinLifetimeSavingKwh;
	}

	public void setOperatinLifetimeSavingKwh(String operatinLifetimeSavingKwh) {
		this.operatinLifetimeSavingKwh = operatinLifetimeSavingKwh;
	}

	public BigDecimal getOperatinLifetimeSavingMyr() {
		return operatinLifetimeSavingMyr;
	}

	public void setOperatinLifetimeSavingMyr(BigDecimal operatinLifetimeSavingMyr) {
		this.operatinLifetimeSavingMyr = operatinLifetimeSavingMyr;
	}

	public String getOperatinLifetimeSavingMyRoi() {
		return operatinLifetimeSavingMyRoi;
	}

	public void setOperatinLifetimeSavingMyRoi(String operatinLifetimeSavingMyRoi) {
		this.operatinLifetimeSavingMyRoi = operatinLifetimeSavingMyRoi;
	}

	public Date getServiceContractStartDate() {
		return serviceContractStartDate;
	}

	public void setServiceContractStartDate(Date serviceContractStartDate) {
		this.serviceContractStartDate = serviceContractStartDate;
	}

	public Date getServiceContractEndDate() {
		return serviceContractEndDate;
	}

	public void setServiceContractEndDate(Date serviceContractEndDate) {
		this.serviceContractEndDate = serviceContractEndDate;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
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

	public String getLineItemNo() {
		return lineItemNo;
	}

	public void setLineItemNo(String lineItemNo) {
		this.lineItemNo = lineItemNo;
	}

	public String getLineItemName() {
		return lineItemName;
	}

	public void setLineItemName(String lineItemName) {
		this.lineItemName = lineItemName;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public ProcurementReq getProcurementReq() {
		return procurementReq;
	}

	public void setProcurementReq(ProcurementReq procurementReq) {
		this.procurementReq = procurementReq;
	}

	public Boolean getIsBillableToTenant() {
		return isBillableToTenant;
	}

	public void setIsBillableToTenant(Boolean isBillableToTenant) {
		this.isBillableToTenant = isBillableToTenant;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<ProcurementReqLineItemVendor> getProcurementReqLineItemVendorList() {
		return procurementReqLineItemVendorList;
	}

	public void setProcurementReqLineItemVendorList(
			final List<ProcurementReqLineItemVendor> procurementReqLineItemVendorList) {
		this.procurementReqLineItemVendorList = procurementReqLineItemVendorList;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(final Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}
