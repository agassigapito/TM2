package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import my.com.tm.portal.asset.auditing.Modifiable;

@Entity
@Table(name = "MATERIAL_PRICING")
public class MaterialPricing extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = 7656702717680038105L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="material_pricing_id")
	private Integer id;
	
	@NotNull
	@Column(name = "material_code",length=18)
	private String materialCode;
	
	@NotNull
	@Column(name = "condition_type",length=4)
	private String conditionType;
	
	@NotNull
	@Column(name = "sales_organization",length=4)
	private String salesOrg;
		
	@NotNull
	@Column(name = "amount",precision=11,scale=2)
	private BigDecimal amount;
	
	@NotNull
	@Column(name = "currency",length=5)
	private String currency;
	
	@NotNull
	@Column(name = "per_unit",length=5)
	private String perUnit;
	
	@NotNull
	@Column(name = "unit_of_measure",length=3)
	private String unitOfMeasure;
	
	@NotNull
	@Column(name = "valid_from")
	private Date validFrom;
	
	@NotNull
	@Column(name = "valid_to")
	private Date validTo;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getConditionType() {
		return conditionType;
	}

	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}

	public String getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPerUnit() {
		return perUnit;
	}

	public void setPerUnit(String perUnit) {
		this.perUnit = perUnit;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}
}
