package com.dococ.notification.controller;

import com.dococ.notification.dto.NotificationDTO;
import com.dococ.notification.service.AuthenticationService;
import com.dococ.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping
    ResponseEntity<String> sendEmailNotification(@RequestBody NotificationDTO notificationDTO, @RequestHeader String authorization) {
        authenticationService.validateRole(authorization, List.of("PATIENT", "DOCTOR", "ADMIN"));

        return ResponseEntity.ok(notificationService.sendEmailNotification(notificationDTO));
    }
}
