package com.announcements.AutomateAnnouncements.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PublicationJobDTO {
    private Integer id;
    private Integer postDraftId;
    private String status;
    private LocalDateTime requestedAt;
}