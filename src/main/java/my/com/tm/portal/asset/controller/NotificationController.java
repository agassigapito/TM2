package my.com.tm.portal.asset.controller;

import my.com.tm.portal.asset.model.ResponseStatus;
import my.com.tm.portal.asset.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/api")
@RestController
public class NotificationController {

    @Autowired private NotificationService notificationService;
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping("/notification")
    public ResponseEntity<?> sampleGet(@RequestParam String name){
        return notificationService.getNotif(name);
    }

    @PostMapping("/notification/sample")
    public ResponseEntity<?> sample(){
        notificationService.createNotif();
        return new ResponseEntity<ResponseStatus>( new ResponseStatus("OK"), HttpStatus.OK);
    }

    @GetMapping("/notification/public")
    public ResponseEntity<?> sampleGetPublic(@RequestParam String name){
        return notificationService.getNotifPublic(name);
    }

    @PostMapping("/notification/sample/public")
    public ResponseEntity<?> samplePublic(@RequestParam String name){
        notificationService.createNotifPublic(name);
        return new ResponseEntity<ResponseStatus>( new ResponseStatus("OK"), HttpStatus.OK);
    }

    @MessageMapping("/hello")
    //@SendTo("/topic/msg")
    public void greeting(SimpMessageHeaderAccessor sha, Map message) throws InterruptedException {
        Thread.sleep(1000);
        simpMessagingTemplate.convertAndSendToUser(sha.getUser().getName(), "/topic/msg", message);
        //return new Message(message.getMsg() + " yow");

    }
}
