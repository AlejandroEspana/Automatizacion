package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementController {
    @GetMapping("/announcements")
    public String sayHello(){
        return "announcements";
    }
}
