package com.announcements.AutomateAnnouncements.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class SocialNetwork {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String tiktokCredentials;
    private String instagramCredentials;
    private String youtubeCredentials;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
