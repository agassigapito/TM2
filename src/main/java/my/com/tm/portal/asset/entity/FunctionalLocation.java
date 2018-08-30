package my.com.tm.portal.asset.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FUNCTIONAL_LOCATION", uniqueConstraints = @UniqueConstraint(columnNames = "functional_location_id"))
public class FunctionalLocation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "functional_location_id")
	private Integer functionallocatioId;

	@Column(name = "functional_location")
	@NotNull
	private String functionallocation;

	@Column(name = "description")
	private String description;

	@Column(name = "planning_plant_i")
	private String planningPlantI;
	
	@Column(name = "plant_section")
	private String plantSection;
	
	@Column(name = "building")
	private String building;	
	
	@Column(name = "floor")
	private String floor;	
	
	@Column(name = "unit")
	private String unit;
	
	/**
	 * @return the functionallocatioId
	 */
	public Integer getFunctionallocatioId() {
		return functionallocatioId;
	}

	/**
	 * @param functionallocatioId the functionallocatioId to set
	 */
	public void setFunctionallocatioId(Integer functionallocatioId) {
		this.functionallocatioId = functionallocatioId;
	}

	/**
	 * @return the functionallocation
	 */
	public String getFunctionallocation() {
		return functionallocation;
	}

	/**
	 * @param functionallocation the functionallocation to set
	 */
	public void setFunctionallocation(String functionallocation) {
		this.functionallocation = functionallocation;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the planningPlantI
	 */
	public String getPlanningPlantI() {
		return planningPlantI;
	}

	/**
	 * @param planningPlantI the planningPlantI to set
	 */
	public void setPlanningPlantI(String planningPlantI) {
		this.planningPlantI = planningPlantI;
	}

	/**
	 * @return the plantSection
	 */
	public String getPlantSection() {
		return plantSection;
	}

	/**
	 * @param plantSection the plantSection to set
	 */
	public void setPlantSection(String plantSection) {
		this.plantSection = plantSection;
	}

	/**
	 * @return the building
	 */
	public String getBuilding() {
		return building;
	}

	/**
	 * @param building the building to set
	 */
	public void setBuilding(String building) {
		this.building = building;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
