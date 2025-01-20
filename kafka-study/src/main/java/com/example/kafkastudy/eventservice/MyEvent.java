package com.example.kafkastudy.eventservice;

import java.util.Map;

public class MyEvent {
    private String eventId;
    private Map<String, Object> myData;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Map<String, Object> getMyData() {
        return myData;
    }

    public void setMyData(Map<String, Object> myData) {
        this.myData = myData;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "eventId='" + eventId + '\'' +
                ", myData=" + myData +
                '}';
    }
}
