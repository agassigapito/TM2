package my.com.tm.portal.asset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.tm.portal.asset.dto.TechnicianDTO;
import my.com.tm.portal.asset.service.TechnicianService;

@RequestMapping("/api")
@RestController
public class TechnicianController {

	@Autowired
	private TechnicianService technicianService;

	@GetMapping(value = "/service-request/technicians", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TechnicianDTO>> getTechnicians() {
		return new ResponseEntity<>(technicianService.getTechnicianList(), HttpStatus.OK);
	}

}
