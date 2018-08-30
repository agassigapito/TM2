package my.com.tm.portal.asset.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import my.com.tm.portal.asset.auditing.Modifiable;

@Entity
@Table(name = "PROCUREMENT_REQ_LINE_ITEM_VENDOR", uniqueConstraints = {@UniqueConstraint(columnNames = {"line_item_no", "is_recommended"})})
public class ProcurementReqLineItemVendor extends Modifiable<String> implements Serializable {

	private static final long serialVersionUID = 2660334019109667491L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="procurement_req_line_item_vendor_id")
	private Integer id;
	
	@NotNull
	@Column(name = "line_item_no",length=20)
	private String lineItemNo;
	
	@NotNull
	@Column(name = "vendor_code",length=10)
	private String vendorCode;

	@NotNull
	@Column(name="vendor_name",length=40)
	private String vendorName;
	
	@NotNull
	@Column(name="unit_of_measure",length=3)
	private String unitOfMeasure;
	
	@NotNull
	@Column(name="unit_price",precision=15,scale=2)
	private BigDecimal unitPrice;
	
	@NotNull
	@Column(name="quantity")
	private Integer quantity;
	
	@NotNull
	@Column(name="total_amount",precision=15,scale=2)
	private BigDecimal totalAmount;
	
	@NotNull
	@Column(name="is_recommended",columnDefinition = "TINYINT", length=4)
	private Boolean isRecommended;
	
	@Column(name="frequency_of_service",length=15)
	private String frequencyOfService;
	
	@Column(name="duration_of_service",length=15)
	private String durationOfService;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "procurement_req_line_item_id")
	@NotNull
	@OnDelete(action = OnDeleteAction.CASCADE)
	private ProcurementReqLineItem procurementReqLineItem;

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public String getFrequencyOfService() {
		return frequencyOfService;
	}

	public void setFrequencyOfService(String frequencyOfService) {
		this.frequencyOfService = frequencyOfService;
	}

	public String getDurationOfService() {
		return durationOfService;
	}

	public void setDurationOfService(String durationOfService) {
		this.durationOfService = durationOfService;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLineItemNo() {
		return lineItemNo;
	}

	public void setLineItemNo(String lineItemNo) {
		this.lineItemNo = lineItemNo;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Boolean getIsRecommended() {
		return isRecommended;
	}

	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
	}

	public ProcurementReqLineItem getProcurementReqLineItem() {
		return procurementReqLineItem;
	}

	public void setProcurementReqLineItem(final ProcurementReqLineItem procurementReqLineItem) {
		this.procurementReqLineItem = procurementReqLineItem;
	}
}
