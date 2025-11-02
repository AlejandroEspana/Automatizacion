package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/socialNetworks")
public class SocialNetworksController {
    @GetMapping("/socialNetworks")
    public String socialNetworks(){
        return "socialNetworks";
    }
}
