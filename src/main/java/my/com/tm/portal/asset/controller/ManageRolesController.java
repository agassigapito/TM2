package my.com.tm.portal.asset.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import my.com.tm.portal.asset.entity.PublicRole;
import my.com.tm.portal.asset.service.ManageCorpSuppRoleService;

@RequestMapping("/api")
@RestController
public class ManageRolesController {

    @Autowired
    private ManageCorpSuppRoleService manageCorpSuppRoleService;

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-roles/roles")
    public ResponseEntity getRoles(@RequestBody PublicRole publicRole){
        return manageCorpSuppRoleService.getRoles(publicRole.getCreatedBy());
    }

    @SuppressWarnings("rawtypes")
	@GetMapping(value = "/manage-roles/permissions")
    public ResponseEntity getPermissions(){
        return manageCorpSuppRoleService.getPermissions();
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-roles/create-role")
    public ResponseEntity createrole(@RequestBody PublicRole publicRole) {
        return manageCorpSuppRoleService.createRole(publicRole);
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-roles/update-role", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateRole(@RequestBody PublicRole publicRole){
        return manageCorpSuppRoleService.updateRole(publicRole);
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-roles/delete-role", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteRole(@RequestBody PublicRole publicRole){
        return manageCorpSuppRoleService.deleteRole(publicRole);
    }


}
