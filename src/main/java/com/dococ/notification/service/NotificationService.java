package com.dococ.notification.service;

import com.dococ.notification.dto.NotificationDTO;

public interface NotificationService {

    String sendEmailNotification(NotificationDTO notificationDTO);
}
