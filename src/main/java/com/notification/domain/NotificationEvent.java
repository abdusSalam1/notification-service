package com.notification.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationEvent {

    private NotificationPurpose purpose;

    public NotificationEvent(NotificationPurpose purpose) {
        this.purpose = purpose;
    }
}
