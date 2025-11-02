package com.announcements.AutomateAnnouncements.dtos;

import lombok.Data;

@Data
public class PublicationResultDTO {
    private Integer id;
    private String network;
    private String status;
    private String url;
    private String error;
}