package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.announcements.AutomateAnnouncements.entities.PublicationResult;
import com.announcements.AutomateAnnouncements.repositories.PublicationResultRepository;

@RestController
@RequestMapping("/api/publication-results")
public class PublicationResultController {

    @Autowired
    private PublicationResultRepository publicationResultRepository;

    @GetMapping
    public List<PublicationResult> getAllPublicationResults() {
        return publicationResultRepository.findAll();
    }

    @PostMapping
    public PublicationResult createPublicationResult(@RequestBody PublicationResult publicationResult) {
        return publicationResultRepository.save(publicationResult);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublicationResult> getPublicationResultById(@PathVariable Integer id) {
        return publicationResultRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePublicationResult(@PathVariable Integer id) {
        if (publicationResultRepository.existsById(id)) {
            publicationResultRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}