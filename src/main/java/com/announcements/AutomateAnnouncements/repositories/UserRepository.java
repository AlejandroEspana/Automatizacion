package com.announcements.AutomateAnnouncements.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.announcements.AutomateAnnouncements.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
