package com.app.common.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.common.dao.entity.GroupContentsEntity;

/**
 * Repository : GroupContents.
 */
public interface GroupContentsJpaRepository extends JpaRepository<GroupContentsEntity, Integer> {

}
