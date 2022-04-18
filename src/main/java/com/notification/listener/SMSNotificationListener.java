package com.notification.listener;

import com.notification.domain.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationListener {

    @KafkaListener(topics = "SMS", groupId = "CREATE_ACCOUNT")
    public void listenToSMSTopics(NotificationEvent notificationEvent) {
        System.out.println("Notification sent via sms");
    }
}
