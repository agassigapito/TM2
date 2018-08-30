package my.com.tm.portal.asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "BUSINESS_ENTITY", uniqueConstraints = @UniqueConstraint(columnNames = "business_entity_id"))
public class BusinessEntity {
	@Id
	@Column(name = "business_entity_id")
	private Integer businessEntityId;	
	
	@Column(name = "company_code")
	private String companyCode;

	@Column(name = "company_code_name")
	private String companyCodeName;

	@Column(name = "business_entity")
	private String businessEntity;

	@Column(name = "business_entity_name")
	private String businessEntityName;

	public Integer getBusinessEntityId() {
		return businessEntityId;
	}

	public void setBusinessEntityId(Integer businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCodeName() {
		return companyCodeName;
	}

	public void setCompanyCodeName(String companyCodeName) {
		this.companyCodeName = companyCodeName;
	}

	public String getBusinessEntity() {
		return businessEntity;
	}

	public void setBusinessEntity(String businessEntity) {
		this.businessEntity = businessEntity;
	}

	public String getBusinessEntityName() {
		return businessEntityName;
	}

	public void setBusinessEntityName(String businessEntityName) {
		this.businessEntityName = businessEntityName;
	}

}
