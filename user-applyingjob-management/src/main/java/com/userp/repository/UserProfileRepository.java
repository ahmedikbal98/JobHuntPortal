package com.userp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userp.entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
