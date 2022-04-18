package com.notification.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SMSNotificationEvent extends NotificationEvent {

    private String phone;

    @Builder
    public SMSNotificationEvent(NotificationPurpose purpose, String phone) {
        super(purpose);
        this.phone = phone;
    }

}
