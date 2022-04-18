package com.notification.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailNotificationEvent extends NotificationEvent {

    private String email;

    @Builder
    public EmailNotificationEvent(NotificationPurpose purpose, String email) {
        super(purpose);
        this.email = email;
    }

}
