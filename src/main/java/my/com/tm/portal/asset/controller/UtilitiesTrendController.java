package my.com.tm.portal.asset.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.com.tm.portal.asset.model.frontend.utilitiestrend.CorporateSearchItem;
import my.com.tm.portal.asset.model.frontend.utilitiestrend.UtilitiesTrendParam;
import my.com.tm.portal.asset.service.UtilitiesTrendService;

@RequestMapping("/api")
@RestController
public class UtilitiesTrendController {

	@Autowired
	private UtilitiesTrendService utilitiesTrendService;

	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/utilities-trend/corporate-graph-data", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getCorporateGraphData(HttpServletRequest request,
			@RequestBody @Valid UtilitiesTrendParam utilitiesTrendParam)  {
		return utilitiesTrendService.getMeterConsumptionOrCharges(request, utilitiesTrendParam, false);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/utilities-trend/admin-graph-data", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getAdminGraphData(HttpServletRequest request,
			@RequestBody @Valid UtilitiesTrendParam utilitiesTrendParam)  {
		return utilitiesTrendService.getMeterConsumptionOrCharges(request, utilitiesTrendParam, true);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/utilities-trend/list-utility-meter", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getUtilityMeter(@RequestParam String contractNo, @RequestParam String companyCode,
			@RequestParam String rentalObjectNo) {
		return utilitiesTrendService.getServiceMeter(contractNo, companyCode, rentalObjectNo);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/utilities-trend/company-information", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getCompanyInformation(@RequestBody @Valid CorporateSearchItem filter) {
		return utilitiesTrendService.getCompanyInformation(filter);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/utilities-trend/company-list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getCompanyList() {
		return utilitiesTrendService.getCompanyList();
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/utilities-trend/utility-type-list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getUtilityTypeList() {
		return utilitiesTrendService.getUtilityTypeList();
	}
}
