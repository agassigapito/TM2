package my.com.tm.portal.asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUILDING")
public class Building {

	@Id
	@Column(name = "building_id")
	private Integer buildingId;

	@Column(name = "building_name")
	private String buildingName;

	@Column(name = "floors")
	private Integer floors;

	@Column(name = "company_code")
	private String companyCode;

	@Column(name = "business_entity")
	private String businessEntity;

	@Column(name = "building_code")
	private String buildingCode;

	@Column(name = "main_usage_type")
	private String mainUsageType;

	@Column(name = "main_usage_type_description")
	private String mainUsageTypeDescription;

	@Column(name = "shortened_name")
	private String shortenedName;
	
	@Column(name = "basement")
	private String basement;
	
	public Integer getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public Integer getNumberOfLevels() {
		return floors;
	}

	public void setNumberOfLevels(Integer floors) {
		this.floors = floors;
	}

	public Integer getFloors() {
		return floors;
	}

	public void setFloors(Integer floors) {
		this.floors = floors;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getBusinessEntity() {
		return businessEntity;
	}

	public void setBusinessEntity(String businessEntity) {
		this.businessEntity = businessEntity;
	}

	public String getMainUsageType() {
		return mainUsageType;
	}

	public void setMainUsageType(String mainUsageType) {
		this.mainUsageType = mainUsageType;
	}

	public String getMainUsageTypeDescription() {
		return mainUsageTypeDescription;
	}

	public void setMainUsageTypeDescription(String mainUsageTypeDescription) {
		this.mainUsageTypeDescription = mainUsageTypeDescription;
	}

	public String getBuildingCode() {
		return buildingCode;
	}

	public void setBuildingCode(String buildingCode) {
		this.buildingCode = buildingCode;
	}

	public String getShortenedName() {
		return shortenedName;
	}

	public void setShortenedName(String shortenedName) {
		this.shortenedName = shortenedName;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

}
