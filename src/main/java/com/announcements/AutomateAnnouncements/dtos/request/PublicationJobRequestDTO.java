package com.announcements.AutomateAnnouncements.dtos.request;

import lombok.Data;

@Data
public class PublicationJobRequestDTO {
    private Integer postDraftId;
    private String status;
}