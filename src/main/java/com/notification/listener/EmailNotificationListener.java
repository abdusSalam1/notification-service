package com.notification.listener;

import com.notification.domain.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @KafkaListener(topics = "EMAIL", groupId = "CREATE_ACCOUNT")
    public void listenToEmailTopics(NotificationEvent notificationEvent) {
        System.out.println("Notification sent via email");
    }
}
