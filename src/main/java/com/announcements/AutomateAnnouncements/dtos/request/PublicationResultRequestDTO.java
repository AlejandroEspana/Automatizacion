package com.announcements.AutomateAnnouncements.dtos.request;

import lombok.Data;

@Data
public class PublicationResultRequestDTO {
    private String network;
    private String status;
    private String url;
    private String error;
}