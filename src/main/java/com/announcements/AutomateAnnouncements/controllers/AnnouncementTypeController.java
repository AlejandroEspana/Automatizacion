package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/announcementTypes")
public class AnnouncementTypeController {
    @GetMapping("/type")
    public String getAnnouncementType(){
        return "sapoPerro";

    }
    
}
