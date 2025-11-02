package com.announcements.AutomateAnnouncements.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AnnouncementType {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
}
