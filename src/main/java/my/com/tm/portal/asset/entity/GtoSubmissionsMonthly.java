package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import my.com.tm.portal.asset.auditing.Modifiable;
import org.springframework.data.annotation.Transient;


@Entity
@Table(name = "GTO_SUBMISSIONS_MONTHLY")
public class GtoSubmissionsMonthly extends Modifiable<String> implements Serializable {


    private static final long serialVersionUID = 2721202525435957293L;
    @Id
    @Column(name = "gto_submissions_monthly_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "reference_number")
    private String referenceNumber;

    @Column(name = "contract_number")
    private String contractNumber;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "status")
    private String status;

    @Column(name = "approval_reason")
    private String approvalReason;

    @Column(name = "submitted_by")
    private String submittedBy;

    @Column(name = "submitted_on")
    private Date submittedOn;

    @Column(name = "approved_by")
    private String approvedBy;

    @Basic
    @Column(name = "sales_month")
    private LocalDate salesMonth;

    @Column(name = "is_late")
    private Boolean isLate;

    @Column(name = "total_gross_nett_sales")
    private BigDecimal totalGrossNettSales;

    @Column(name = "attachment_file_name")
    private String attachmentFileName;

    @Column(name = "instance_id")
    private String instanceId;

    @Column(name = "company_code")
    private String companyCode;

    @Transient
    private transient String salesMonthString;

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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

    public Date getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(Date submittedOn) {
        this.submittedOn = submittedOn;
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

    public Boolean getIsLate() {
        return isLate;
    }

    public void setIsLate(Boolean isLate) {
        this.isLate = isLate;
    }

    public BigDecimal getTotalGrossNettSales() {
        return totalGrossNettSales;
    }

    public void setTotalGrossNettSales(BigDecimal totalGrossNettSales) {
        this.totalGrossNettSales = totalGrossNettSales;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Transient
    public String getSalesMonthString() {
        return salesMonth.toString();
    }

    @Transient
    public void setSalesMonthString(String salesMonthString) {
        this.salesMonthString = salesMonthString;
    }

}
