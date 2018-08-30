package my.com.tm.portal.asset.controller;

import my.com.tm.portal.asset.service.PortalLandingPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller that will be use as an interface to get data for customer portal
 * Landing Page .
 */
@RequestMapping("/api")
@RestController
public class PortalLandingPageController {

	@Autowired
	private PortalLandingPageService portalLandingPageService;

	/**
	 * This method will call the service to calculate the user credit information. This
	 * will return the Minimum, Available and Outstanding Credit Amount for each company
	 * base on the input bpnumber. And will calculate the summation PostpaidAmount
	 * from all related company.
	 *
	 * @param bpNumber
	 *            Contains the identifier of the user.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/portal-landing-page/payment-credit-information", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getPaymentCreditInformation(@RequestParam String bpNumber) {
		return portalLandingPageService.getPaymentCreditInfo(bpNumber);
	}

	/**
	 * This method is used to get the utilities consumption per user. it will return
	 * the rental object and will calculate the consumption of Chilled Water,
	 * Electricity, Water and Gas
	 *
	 * @param bpNumber
	 *            Contains the identifier of the user.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/portal-landing-page/utilities-consumption", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getUtilitiesConsumption(@RequestParam String bpNumber) {
		return portalLandingPageService.getUtilitiesConsumption(bpNumber);
	}
}