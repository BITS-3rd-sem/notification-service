package com.dococ.notification.service.impl;

import com.dococ.notification.dto.NotificationDTO;
import com.dococ.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public String sendEmailNotification(NotificationDTO notificationDTO) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("noreply.mydocappointment@gmail.com");
            message.setTo(notificationDTO.getReceiverEmail());
            message.setSubject(notificationDTO.getEmailSubject());
            message.setText(notificationDTO.getEmailBody());
System.out.println("done");
            emailSender.send(message);

            return "Email notification sent successfully";
        } catch (Exception e) {
            return "Failed to send Email notification";
        }

    }
}
