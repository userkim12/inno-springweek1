package com.innovation.springweek1.db;

import com.innovation.springweek1.entity.User;
import com.innovation.springweek1.repository.MemberRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductInitializer {
    private final MemberRepository userRepository;

    @PostConstruct
    public void init() {
        User user1 = new User(1, "윤지용", "jyyoon@naver.com", "1234");
        User user2 = new User(2, "손윤주", "yjson@naver.com", "3421");
        User user3 = new User(3, "홍길동", "hong@naver.com", "2351");
        User user4 = new User(4, "신짱구", "jjang@email.com", "9292");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
    }
}
