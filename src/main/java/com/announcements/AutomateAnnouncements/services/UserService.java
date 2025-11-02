package com.announcements.AutomateAnnouncements.services;package com.announcements.AutomateAnnouncements.services;



import java.util.List;import java.util.List;

import java.util.stream.Collectors;import java.util.stream.Collectors;



import org.springframework.stereotype.Service;import org.springframework.stereotype.Service;



import com.announcements.AutomateAnnouncements.dtos.request.UserProfileRequestDTO;import com.announcements.AutomateAnnouncements.dtos.request.UserProfileRequestDTO;

import com.announcements.AutomateAnnouncements.dtos.response.UserProfileResponseDTO;import com.announcements.AutomateAnnouncements.dtos.response.UserProfileResponseDTO;

import com.announcements.AutomateAnnouncements.entities.User;import com.announcements.AutomateAnnouncements.entities.User;

import com.announcements.AutomateAnnouncements.repositories.UserRepository;import com.announcements.AutomateAnnouncements.repositories.UserRepository;



import lombok.RequiredArgsConstructor;@Service

public class UserService {

@Service    private final UserRepository userRepository;

@RequiredArgsConstructor

public class UserService {    public UserService(UserRepository userRepository) {

    private final UserRepository userRepository;        this.userRepository = userRepository;

    }

    public UserProfileResponseDTO createUser(UserProfileRequestDTO requestDTO) {

        User user = new User();    public UserProfileResponseDTO createUser(UserProfileRequestDTO userRequestDTO){

        user.setEmail(requestDTO.getEmail());        User user = new User();

        user.setPassword(requestDTO.getPassword());        user.setEmail(userRequestDTO.getEmail());

        user.setPassword(userRequestDTO.getPassword());

        User savedUser = userRepository.save(user);        User savedUser = userRepository.save(user);

        return mapToResponseDTO(savedUser);

    }        return convertToDTO(savedUser);

    }

    public List<UserProfileResponseDTO> getAllUsers() {

        return userRepository.findAll().stream()    public List<UserProfileResponseDTO> listUsers(){

                .map(this::mapToResponseDTO)        List<User> users = userRepository.findAll();

                .collect(Collectors.toList());        return users.stream().map(this::convertToDTO).collect(Collectors.toList());

    }

    }

    private UserProfileResponseDTO mapToResponseDTO(User user) {

        UserProfileResponseDTO responseDTO = new UserProfileResponseDTO();    private UserProfileResponseDTO convertToDTO(User user){

        responseDTO.setId(user.getId());        UserProfileResponseDTO dto = new UserProfileResponseDTO();

        responseDTO.setEmail(user.getEmail());        dto.setId(user.getId());

        return responseDTO;        dto.setEmail(user.getEmail());

    }        dto.setDisplayName(user.getDisplayName());

}        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }

}
