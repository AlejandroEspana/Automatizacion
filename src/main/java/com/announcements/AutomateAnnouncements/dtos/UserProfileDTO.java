package com.announcements.AutomateAnnouncements.dtos;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserProfileDTO {
    private Integer id;
    private String email;
    private String displayName;
    private LocalDateTime createdAt;
}