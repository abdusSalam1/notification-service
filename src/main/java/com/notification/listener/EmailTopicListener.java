package com.notification.listener;

import com.notification.domain.NotificationEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailTopicListener {

    @KafkaListener(topics = "EMAIL", groupId = "EMAIL")
    public void listenToEmailTopics(NotificationEvent notificationEvent) {
        System.out.println("Notification sent via email");
    }
}
