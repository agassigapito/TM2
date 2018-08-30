package my.com.tm.portal.asset.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.com.tm.portal.asset.model.frontend.eprocurement.TaskStatusParam;
import my.com.tm.portal.asset.service.ProcurementService;

@RequestMapping("/api")
@RestController
public class TaskController {

	@Autowired private ProcurementService procurementService;

	@GetMapping(value = "/task/task-list/{assignee:..+}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTaskList(@PathVariable String assignee) {
		return procurementService.getTaskList(assignee);
	}

	@SuppressWarnings("unchecked")
	@GetMapping(value = "/task/detail/{type}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getTaskDetails(@RequestParam String refNo, @PathVariable String type) {
		if(type.equals("GTO")){
			return procurementService.getTaskDetailsGto(refNo);
		}
		return procurementService.getTaskDetails(refNo);
	}

	@PostMapping(value = "/task/status-update/{type}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateProcurementAndTaskStatus(HttpServletRequest request, @RequestBody @Valid TaskStatusParam taskStatusParam, @PathVariable String type) {
		if(type.equals("GTO")){
			return procurementService.updateGtoAndTaskStatus(request, taskStatusParam);
		}
		return procurementService.updateProcurementAndTaskStatus(request, taskStatusParam);
	}
}
