package com.dococ.notification.dto;

import lombok.Data;

@Data
public class NotificationDTO {
    String receiverEmail;

    String emailSubject;

    String emailBody;
}
