package com.announcements.AutomateAnnouncements.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AssetDTO {
    private Integer id;
    private Integer owner;
    private String type;
    private String source;
    private String blobUrl;
    private LocalDateTime createdAt;
}