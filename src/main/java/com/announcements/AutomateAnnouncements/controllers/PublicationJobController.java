package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.announcements.AutomateAnnouncements.entities.PublicationJob;
import com.announcements.AutomateAnnouncements.repositories.PublicationJobRepository;

@RestController
@RequestMapping("/api/publication-jobs")
public class PublicationJobController {

    @Autowired
    private PublicationJobRepository publicationJobRepository;

    @GetMapping
    public List<PublicationJob> getAllPublicationJobs() {
        return publicationJobRepository.findAll();
    }

    @PostMapping
    public PublicationJob createPublicationJob(@RequestBody PublicationJob publicationJob) {
        return publicationJobRepository.save(publicationJob);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublicationJob> getPublicationJobById(@PathVariable Integer id) {
        return publicationJobRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePublicationJob(@PathVariable Integer id) {
        if (publicationJobRepository.existsById(id)) {
            publicationJobRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}