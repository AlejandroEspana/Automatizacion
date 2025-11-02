package com.announcements.AutomateAnnouncements.dtos.request;

import lombok.Data;

@Data
public class AssetRequestDTO {
    private Integer owner;
    private String type;
    private String source;
    private String blobUrl;
}