package com.innovation.springweek1.repository;

import com.innovation.springweek1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Long> {

}