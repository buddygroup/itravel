package com.app.common.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.common.dao.entity.UserProfileEntity;

/**
 * Repository : UserProfile.
 */
public interface UserProfileJpaRepository extends JpaRepository<UserProfileEntity, Long> {

}
