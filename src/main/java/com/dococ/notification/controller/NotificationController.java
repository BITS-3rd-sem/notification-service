package com.dococ.notification.controller;

import com.dococ.notification.dto.NotificationDTO;
import com.dococ.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping
    String sendEmailNotification(@RequestBody NotificationDTO notificationDTO) {
        return notificationService.sendEmailNotification(notificationDTO);
    }
}
