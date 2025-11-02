package com.announcements.AutomateAnnouncements.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.announcements.AutomateAnnouncements.entities.PostDraft;
import com.announcements.AutomateAnnouncements.repositories.PostDraftRepository;

@RestController
@RequestMapping("/api/post-drafts")
public class PostDraftController {

    @Autowired
    private PostDraftRepository postDraftRepository;

    @GetMapping
    public List<PostDraft> getAllPostDrafts() {
        return postDraftRepository.findAll();
    }

    @PostMapping
    public PostDraft createPostDraft(@RequestBody PostDraft postDraft) {
        return postDraftRepository.save(postDraft);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDraft> getPostDraftById(@PathVariable Integer id) {
        return postDraftRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePostDraft(@PathVariable Integer id) {
        if (postDraftRepository.existsById(id)) {
            postDraftRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}