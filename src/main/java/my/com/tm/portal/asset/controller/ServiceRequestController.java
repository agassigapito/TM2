package my.com.tm.portal.asset.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import my.com.tm.portal.asset.dto.DownloadFileDTO;
import my.com.tm.portal.asset.dto.FileDTO;
import my.com.tm.portal.asset.dto.ListWrapperDTO;
import my.com.tm.portal.asset.dto.ResponseWrapperSingleDTO;
import my.com.tm.portal.asset.dto.RfaRequestInfoDTO;
import my.com.tm.portal.asset.dto.UsePartToolsDTO;
import my.com.tm.portal.asset.entity.Building;
import my.com.tm.portal.asset.entity.FunctionalLocation;
import my.com.tm.portal.asset.entity.ReferenceTable;
import my.com.tm.portal.asset.exception.DmsException;
import my.com.tm.portal.asset.exception.InvalidParamException;
import my.com.tm.portal.asset.exception.NoEntityFoundException;
import my.com.tm.portal.asset.model.ResponseStatus;
import my.com.tm.portal.asset.param.DocumentParam;
import my.com.tm.portal.asset.param.ServiceRequestFileParam;
import my.com.tm.portal.asset.param.ServiceRequestParam;
import my.com.tm.portal.asset.param.ServiceRequestStatusUpdateParam;
import my.com.tm.portal.asset.service.DmsService;
import my.com.tm.portal.asset.service.ServiceRequestFilesService;
import my.com.tm.portal.asset.service.ServiceRequestService;

/**
 * A controller that will call the business logic and implementation for Service
 * Request.
 */
@RequestMapping("/api")
@RestController
public class ServiceRequestController {

	@Autowired
	private ServiceRequestService serviceRequestService;
	@Autowired
	private ServiceRequestFilesService serviceRequestFilesService;
	@Autowired
	private DmsService dmsService;

	/**
	 * Acquire List of Service Request
	 *
	 * @return List of Service Request
	 */
	@GetMapping(value = "/service-request/service-request-list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTaskList() {
		return serviceRequestService.getServiceRequestList();
	}

	/**
	 * This method is used to call the implementation of saving data to Service
	 * Request table.
	 *
	 * @param srParam
	 *            Contains the payload object that are use as input from client.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */

	@PostMapping(value = "/service-request/save-service-request", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseWrapperSingleDTO<Integer> saveServiceRequest(@RequestBody ServiceRequestParam srParam) {
		return serviceRequestService.saveServiceRequest(srParam);
	}

	/**
	 * This method is used to call the implementation of updating Service Request
	 * status.
	 *
	 * @param ServiceRequestStatusUpdateParam
	 *            Object from client side with the update information
	 * @return ResponseEntity Represents the entire HTTP response and will contain
	 *         status, headers and body.
	 */
	@PostMapping(value = "/service-request/service-request-status-update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseStatus> updateServiceRequestStatus(
			@RequestBody final ServiceRequestStatusUpdateParam param) {
		return serviceRequestService.updateServiceRequestStatus(param);
	}

	/**
	 * This method is used to implement get Service Request details from
	 * ServiceRequest table.
	 *
	 * @param serviceRequestNo
	 *            Contains the payload object that are use as input from client.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */

	@GetMapping(value = "/service-request/service-request-detail", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getServiceRequest(@RequestParam final Integer serviceRequestId) {
		return serviceRequestService.getServiceRequest(serviceRequestId);
	}

	/**
	 * This method is used to implement get the list of Area from ReferenceTable.
	 *
	 * @param srParam
	 *            Contains the payload object that are use as input from client.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@GetMapping(value = "/service-request/get-area", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getArea() {
		return serviceRequestService.getArea();
	}

	/**
	 * This method is used to implement the saving to ServiceRequest table.
	 *
	 * @param srParam
	 *            Contains the payload object that are use as input from client.
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@GetMapping(value = "/service-request/get-floor-sap", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Building> getSapFloorSap(String buildingCode, String companyCode) {
		return serviceRequestService.getFloorSap(buildingCode, companyCode);
	}

	/**
	 * This method is used to call the service implementation of getting building
	 * details from table.
	 *
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */

	@GetMapping(value = "/service-request/get-building-sap", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Building> getBuildingSap(String bpNumber) {
		return serviceRequestService.getBuildingSap(bpNumber);
	}

	/**
	 * This method is used to call the service implementation of getting building
	 * details from table.
	 *
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */

	@GetMapping(value = "/service-request/get-buildings", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Building> getBuildings() {
		return serviceRequestService.getBuildings();
	}

	/**
	 * This method is used to call the service implementation of getting Location
	 * from ReferenceTable table.
	 *
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */

	@GetMapping(value = "/service-request/get-location", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FunctionalLocation> getLocation(String buildingCode, String floor, String companyCode) {
		return serviceRequestService.getLocation(buildingCode, floor,  companyCode);
	}

	/**
	 * This method is used to call the service implementation of getting the rental
	 * unit details from SAP.
	 *
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@GetMapping(value = "/service-request/get-rental-unit-sap", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRentalUnitSap(String bpNumber) {
		return serviceRequestService.getRentalUnitSap(bpNumber);
	}

	/**
	 * This method is used to call the service implementation of getting Service
	 * Description from ReferenceTable table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-service-description", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getServiceDescription() {
		return serviceRequestService.getServiceDescription();
	}

	/**
	 * This method is used to call the service implementation of getting
	 * ServiceCategory from ReferenceTable table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-service-category", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getServiceCategory() {
		return serviceRequestService.getServiceCategory();
	}

	/**
	 * This method is used to get Priority LOV list from Reference Table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-priority", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getPriority() {
		return serviceRequestService.getPriority();
	}

	/**
	 * This method is used to get Duration by Day LOV list from Reference Table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-duration-day", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getDurationDay() {
		return serviceRequestService.getDurationDay();
	}

	/**
	 * This method is used to get Duration by Time LOV list from Reference Table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-duration-time", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getDurationTime() {
		return serviceRequestService.getDurationTime();
	}

	/**
	 * This method is used to get Duration bt Minute LOV list from Reference Table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-duration-minute", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getDurationMinute() {
		return serviceRequestService.getDurationMinute();
	}

	/**
	 * This method is used to get Material Category LOV list from Reference Table.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-material-category", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getMaterialCategory() {
		return serviceRequestService.getMaterialCategory();
	}

	/**
	 * This method is used to get Materials Group from SAP master data.
	 *
	 * @return List<ReferenceTable> Represent the object for LOV.
	 */
	@GetMapping(value = "/service-request/get-materials-group", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ReferenceTable> getMaterialsGroup() {
		return serviceRequestService.getMaterialsGroup();
	}

	/**
	 * This method is used to get Materials that are obtained from SAP Master Data
	 * Material.
	 *
	 * @return ResponseEntity Represent the entire HTTP response it will contain
	 *         status, headers and body.
	 */
	@GetMapping(value = "/service-request/get-materials", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getMaterials() {
		return serviceRequestService.getMaterials();
	}

	@PostMapping(value = "/service-request/rectification-information", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ResponseStatus> createRectificationInformation(@Valid ServiceRequestFileParam param,
			@RequestPart MultipartFile file, BindingResult result) throws DmsException, InvalidParamException {
		if (result.hasErrors()) {
			throw new InvalidParamException(
					result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage());
		}
		return new ResponseEntity<>(serviceRequestFilesService.createServiceRequestImage(param, file), HttpStatus.OK);
	}

	@GetMapping(value = "/service-request/rectification-information/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListWrapperDTO<FileDTO>> getRectificationInformation(
			@PathVariable Integer id) {
		return new ResponseEntity<>(serviceRequestFilesService.getServiceRequestRectification(id), HttpStatus.OK);
	}

	@GetMapping(value = "/service-request/inspection-information/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListWrapperDTO<FileDTO>> getInspectionInformation(
			@PathVariable Integer id) {
		return new ResponseEntity<>(serviceRequestFilesService.getServiceRequestInspection(id), HttpStatus.OK);
	}

	/**
	 * This method is used to download the Service Request related files from the DMS.
	 * @param param
	 * @return
	 * @throws NoEntityFoundException
	 */
	@GetMapping(value = "/service-request/documents", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DownloadFileDTO> getServiceRequestFiles(DocumentParam param)
			throws NoEntityFoundException {
		return dmsService.downloadImageByFileName(param);
	}

	@GetMapping(value = "/service-request/used-tool-parts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListWrapperDTO<UsePartToolsDTO>> getUsedToolParts(Integer serviceRequestId) {
		return serviceRequestService.getUsedToolParts(serviceRequestId);
	}

	@GetMapping(value = "/service-request/rfa-request-info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RfaRequestInfoDTO> getRfaRequestInfo(
			@PathVariable Integer id) {
		return new ResponseEntity<>(serviceRequestService.getRfaRequestInfo(id), HttpStatus.OK);
	}

	@PostMapping(value = "/service-request/documents", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ResponseStatus> createServiceRequestDoc(@Valid ServiceRequestFileParam param,
			@RequestPart MultipartFile file, BindingResult result) throws DmsException, InvalidParamException {
		if (result.hasErrors()) {
			throw new InvalidParamException(
					result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage());
		}
		return new ResponseEntity<>(serviceRequestFilesService.createServiceRequestDoc(param, file), HttpStatus.OK);
	}

	@GetMapping(value = "/service-request/rfa-request-info/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ListWrapperDTO<String>> getRfaCategories() {
		return new ResponseEntity<>(serviceRequestService.getRfaCategories(), HttpStatus.OK);
	}

	@PostMapping(value = "/service-request/inspection-information", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<ResponseStatus> createServiceRequestInspection(@Valid ServiceRequestFileParam param,
			@RequestPart MultipartFile file, BindingResult result) throws DmsException, InvalidParamException, NoEntityFoundException {
		if (result.hasErrors()) {
			throw new InvalidParamException(
					result.getFieldError().getField() + " " + result.getFieldError().getDefaultMessage());
		}
		return new ResponseEntity<>(serviceRequestFilesService.createServiceRequestInspection(param, file), HttpStatus.OK);
	}


}
