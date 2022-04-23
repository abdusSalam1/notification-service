package com.notification.deserializer;

import com.google.gson.Gson;
import com.notification.domain.EmailNotificationEvent;
import com.notification.domain.NotificationEvent;
import com.notification.domain.SMSNotificationEvent;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import java.nio.charset.StandardCharsets;

public class NotificationEventTopicDeserializer implements Deserializer {

    @Override
    public NotificationEvent deserialize(String s, byte[] bytes) {
        try {
            if (bytes == null) {
                return null;
            }
            String data = new String(bytes, StandardCharsets.UTF_8);
            if (StringUtils.containsAnyIgnoreCase(data, "EMAIL"))
                return new Gson().fromJson(data, EmailNotificationEvent.class);
            else
                return new Gson().fromJson(data, SMSNotificationEvent.class);
        } catch (Exception e) {
            throw new SerializationException("Error when deserializing");
        }
    }


}
