package com.innovation.springweek1.controller;

import com.innovation.springweek1.dto.UserResponseDto;
import com.innovation.springweek1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getMemberInfo(@PathVariable long id) {
        try {
            return ResponseEntity.ok(userService.getOneUser(id));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getMemberList() {
        List<UserResponseDto> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }
}
