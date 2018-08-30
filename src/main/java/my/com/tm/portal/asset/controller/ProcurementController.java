package my.com.tm.portal.asset.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import my.com.tm.portal.asset.entity.CompanyConfig;
import my.com.tm.portal.asset.entity.Material;
import my.com.tm.portal.asset.entity.MaterialPricing;
import my.com.tm.portal.asset.entity.ProcurementMessageHistory;
import my.com.tm.portal.asset.entity.ProcurementReq;
import my.com.tm.portal.asset.entity.ProcurementReqLineItem;
import my.com.tm.portal.asset.entity.ProcurementReqLineItemVendor;
import my.com.tm.portal.asset.entity.ReferenceTable;
import my.com.tm.portal.asset.entity.Vendor;
import my.com.tm.portal.asset.model.ResponseStatus;
import my.com.tm.portal.asset.param.DocumentParam;
import my.com.tm.portal.asset.param.ProcurementRefParam;
import my.com.tm.portal.asset.param.ProcurementReqLineItemDTO;
import my.com.tm.portal.asset.param.ProcurementReqLineItemDeleteParam;
import my.com.tm.portal.asset.param.ProcurementReqParam;
import my.com.tm.portal.asset.service.DmsService;
import my.com.tm.portal.asset.service.ProcurementService;

@RequestMapping("/api")
@RestController
public class ProcurementController {

	@Autowired private ProcurementService procurementService;
	@Autowired private DmsService dmsService;
	
	@GetMapping(value = "/procurement/procurement-message-history/{isMarkedRead}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProcurementMessageHistory> getProcurementMessageHistory(@PathVariable Boolean isMarkedRead) {
		return procurementService.getProcurementMessageHistory(isMarkedRead);
	}

	@GetMapping(value = "/procurement/procurement/{refNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> viewProcurement(@PathVariable String refNo) {
		return procurementService.getProcurement(refNo);
	}
	
	@PostMapping(value = "/procurement/save-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveProcurementReq(@RequestBody @Valid ProcurementReq procurementReq, BindingResult result) {
		if (result.hasErrors()) {
			return new ResponseEntity<>(
					new ResponseStatus(
							result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return procurementService.saveProcurementReq(procurementReq);
	}
	
	@PostMapping(value = "/procurement/delete-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deleteProcurementReq(@RequestBody  ProcurementRefParam procurementReq) {
		return procurementService.deleteProcurementReq(procurementReq);
	}
	
	@PostMapping(value = "/procurement/reopen-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> reopenProcurementReq(@RequestBody  ProcurementRefParam procurementReq) {
		return procurementService.reopenProcurementReq(procurementReq);
	}
	
	@PostMapping(value = "/procurement/cancel-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> cancelProcurementReq(@RequestBody  ProcurementRefParam procurementReq) {
		return procurementService.cancelProcurementReq(procurementReq);
	}
	
	@PostMapping(value = "/procurement/submit-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> submitProcurementReq(HttpServletRequest request,@RequestBody @Valid ProcurementReq procurementReq, BindingResult result) throws IllegalAccessException {
		if (result.hasErrors()) {
			return new ResponseEntity<>(
					new ResponseStatus(
							result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage()),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return procurementService.submitProcurementReq(request, procurementReq);
	}
	
	@PostMapping(value = "/procurement/negotiate-procurement-req", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> negotiateProcurementReq(HttpServletRequest request, @RequestBody ProcurementRefParam procurementReq) throws IllegalAccessException {
		return procurementService.negotiateProcurementReq(request, procurementReq);
	}
	
	@PostMapping(value = "/procurement/pr-creation", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> prCreation(@RequestBody ProcurementRefParam procurementReq) {
		return procurementService.prCreation(procurementReq);
	}
		
	@GetMapping(value = "/procurement/materials", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Material> getMaterials() {
		return procurementService.getMaterials();
	}
	
	@GetMapping(value = "/procurement/material/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Material getMaterials(@PathVariable String code) {
		return procurementService.getMaterialsByCode(code);
	}
	
	@GetMapping(value = "/procurement/material-pricing-list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MaterialPricing> getMaterialPricingList() {
		return procurementService.getMaterialPricingList();
	}
	
	@GetMapping(value = "/procurement/vendors", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vendor> getVendors() {
		return procurementService.getVendors();
	}
	
	@GetMapping(value = "/procurement/vendor/{vendorCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vendor getVendor(@PathVariable String vendorCode) {
		return procurementService.getVendorByVendorCode(vendorCode);
	}
		
	@GetMapping(value = "/procurement/procurements", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProcurementReq> getProcurements() {
		return procurementService.getProcurements();
	}
	
	@GetMapping(value = "/procurement/procurements-paging", produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<ProcurementReq> getProcurementsPaging(ProcurementReqParam param) {
		return procurementService.getProcurementsPaging(param);
	}
	
	@GetMapping(value = "/procurement/generate-ref-no", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> generateRefNo() {
		return Collections.singletonMap("refNo",procurementService.generateRefNo()); 
	}

	@GetMapping(value = "/procurement/statuses", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getStatuses(@RequestParam String stage)  {
		return procurementService.getStatuses(stage);
	}

	@GetMapping(value = "/procurement/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getCategories() {
		return procurementService.getCategories();
	}
	
	@GetMapping(value = "/procurement/line-items/{refNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProcurementReqLineItem> getLineItems(String refNo) {
		return procurementService.getLineItems(refNo);
	}
	
	@GetMapping(value = "/procurement/line-item-vendors/{lineItemNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProcurementReqLineItemVendor> getLineItemVendors(String lineItemNo) {
		return procurementService.getLineItemVendors(lineItemNo);
	}

	@GetMapping(value = "/procurement/purchasing-groups", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getPurchasingGroups() {
		return procurementService.getPurchasingGroups();
	}
	
	@GetMapping(value = "/procurement/departments/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getDepartments(@PathVariable String category) {
		return procurementService.getDepartments(category);
	}

	@GetMapping(value = "/procurement/companies", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CompanyConfig> getCompanies()  {
		return procurementService.getCompanies();
	}

	@GetMapping(value = "/procurement/unit-of-measures", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getUnitOfMeasures()  {
		return procurementService.getUnitOfMeasures();
	}

	@GetMapping(value = "/procurement/cost-centre-list/{companyCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> getCostCentreList(@PathVariable String companyCode) {
		return procurementService.getCostCentreList(companyCode);
	}


	@GetMapping(value = "/procurement/approval-history/{procurementReqId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProcurementApprovalHistory(
			@PathVariable final String procurementReqId) {
		return procurementService.getProcurementApprovalHistory(procurementReqId);
	}

	@PostMapping(value = "/procurement/save-line-item", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseStatus> saveProcurementReqLineItem(@RequestBody final ProcurementReqLineItemDTO dto) {
		return procurementService.saveProcurementReqLineItem(dto);
	}

	@PostMapping(value = "/procurement/delete-line-item", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseStatus> deleteProcurementReqLineItem(
			@RequestBody final ProcurementReqLineItemDeleteParam param) {
		return procurementService.deleteProcurementReqLineItem(param);
	}

	@GetMapping(value = "/procurement/get-line-item", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProcurementReqLineItemDTO getProcurementReqLineItem(@RequestParam final Integer procurementReqLineItemId) {
		return procurementService.getProcurementReqLineItem(procurementReqLineItemId);
	}
	
	@GetMapping(value = "/procurement/get-line-item-vendor", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProcurementReqLineItemVendors(@PathVariable String lineItemNo) {
		return procurementService.getProcurementReqLineItemVendors(lineItemNo);
	}
	
	@GetMapping(value = "/procurement/get-line-items", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProcurementReqLineItemDTO> getProcurementReqLineItems(@RequestParam final String referenceNo) {
		return procurementService.getProcurementReqLineItems(referenceNo);
	}
	
	@GetMapping(value = "/procurement/purchase-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPurchaseOrder(@RequestParam String refNo) {
		return procurementService.getPurchaseOrder(refNo);
	}
	@GetMapping(value = "/procurement/documents", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getProcurementDocuments(DocumentParam param) {
		return dmsService.getProcurementDocuments(param);
	}
	
	@PostMapping("/procurement/upload-document")
	public String handleFileUpload(@RequestParam("user-file") MultipartFile multipartFile) throws IOException {

		if (dmsService.uploadDocument(multipartFile)) {
			return "file uploaded";
		}
		return "error";
	}

}
