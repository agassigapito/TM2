package my.com.tm.portal.asset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.tm.portal.asset.param.CreditControlPaymentApiParam;
import my.com.tm.portal.asset.param.TopUpParam;
import my.com.tm.portal.asset.service.CreditControlService;
import my.com.tm.portal.asset.service.PaymentService;


@RequestMapping("/api")
@RestController
public class CreditControlController {

	@Autowired private CreditControlService creditControlService;

	@Autowired private PaymentService paymentService;

	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/credit-control/billing-overview/{email:..+}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getbBillingOverview(@PathVariable String email) {
		return creditControlService.getBillingOverview(email);
	}

	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/credit-control/payment", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity paymentProcess(@RequestBody final CreditControlPaymentApiParam ccParam) {
		return paymentService.postPayment(ccParam);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/credit-control/cheque-details/{companyCode}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getChequeDetails(@PathVariable String companyCode) {
		return paymentService.getChequeDetails(companyCode);
	}

	@SuppressWarnings("rawtypes")
	@PostMapping(value = "/credit-control/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity saveNewPayment(@RequestBody final TopUpParam topUpParam) {
		return paymentService.savePayment(topUpParam.getAmount(),topUpParam.getCompanyCode());
	}

}
