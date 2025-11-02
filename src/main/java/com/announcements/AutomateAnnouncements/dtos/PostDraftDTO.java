package com.announcements.AutomateAnnouncements.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PostDraftDTO {
    private Integer id;
    private String title;
    private String description;
    private Integer assetId;
    private String targets;
    private String status;
    private LocalDateTime createdAt;
}