package com.announcements.AutomateAnnouncements.dtos.request;

import lombok.Data;

@Data
public class UserProfileRequestDTO {
    private String email;
    private String displayName;
}