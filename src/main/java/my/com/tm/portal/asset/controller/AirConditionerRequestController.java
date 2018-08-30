package my.com.tm.portal.asset.controller;

import java.util.List;

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

import my.com.tm.portal.asset.model.frontend.airconrequest.AirconRequestItem;
import my.com.tm.portal.asset.param.AirConditionerParam;
import my.com.tm.portal.asset.param.EstimatedTotalAmtParam;
import my.com.tm.portal.asset.param.HolidayParam;
import my.com.tm.portal.asset.service.AirConditionerRequestService;

@RequestMapping("/api")
@RestController
public class AirConditionerRequestController {

	@Autowired
	private AirConditionerRequestService airconRequestService;

	@GetMapping(value = "/air-conditioner-request/aircon-request-list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAirConditionerRequestList(@RequestParam String bpNumber) {
		return airconRequestService.getAirConditionerRequestList(bpNumber);
	}

	@GetMapping(value = "/air-conditioner-request/aircon-request-view", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAirConditionerRequest(@RequestParam Integer acrScheduleId, @RequestParam(required = false) String acrRecurringId) {
		return airconRequestService.getAirConditionerRequest(acrScheduleId, acrRecurringId);
	}

	@PostMapping(value = "/air-conditioner-request/cancel-aircon-request", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCompanyInformation(@RequestBody @Valid List<AirconRequestItem> airconRequests) {
		return airconRequestService.cancelAirconRequest(airconRequests);
	}

	@GetMapping(value = "/air-conditioner-request/rental-units", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRentalUnits(@RequestParam String bPNo) {
		return airconRequestService.getRentalUnits(bPNo);
	}

	@GetMapping(value = "/air-conditioner-request/funcloc-bsnshrs", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPaymentCreditInformation(@RequestParam String userId,
			@RequestParam String companyCode, @RequestParam String contractNo) {
		return airconRequestService.getFunctionalLocationsAndBsnsHrs(userId, companyCode, contractNo);
	}

	@PostMapping(value = "/air-conditioner-request/holidays", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getPublicHoliday(@RequestBody HolidayParam holidayParam) {
		return airconRequestService.getHolidays(holidayParam);
	}

	@PostMapping(value = "/air-conditioner-request/estimated-total-amount", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getOpenBalance(@RequestBody EstimatedTotalAmtParam estimatedTotalAmtParam) {
		return airconRequestService.getOpenBalance(estimatedTotalAmtParam);
	}

	@PostMapping(value = "/air-conditioner-request/create-request", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createAirConditionerRequest(@RequestBody final AirConditionerParam airconRequest) {
		return airconRequestService.createAirConditionerRequest(airconRequest);
	}

}
