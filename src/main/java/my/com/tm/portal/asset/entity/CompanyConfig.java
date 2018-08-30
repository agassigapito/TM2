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
@Table(name="COMPANY_CONFIG")
public class CompanyConfig extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = 5162923320133344471L;
	
	@Id
	@Column(name="company_config_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@Column(name="company_code",length=4)
	private String companyCode;
	
	@NotNull
	@Column(name="company_code_description",length=15)
	private String companyCodeDesc;
	
	@NotNull
	@Column(name="company_name",length=70)
	private String companyName;
	
	@NotNull
	@Column(name = "is_used_by_rfa",columnDefinition = "TINYINT", length=4)
	private Boolean isUsedByRfa;

	@Column(name="account_name",length=50)
	private String accountName;
	
	@Column(name="account_number",length=20)
	private String accountNumber;
		
	@Column(name="bank_name",length=50)
	private String bankName;
	
	@Column(name="swift_code",length=15)
	private String swiftCode;

	@Column(name="approver_role",length=60)
	private String approverRole;
	
	
	public String getApproverRole() {
		return approverRole;
	}

	public void setApproverRole(String approverRole) {
		this.approverRole = approverRole;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCodeDesc() {
		return companyCodeDesc;
	}

	public void setCompanyCodeDesc(String companyCodeDesc) {
		this.companyCodeDesc = companyCodeDesc;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Boolean getIsUsedByRfa() {
		return isUsedByRfa;
	}

	public void setIsUsedByRfa(Boolean isUsedByRfa) {
		this.isUsedByRfa = isUsedByRfa;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}
	
}
