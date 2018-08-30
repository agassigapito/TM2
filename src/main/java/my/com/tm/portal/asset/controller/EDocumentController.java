package my.com.tm.portal.asset.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import my.com.tm.portal.asset.param.DocumentParam;
import my.com.tm.portal.asset.service.DmsService;

@RestController
@RequestMapping("/api")
public class EDocumentController {

	@Autowired private DmsService dmsService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/e-document/documents", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getDocuments(DocumentParam param) {
		return dmsService.getDocumentsByDateRange(param);
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "/e-document/json-document", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getJsonDocument(HttpServletResponse response, @RequestParam Integer documentId, @ApiParam(value = "BL, CN, OR", required = true)  @RequestParam String documentType) {
		return dmsService.downloadFile(documentId, documentType);
	}
}
