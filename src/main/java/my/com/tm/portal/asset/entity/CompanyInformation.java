package my.com.tm.portal.asset.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "COMPANY_INFORMATION", uniqueConstraints = @UniqueConstraint(columnNames = "contract_number"))
public class CompanyInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "company_information_id")
	private Integer id;

	@Column(name = "organization_name_1", length = 40)
	private String organizationName1;

	@Column(name = "contract_name", length = 80)
	private String contractName;

	@Column(name = "contract_number", nullable = false, length = 13)
	private String contractNumber;

	@Column(name = "contract_type", length = 4)
	private String contractType;

	@Column(name = "bp_number", length = 10)
	private String bpNumber;

	@Column(name = "last_modified_by", length = 50)
	private String lastModifiedBy;

	@Column(name = "last_modified_datetime")
	private Date lastModifieddateTime;

	@Column(name = "created_by", length = 50)
	private String createdBy;

	@Column(name = "created_datetime")
	private Date createdDateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrganizationName1() {
		return organizationName1;
	}

	public void setOrganizationName1(String organizationName1) {
		this.organizationName1 = organizationName1;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifieddateTime() {
		return lastModifieddateTime;
	}

	public void setLastModifieddateTime(Date lastModifieddateTime) {
		this.lastModifieddateTime = lastModifieddateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

}
