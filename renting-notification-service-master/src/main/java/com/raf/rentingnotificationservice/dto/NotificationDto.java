package com.raf.rentingnotificationservice.dto;

public class NotificationDto {
    private Long id;
    private String type;
    private String parameters;
    private String text;
//    private String recever;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public String getRecever() {
//        return recever;
//    }
//
//    public void setRecever(String recever) {
//        this.recever = recever;
//    }
}
