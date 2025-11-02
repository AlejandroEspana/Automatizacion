package com.announcements.AutomateAnnouncements.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.announcements.AutomateAnnouncements.dtos.UserRequestDTO;
import com.announcements.AutomateAnnouncements.dtos.UserResponseDTO;
import com.announcements.AutomateAnnouncements.entities.User;
import com.announcements.AutomateAnnouncements.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO){
        User user = new User();
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword());
        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);
    }

    public List<UserResponseDTO> listUsers(){
        List<User> users = userRepository.findAll();
        return users.stream().map(this::convertToDTO).collect(Collectors.toList());

    }

    private UserResponseDTO convertToDTO(User user){
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        return dto;
    }

}
