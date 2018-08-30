package my.com.tm.portal.asset.controller;

import my.com.tm.portal.asset.entity.PublicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.com.tm.portal.asset.entity.PublicAccount;
import my.com.tm.portal.asset.service.ManageCorpSuppAccountService;

@RequestMapping("/api")
@RestController
public class ManagePublicAccountController {

    @Autowired private ManageCorpSuppAccountService manageCorpSuppAccountService;

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-public-account/public-accounts")
    public ResponseEntity getPublicAccounts(@RequestBody PublicAccount account) {
        return manageCorpSuppAccountService.getPublicAccounts(account.getCreatedBy());
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-public-account/change-status/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity changeStatus(@PathVariable("id")Integer id) {
        return manageCorpSuppAccountService.changeStatus(id);
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-public-account/create-account")
    public ResponseEntity createAccount(@RequestBody PublicUser account) {
        return manageCorpSuppAccountService.createAccount(account);
    }

    @SuppressWarnings("rawtypes")
	@PostMapping(value = "/manage-public-account/assign-role", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity assignRole(@RequestBody PublicUser account) {
        return manageCorpSuppAccountService.assignRole(account);
    }


}
