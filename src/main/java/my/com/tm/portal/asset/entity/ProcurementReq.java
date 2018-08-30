package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import my.com.tm.portal.asset.auditing.Auditable;
import my.com.tm.portal.asset.param.ProcurementReqParam;

@Entity
@Table(name = "PROCUREMENT_REQ")
public class ProcurementReq extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = -6439789073648644446L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "procurement_req_id")
	private Integer id;

	@NotNull
	@Column(name = "ref_no", unique = true, length = 16)
	private String refNo;

	@Column(name = "wso2_instance_id", length = 16)
	private String wso2InstanceId;

	@NotNull
	@Column(name = "status", length = 30)
	private String status;

	@NotNull
	@Column(name = "stage", length = 25)
	private String stage;

	@NotNull
	@Column(name = "category_code", length = 25)
	private String category;

	@NotNull
	@Column(name = "description", length = 40)
	private String description;

	@Column(name = "work_order_no", length = 40)
	private String workOrderNo;

	@NotNull
	@Column(name = "company_code", length = 5)
	private String companyCode;

	@Column(name = "cost_centre_config_id")
	private Integer costCentreId;

	@Column(name = "department", length = 20)
	private String department;

	@Column(name = "remarks", length = 300)
	private String remarks;

	@Column(name = "purchasing_group_code", length = 5)
	private String purchasingGroupCode;

	@Column(name = "purchase_req_no", length = 10)
	private String purchaseReqNo;

	@Column(name = "pr_created_date")
	private Date prCreatedDate;

	@Column(name = "total_of_all_line_items", precision = 15, scale = 2)
	private BigDecimal totalOfAllLineItems;

	@Column(name = "total_billable_amount", precision = 15, scale = 2)
	private BigDecimal totalBillableAmount;

	@Column(name = "is_deleted", columnDefinition = "TINYINT", length = 4)
	private Boolean isDeleted;

	@Column(name = "is_locked", columnDefinition = "TINYINT", length = 4)
	private Boolean isLocked;

	@JsonIgnore
	@OneToMany(mappedBy = "procurementReq")
	private List<ProcurementReqLineItem> procurementReqLineItemList = new ArrayList<>();

	@Transient
	private String companyName;
	@Transient
	private String plantCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_request_id")
	private ServiceRequest serviceRequest;

	public ProcurementReq() {
	}

	public ProcurementReq(String refNo) {
		this.refNo = refNo;
	}

	public ProcurementReq(ProcurementReqParam param) {
		this.status = param.getStatus();
		this.stage = param.getStage();
		this.refNo = param.getRefNo();
		this.category = param.getCategory();
		this.description = param.getDescription();
		this.workOrderNo = param.getWorkOrderNo();
		this.companyName = param.getCompany();
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWso2InstanceId() {
		return wso2InstanceId;
	}

	public void setWso2InstanceId(String wso2InstanceId) {
		this.wso2InstanceId = wso2InstanceId;
	}

	public Integer getCostCentreId() {
		return costCentreId;
	}

	public void setCostCentreId(Integer costCentreId) {
		this.costCentreId = costCentreId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPurchaseReqNo() {
		return purchaseReqNo;
	}

	public void setPurchaseReqNo(String purchaseReqNo) {
		this.purchaseReqNo = purchaseReqNo;
	}

	public Date getPrCreatedDate() {
		return prCreatedDate;
	}

	public void setPrCreatedDate(Date prCreatedDate) {
		this.prCreatedDate = prCreatedDate;
	}

	public BigDecimal getTotalOfAllLineItems() {
		return totalOfAllLineItems;
	}

	public void setTotalOfAllLineItems(BigDecimal totalOfAllLineItems) {
		this.totalOfAllLineItems = totalOfAllLineItems;
	}

	public BigDecimal getTotalBillableAmount() {
		return totalBillableAmount;
	}

	public void setTotalBillableAmount(BigDecimal totalBillableAmount) {
		this.totalBillableAmount = totalBillableAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWorkOrderNo() {
		return workOrderNo;
	}

	public void setWorkOrderNo(String workOrderNo) {
		this.workOrderNo = workOrderNo;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPurchasingGroupCode() {
		return purchasingGroupCode;
	}

	public void setPurchasingGroupCode(String purchasingGroupCode) {
		this.purchasingGroupCode = purchasingGroupCode;
	}

	public List<ProcurementReqLineItem> getProcurementReqLineItemList() {
		return procurementReqLineItemList;
	}

	public void setProcurementReqLineItemList(List<ProcurementReqLineItem> procurementReqLineItemList) {
		this.procurementReqLineItemList = procurementReqLineItemList;
	}

	public ServiceRequest getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(ServiceRequest serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

}
