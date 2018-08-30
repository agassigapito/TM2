package my.com.tm.portal.asset.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * @author ariel.bisnar
 *
 */
@Entity
@Table(name = "ACR_TENANT_KWH", uniqueConstraints = @UniqueConstraint(columnNames = "acr_tenant_kwh_id"))
public class AcrTenantKwh {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "acr_tenant_kwh_id")
	private Integer acrTenantKwhId;

	@Column(name = "agreement_number")
	@NotNull
	private String agreementNumber;

	@Column(name = "estimated_consumption")
	@NotNull
	private BigDecimal estimatedConsumption;

	public Integer getAcrTenantKwhId() {
		return acrTenantKwhId;
	}

	public void setAcrTenantKwhId(Integer acrTenantKwhId) {
		this.acrTenantKwhId = acrTenantKwhId;
	}

	public String getAgreementNumber() {
		return agreementNumber;
	}

	public void setAgreementNumber(String agreementNumber) {
		this.agreementNumber = agreementNumber;
	}

	public BigDecimal getEstimatedConsumption() {
		return estimatedConsumption;
	}

	public void setEstimatedConsumption(BigDecimal estimatedConsumption) {
		this.estimatedConsumption = estimatedConsumption;
	}
}
