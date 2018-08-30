package my.com.tm.portal.asset.dto;

import my.com.tm.portal.asset.entity.GtoSubmissionsMonthly;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class GtoDTO implements Serializable {

    private Integer id;

    private String referenceNumber;

    private String contractNumber;

    private String contractName;

    private String status;

    private String approvalReason;

    private String submittedBy;

    private Date submittedOn;

    private String approvedBy;

    private LocalDate salesMonth;

    private Boolean isLate;

    private BigDecimal totalGrossNettSales;

    private String attachmentFileName;

    private String instanceId;

    private String salesMonthString;

    private String companyCode;

    public GtoDTO(){

    }

    public GtoDTO(GtoSubmissionsMonthly gtoSubmissionsMonthly){
        this.approvalReason = gtoSubmissionsMonthly.getApprovalReason();
        this.approvedBy = gtoSubmissionsMonthly.getApprovedBy();
        this.attachmentFileName = gtoSubmissionsMonthly.getAttachmentFileName();
        this.contractName = gtoSubmissionsMonthly.getContractName();
        this.contractNumber = gtoSubmissionsMonthly.getContractNumber();
        this.id = gtoSubmissionsMonthly.getId();
        this.instanceId = gtoSubmissionsMonthly.getInstanceId();
        this.isLate = gtoSubmissionsMonthly.getIsLate();
        this.referenceNumber = gtoSubmissionsMonthly.getReferenceNumber();
        this.salesMonth = gtoSubmissionsMonthly.getSalesMonth();
        this.status = gtoSubmissionsMonthly.getStatus();
        this.submittedBy = gtoSubmissionsMonthly.getSubmittedBy();
        this.submittedOn = gtoSubmissionsMonthly.getSubmittedOn();
        this.totalGrossNettSales = gtoSubmissionsMonthly.getTotalGrossNettSales();
        this.companyCode = gtoSubmissionsMonthly.getCompanyCode();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprovalReason() {
        return approvalReason;
    }

    public void setApprovalReason(String approvalReason) {
        this.approvalReason = approvalReason;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public Date getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(Date submittedOn) {
        this.submittedOn = submittedOn;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public LocalDate getSalesMonth() {
        return salesMonth;
    }

    public void setSalesMonth(LocalDate salesMonth) {
        this.salesMonth = salesMonth;
    }

    public Boolean getLate() {
        return isLate;
    }

    public void setLate(Boolean late) {
        isLate = late;
    }

    public BigDecimal getTotalGrossNettSales() {
        return totalGrossNettSales;
    }

    public void setTotalGrossNettSales(BigDecimal totalGrossNettSales) {
        this.totalGrossNettSales = totalGrossNettSales;
    }

    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    public void setAttachmentFileName(String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getSalesMonthString() {
        return salesMonthString;
    }

    public void setSalesMonthString(String salesMonthString) {
        this.salesMonthString = salesMonthString;
    }
}
