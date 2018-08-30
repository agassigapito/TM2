package my.com.tm.portal.asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUILDING_CONFIG")
public class BuildingConfig {

	@Id
	@Column(name = "building_config_id")
	private Integer id;

	@Column(name = "building_name")
	private String buildingName;

	@Column(name = "is_public_individual")
	private boolean isPublicIndividual;

	@Column(name = "oversell_percentage")
	private Double oversellPercentage;

	@Column(name = "is_employee_turnstile_allowed")
	private boolean isEmployeeTurnstileAllowed;
	//
	@Column(name = "is_brn_enabled")
	private boolean isBrnEnabled;

	@Column(name = "is_public_corporate")
	private boolean isPublicCorporate;

	@Column(name = "building_code")
	private String buildingCode;

	@Column(name = "company_code")
	private String companyCode;

	public boolean isBrnEnabled() {
		return isBrnEnabled;
	}

	public void setBrnEnabled(boolean isBrnEnabled) {
		this.isBrnEnabled = isBrnEnabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public boolean isPublicIndividual() {
		return isPublicIndividual;
	}

	public void setPublicIndividual(boolean isPublic) {
		this.isPublicIndividual = isPublic;
	}

	public Double getOversellPercentage() {
		return oversellPercentage;
	}

	public void setOversellPercentage(Double oversellPercentage) {
		this.oversellPercentage = oversellPercentage;
	}

	public boolean isEmployeeTurnstileAllowed() {
		return isEmployeeTurnstileAllowed;
	}

	public void setEmployeeTurnstileAllowed(boolean isEmployeeTurnstileAllowed) {
		this.isEmployeeTurnstileAllowed = isEmployeeTurnstileAllowed;
	}

	public String getBuildingCode() {
		return buildingCode;
	}

	public void setBuildingCode(String buildingCode) {
		this.buildingCode = buildingCode;
	}

	public boolean isPublicCorporate() {
		return isPublicCorporate;
	}

	public void setPublicCorporate(boolean isPublicCorporate) {
		this.isPublicCorporate = isPublicCorporate;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

}
