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
@Table(name = "COST_CENTRE")
public class CostCentre extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = -6987624902034490602L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cost_centre_config_id")
	private Integer id;
	
	@NotNull
	@Column(name = "company_code",length=10)
	private String companyCode;
	
	@NotNull
	@Column(name = "cost_centre_code",length=10)
	private String costCentreCode;
	
	@NotNull
	@Column(name = "cost_centre_desc",length=70)
	private String costCentreDesc;
	
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

	
	public String getCostCentreCode() {
		return costCentreCode;
	}

	public void setCostCentreCode(String costCentreCode) {
		this.costCentreCode = costCentreCode;
	}

	public String getCostCentreDesc() {
		return costCentreDesc;
	}

	public void setCostCentreDesc(String costCentreDesc) {
		this.costCentreDesc = costCentreDesc;
	}

	
}
