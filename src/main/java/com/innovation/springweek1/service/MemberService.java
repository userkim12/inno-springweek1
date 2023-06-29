package com.innovation.springweek1.service;

import com.innovation.springweek1.dto.UserResponseDto;
import com.innovation.springweek1.entity.User;
import com.innovation.springweek1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository userRepository;

    public UserResponseDto getOneUser(long userId) {
        User user = userRepository.findById(userId).orElseThrow(NullPointerException::new);

        return new UserResponseDto(user);

    }

    public List<UserResponseDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponseDto::new)
                .collect(Collectors.toList());
    }
}
