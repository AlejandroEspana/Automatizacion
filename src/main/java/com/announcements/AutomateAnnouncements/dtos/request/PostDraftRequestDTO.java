package com.announcements.AutomateAnnouncements.dtos.request;

import lombok.Data;

@Data
public class PostDraftRequestDTO {
    private String title;
    private String description;
    private Integer assetId;
    private String targets;
    private String status;
}