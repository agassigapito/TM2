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
@Table(name = "MATERIAL")
public class Material extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = -6313910677356030638L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="material_id")
	private Integer id;
	
	@Column(name = "vendor_code",length=10)
	private String vendorCode;
	
	@NotNull
	@Column(name = "material_code",length=18,unique=true)
	private String code;
		
	@Column(name = "material_name",length=40)
	private String name;
	
	@Column(name = "material_type",length=4)
	private String type;
	
	@NotNull
	@Column(name = "unit_of_measure",length=3)
	private String unitOfMeasure;
	
	@NotNull
	@Column(name = "material_group",length=9)
	private String materialGroup;
	
	@NotNull
	@Column(name = "material_group_description",length=20)
	private String materialGroupDesc;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	
	public String getMaterialGroup() {
		return materialGroup;
	}

	public void setMaterialGroup(String materialGroup) {
		this.materialGroup = materialGroup;
	}

	public String getMaterialGroupDesc() {
		return materialGroupDesc;
	}

	public void setMaterialGroupDesc(String materialGroupDesc) {
		this.materialGroupDesc = materialGroupDesc;
	}
}
